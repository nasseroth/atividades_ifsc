package br.com.ifsc.app.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Service;

import br.com.ifsc.util.CalculosUtil;
import br.com.ifsc.util.ManipuladorArquivo;

@Service
public class InicioService {
	
	private static Integer TAMANHO_SUBSEQUENCIA = 4;
	
	public List<List<BigDecimal>> start(List<BigDecimal> valores) {
		return obterMatrizDistanciasParticionado(valores);
	}

	private List<List<BigDecimal>> obterMatrizDistanciasParticionado(List<BigDecimal> valores) {
		List<List<BigDecimal>> matrizDistancias = new ArrayList<List<BigDecimal>>();

		System.out.println("inicio obterMatrizDistancias " + Thread.currentThread().getName());
		Integer controleTamanhoT1 = TAMANHO_SUBSEQUENCIA;

		for (int indexT1 = 0; indexT1 < valores.size() && (controleTamanhoT1 + indexT1) <= valores.size(); indexT1++) {

			List<BigDecimal> vetorDistancias = new ArrayList<BigDecimal>();
			List<BigDecimal> t1 = valores.subList(indexT1, controleTamanhoT1);

			ExecutorService es = Executors.newFixedThreadPool(4);
			es.submit(new Runnable() {
				public void run() {
					for (int indexT2 = 0; indexT2 < valores.size()
							&& (TAMANHO_SUBSEQUENCIA + indexT2) <= valores.size(); indexT2++) {
						List<BigDecimal> t2 = valores.subList(indexT2, TAMANHO_SUBSEQUENCIA + indexT2);
						vetorDistancias.add(calcularDistanciaEuclidiana(t1, t2));
					}
				}
			});
			
			es.shutdown();

			controleTamanhoT1++;
			matrizDistancias.add(indexT1, vetorDistancias);
		}

		System.out.println("fim obterMatrizDistancias " + Thread.currentThread().getName());
		return matrizDistancias;
	}

	private BigDecimal calcularDistanciaEuclidiana(List<BigDecimal> t1, List<BigDecimal> t2) {
		List<BigDecimal> resultados = new ArrayList<BigDecimal>();
		for (int index = 0; index < TAMANHO_SUBSEQUENCIA; index++) {
			BigDecimal subtracao = t1.get(index).subtract(t2.get(index));
			resultados.add(subtracao.multiply(subtracao));
		}
		BigDecimal somaDosElementos = new CalculosUtil().somarElementos(resultados);
		BigDecimal raizQuadrada = new CalculosUtil().obterRaiz(somaDosElementos);
		return raizQuadrada;
	}
}
