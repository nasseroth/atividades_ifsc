package app;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import app.model.VisitanteModel;

public class Main {
	List<VisitanteModel> visitantes = new ArrayList<>();
	Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		new Main().exibirMenu();
	}

	private void exibirMenu() {
		int opcao = 0;
		while (opcao != 7) {
			System.out.println("O que você deseja fazer?");
			System.out.println("1 - Cadastrar Visitante");
			if(Objects.nonNull(visitantes) && visitantes.size() > 0) {
				System.out.println("2 - Exibir número total de visitantes");
				System.out.println("3 - Exibir número total de homens");
				System.out.println("4 - Exibir número total de mulheres");
				System.out.println("5 - Exibir percentual de homens e mulheres");
				System.out.println("6 - Exibir total de visitantes com menos de 18 anos");
				System.out.println("7 - Encerrar o programa");
			}
			System.out.print("\n");
			opcao = ler.nextInt();
			tratarAcao(opcao);
		}
	}

	private void tratarAcao(int opcao) {
		switch (opcao) {
		case 1:
			cadastrarVisitante();
			break;
		case 2:
			System.out.println("Número total de visitantes: " + visitantes.size());
			break;
		case 3:
			System.out.println("Número total de homens: " + obterTotalHomens());
			break;
		case 4:
			System.out.println("Número total de mulheres: " + obterTotalMulheres());
			break;
		case 5:
			obterPercentualSexo();
			break;
		case 6:
			System.out.println("Visitantes menores de 18 anos: " + totalMenores());
			break;
		default:
			System.out.println("Programa encerrado\n");
			break;
		}

	}

	private Integer totalMenores() {
		Integer total = 0;
		Date date = new Date();
		ZoneId timeZone = ZoneId.systemDefault();
		LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
		for (VisitanteModel visitante : visitantes) {
			if ((getLocalDate.getYear() - visitante.getAnoNascimento()) < 18) {
				total += 1;
			}
		}
		return total;
	}

	private void obterPercentualSexo() {
		double percentualMasculino = ((obterTotalHomens() / visitantes.size()) * 100);
		double percentualFeminino = ((obterTotalMulheres() / visitantes.size()) * 100);
		System.out.println("Percentual de Homens: " + percentualMasculino + "%");
		System.out.println("Percentual de Mulheres: " + percentualFeminino + "%");
	}

	private double obterTotalHomens() {
		int total = 0;
		for (VisitanteModel visitante : visitantes) {
			if(visitante.getSexo().equals('M')) {
				total += 1;
			}
		}
		return total;
	}

	private double obterTotalMulheres() {
		int total = 0;
		for (VisitanteModel visitante : visitantes) {
			if(visitante.getSexo().equals('F')) {
				total += 1;
			}
		}
		return total;
	}

	private void cadastrarVisitante() {
		VisitanteModel visitante = new VisitanteModel();
		System.out.println("--- Cadastro de visitantes ---\n");
		try {

			System.out.println("Digite o nome do visitante: \n");
			visitante.setNome(ler.next().toUpperCase());

			System.out.println("Digite o fone do visitante: \n");
			visitante.setFone(ler.next());

			System.out.println("Digite a cidade do visitante: \n");
			visitante.setCidade(ler.next().toUpperCase());

			System.out.println("Digite o bairro do visitante: \n");
			visitante.setBairro(ler.next().toUpperCase());

			System.out.println("Digite o sexo do visitante (F/M): \n");
			visitante.setSexo(Character.toUpperCase(ler.next().charAt(0)));
			if(visitante.getSexo() != 'F' && visitante.getSexo() != 'M') {
				System.out.println("Sexo inválido! Somente é permitido F ou M, revise os dados e tente novamente.\n");
				exibirMenu();
			}

			System.out.println("Digite a profissão do visitante: \n");
			visitante.setProfissao(ler.next());

			System.out.println("Digite o ano de nascimento do visitante: \n");
			visitante.setAnoNascimento(ler.nextInt());
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao tentar cadastrar o visitante, revise os dados e tente novamente.\n");
		}

		visitantes.add(visitante);
	}


}
