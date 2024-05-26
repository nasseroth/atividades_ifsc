package br.com.ifsc.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivo {

	public static List<String> leitor(String path) throws IOException {
		List<String> linhas = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				linhas.add(line);
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao percorrer o arquivo.");
			e.printStackTrace();
		}
		return linhas;
	}

	/*
	 * public static void escritor(String path, List<List<BigDecimal>> matriz)
	 * throws IOException {
	 * 
	 * BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path)); for (int
	 * i = 0; i < matriz.size(); i++) { String linha = "MATRIZ: " + i + " -> ";
	 * linha += matriz.get(i).toString(); buffWrite.append(linha + "\n"); }
	 * buffWrite.close();
	 * 
	 * System.out.println("Arquivo gerado com sucesso, no path: " + path); }
	 */
	public static void escreverVMP(String path, List<String> vmps) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		for (String vmp : vmps) {
			String linha = "";
			linha += vmp;
			buffWrite.append(linha + "\n");
		}
		buffWrite.close();

		System.out.println("Arquivo gerado com sucesso, no path: " + path);
	}

}