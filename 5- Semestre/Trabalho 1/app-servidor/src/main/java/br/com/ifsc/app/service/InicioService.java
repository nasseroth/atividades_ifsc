package br.com.ifsc.app.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import br.com.ifsc.util.CalculosUtil;
import br.com.ifsc.util.ManipuladorArquivo;

@Service
public class InicioService {

	private static String pathVMP = "C:\\Users\\Nasser\\Documents\\workspace-spring-tool-suite-4-4.12.0.RELEASE\\paralelismo_com_threads.zip_expanded\\Paralelismo/output_vmp.txt";

	private static String pathInput = "C:\\Users\\Nasser\\Documents\\workspace-spring-tool-suite-4-4.12.0.RELEASE\\paralelismo_com_threads.zip_expanded\\Paralelismo/ecg-heartbeat.txt";

	private static String URL_CLIENT1 = "http://localhost:8081/client1/start";

	public void start() throws Exception {
		long startTime = System.currentTimeMillis();

		try {
			List<BigDecimal> valores = this.lerArquivo();
			ManipuladorArquivo.escreverVMP(pathVMP,
					new CalculosUtil().obterVMP(this.obterMatrizDistanciasParticionado(valores)));
		} catch (IOException e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Levou " + (endTime - startTime) + " ms");
	}

	private List<List<BigDecimal>> obterMatrizDistanciasParticionado(List<BigDecimal> valores) throws Exception {
		return this.getMatrizDistanciasParticionado(valores);
	}

	public List<List<BigDecimal>> getMatrizDistanciasParticionado(List<BigDecimal> valores) throws Exception {
		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL_CLIENT1)).GET()
				.header("valores", valores.toString()).build();

		HttpResponse<?> response = null;
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.statusCode());
		} catch (IOException | InterruptedException e) {
			System.out.println("Erro: " + e + ", revise as configurações.");
		}

		//System.out.println(response.body());
		if (response != null) {

			//response.body().toString().substring(1, response.body().toString().length() - 1).split("[");
			List<List<BigDecimal>> matrizList = new ArrayList<List<BigDecimal>>();
			for (String matriz : response.body().toString().substring(1, response.body().toString().length()).split("]")) {
				System.out.println("matriz: " + matriz.substring(2, matriz.length() - 1));
				

				List<BigDecimal> values = new ArrayList<BigDecimal>();
				System.out.println(matriz.substring(2, matriz.length() - 1));
				System.out.println(matriz.substring(2, matriz.length() - 1).split(","));
				for (String item : matriz.substring(2, matriz.length() - 1).split(",")) {
					System.out.println("Item da Matriz: " + item);
					values.add(new BigDecimal(item));
				}
				matrizList.add(values);
			}
			
			System.out.println(matrizList);
			if (HttpStatus.OK.equals(response.statusCode())) {
				return (List<List<BigDecimal>>) response.body();
			}
		}

		throw new RuntimeException("Falha ao obter resultados do client1");
	}

	private List<BigDecimal> converterLinhas(List<String> list) {
		List<BigDecimal> valores = new ArrayList<BigDecimal>();
		list.forEach(valor -> {
			valores.add(new BigDecimal(valor));
		});
		return valores;
	}

	private List<BigDecimal> lerArquivo() throws IOException {
		return this.converterLinhas(ManipuladorArquivo.leitor(pathInput));
	}

}
