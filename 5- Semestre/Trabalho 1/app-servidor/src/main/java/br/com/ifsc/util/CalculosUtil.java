package br.com.ifsc.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CalculosUtil {

	public BigDecimal somarElementos(List<BigDecimal> elementos) {
		return elementos.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public BigDecimal obterRaiz(BigDecimal valor) {
		return valor.sqrt(new MathContext(10)).setScale(10, RoundingMode.UP);
	}

	public List<String> obterVMP(List<List<BigDecimal>> matriz) {
		List<String> vmp = new ArrayList<String>();
		for (int indexMatriz = 0; indexMatriz < matriz.size(); indexMatriz++) {
			BigDecimal menorValor = new BigDecimal(99999);
			Integer indexMenorValor = 0;
			for (int indexVetor = 0; indexVetor < matriz.get(indexMatriz).size(); indexVetor++) {
				if (menorValor.compareTo(matriz.get(indexMatriz).get(indexVetor)) == 1
						&& !matriz.get(indexMatriz).get(indexVetor).equals(new BigDecimal("0.0000000000"))) {
					menorValor = new BigDecimal(matriz.get(indexMatriz).get(indexVetor).toPlainString());
					indexMenorValor = indexVetor;

				}
			}
			vmp.add(indexMenorValor + ";" + menorValor);
		}

		return vmp;
	}
}
