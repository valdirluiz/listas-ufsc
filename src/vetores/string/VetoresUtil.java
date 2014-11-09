package vetores.string;

public class VetoresUtil {

	public Boolean isVectorEquals(char[] vetor1, char[] vetor2) {
		Boolean isEquals = true;

		if (vetor1.length != vetor2.length) {
			isEquals = false;
		} else {
			for (int i = 0; i < vetor1.length; i = i + 1) {
				if (vetor1[i] != vetor2[i]) {
					isEquals = false;
					break;
				}
			}
		}

		return isEquals;
	}

	public char[] retornaMaiorVetor(char[] vetor1, char[] vetor2) {

		if (vetor1.length > vetor2.length) {
			return vetor1;
		} else {
			return vetor2;
		}

	}

	public int[] retornaNumerosVogaisEConsoantesDeVetor(char[] texto) {
		int[] armazena = new int[3];
		int numeroDeVogais = 0;
		int numeroDeConsoantes = 0;
		int numeroDeNumeros = 0;
		for (int i = 0; i < texto.length; i++) {

			if (texto[i] >= 48 && texto[i] <= 57) {
				numeroDeNumeros++;
			}

			if (texto[i] >= 65 && texto[i] <= 90) {
				if (texto[i] != 65 && texto[i] != 69 && texto[i] != 73
						&& texto[i] != 79 && texto[i] != 85) {
					numeroDeConsoantes++;
				} else {
					numeroDeVogais++;
				}
			}

			if (texto[i] >= 97 && texto[i] <= 122) {
				if (texto[i] != 97 && texto[i] != 101 && texto[i] != 105
						&& texto[i] != 111 && texto[i] != 117) {
					numeroDeConsoantes++;
				} else {
					numeroDeVogais++;
				}
			}
		}
		armazena[0] = numeroDeNumeros;
		armazena[1] = numeroDeConsoantes;
		armazena[2] = numeroDeVogais;
		return armazena;
	}

}
