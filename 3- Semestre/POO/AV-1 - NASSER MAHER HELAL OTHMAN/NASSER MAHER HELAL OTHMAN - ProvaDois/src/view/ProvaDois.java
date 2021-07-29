package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import bo.Gato;

public class ProvaDois {

	List<Gato> gatos = new ArrayList<Gato>();
	Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		new ProvaDois().exibirMenu();
	}

	private void exibirMenu() {
		int opcao = 0;
		while (opcao != 5) {
			System.out.println("-------------");
			System.out.println("1 - Cadastrar Gato");
			if(Objects.nonNull(gatos) && gatos.size() > 0) {
				System.out.println("2 - Exibir qtd total elementos");
				System.out.println("3 - Exibir qtd de elementos por sexo");
				System.out.println("4 - Exibir peso total dos elementos");
			}
			System.out.println("5 - Sair");
			System.out.println("-------------");
			opcao = ler.nextInt();
			tratarAcao(opcao);
		}

	}

	private void tratarAcao(int opcao) {
		switch (opcao) {
		case 1:
			cadastrarGato();
			break;
		case 2:
			System.out.println("Quantidade total de elementos: " + gatos.size());
			break;
		case 3:
			elementosPorSexo();
			break;
		case 4:
			System.out.println("Peso total: " + getPesoTotal());
			break;
		case 5:
			System.out.println("Programa encerrado\n");
			break;
		}

	}

	private Double getPesoTotal() {
		Double pesoTotal = 0.0;
		for (Gato gato : gatos) {
			pesoTotal = pesoTotal + gato.getPeso();
		}
		return pesoTotal;
	}

	private void elementosPorSexo() {
		int totalM = 0;
		int totalF = 0;
		
		for (Gato gato : gatos) {
			if(gato.getSexo().equals('F')) {
				totalF++;
			} else if (gato.getSexo().equals('M')) {
				totalM++;
			}
		}
		
		System.out.println("Total de machos: " + totalM + " | Total de fêmeas: " + totalF);
		
	}

	private void cadastrarGato() {
		Gato gato = new Gato();

		System.out.println("--- Cadastro de gatos ---\n");
		try {
			System.out.println("Digite o nome do gato: \n");
			gato.setNome(ler.next().toUpperCase());

			System.out.println("Digite a idade do gato: \n");
			gato.setIdade(ler.nextInt());

			System.out.println("Digite o sexo do gato (F/M): \n");
			gato.setSexo(Character.toUpperCase(ler.next().charAt(0)));
			if(gato.getSexo() != 'F' && gato.getSexo() != 'M') {
				System.out.println("Sexo inválido! Somente é permitido F ou M, revise os dados e tente novamente.\n");
				exibirMenu();
			}

			System.out.println("Digite o peso do gato: \n");
			gato.setPeso(ler.nextDouble());

			System.out.println("Digite a raça do gato: \n");
			gato.setRaca(ler.next());

		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao tentar cadastrar o gato, revise os dados e tente novamente.\n");
		}
		gatos.add(gato);
	}
}
