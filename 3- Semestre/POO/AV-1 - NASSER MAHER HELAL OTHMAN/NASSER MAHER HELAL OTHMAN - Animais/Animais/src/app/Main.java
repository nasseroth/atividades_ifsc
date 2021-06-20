package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import app.enums.TipoAnimalEnum;
import app.model.AnimalModel;

public class Main {
	List<AnimalModel> animais = new ArrayList<>();
	Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().exibirMenu();
	}

	private void exibirMenu() {
		int opcao = 0;
		while (opcao != 5) {
			System.out.println("O que você deseja fazer?");
			System.out.println("1 - Cadastrar Animal");
			if(Objects.nonNull(animais) && animais.size() > 0) {
				System.out.println("2 - Exibir qual sexo tem mais animais");
				System.out.println("3 - Exibir se os cães representam mais de 50% dos animais cadastrados");
				System.out.println("4 - Exibir total de animais capturados no bairro Centro");
				System.out.println("5 - Encerrar o programa");
			}
			System.out.print("\n");
			opcao = ler.nextInt();
			tratarAcao(opcao);
		}
	}

	private void tratarAcao(int opcao) {
		switch (opcao) {
		case 1:
			cadastrarAnimal();
			break;
		case 2: 
			obterAnimaisPorSexo();
			break;
		case 3:
			verificarPercentualCaes();
			break;
		case 4:
			System.out.println("Total de capturas no bairro CENTRO: " + capturasBairro());
			break;
		default:
			break;
		}
		
	}

	private Integer capturasBairro() {
		Integer total = 0;
		for (AnimalModel animal : animais) {
			if (animal.getBairroEncontrado().contains("CENTRO")) {
				total += 1;
			}
		}
		return total;
	}

	private void verificarPercentualCaes() {
		int totalCaes = 0;
		for (AnimalModel animal : animais) {
			if(animal.getTipoAnimal().equals(TipoAnimalEnum.CAO)) {
				totalCaes += 1;
			}
		}
		double percentualCaes = ((totalCaes / animais.size()) * 100);
		if(percentualCaes > 50) {
			System.out.println("Os cães representam mais de 50% dos animais cadastrados");
		} else {
			System.out.println("Os cães não representam mais de 50% dos animais cadastrados");
		}
		
	}

	private void obterAnimaisPorSexo() {
		int totalM = 0;
		int totalF = 0;
		for (AnimalModel animal : animais) {
			if(animal.getSexo().equals('F')) {
				totalF += 1;
			} else if (animal.getSexo().equals('M')) {
				totalM += 1;
			}
		}
		if(totalM > totalF) {
			System.out.println("Existem mais animais no sexo Masculino\n");
		} else if (totalF > totalM) {
			System.out.println("Existem mais animais no sexo Feminino\n");
		} else if (totalF == totalM) {
			System.out.println("Em ambos os sexos existem a mesma quantia\n");
		}
	}

	private void cadastrarAnimal() {
		AnimalModel animal = new AnimalModel();
		System.out.println("--- Cadastro de Animais ---");
		try {
			System.out.println("Informe o tipo de animal encontrado (1 - CÃO | 2 - GATO | 3 - PÁSSARO): \n");
			int tipoAnimal = ler.nextInt();
			if(tipoAnimal == 1) {
				animal.setTipoAnimal(TipoAnimalEnum.CAO);
			} else if (tipoAnimal == 2) {
				animal.setTipoAnimal(TipoAnimalEnum.GATO);
			} else if (tipoAnimal == 3) {
				animal.setTipoAnimal(TipoAnimalEnum.PASSARO);
			} else {
				System.out.println("Tipo de animal não encontrado!\n");
				exibirMenu();
			}
			
			System.out.println("Informe o peso do animal: \n");
			animal.setPeso(ler.nextDouble());
			
			System.out.println("Informe a altura do animal: \n");
			animal.setAltura(ler.nextDouble());
			
			System.out.println("Informe o sexo do animal (M/F): \n");
			animal.setSexo(Character.toUpperCase(ler.next().charAt(0)));
			if(animal.getSexo() != 'F' && animal.getSexo() != 'M') {
				System.out.println("Sexo inválido! Somente é permitido F ou M, revise os dados e tente novamente.\n");
				exibirMenu();
			}
			
			System.out.println("Informe o bairro que foi encontrado o animal: \n");
			animal.setBairroEncontrado(ler.next().toUpperCase());
			
			System.out.println("Informe a situação do animal: \n");
			animal.setSituacaoAnimal(ler.next().toUpperCase());
			
			System.out.println("Informe a idade aproximada do animal: \n");
			animal.setIdadeAproximada(ler.nextInt());
			animais.add(animal);
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro ao tentar cadastrar o animal, revise os dados e tente novamente.\n");
		}

		
	}
}
