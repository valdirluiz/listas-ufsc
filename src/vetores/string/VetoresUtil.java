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

	public char[] inverteVetor(char[] vetor) {
		char[] vetorInvertido = new char[vetor.length];
		int indice = 0;
		for (int i = vetor.length - 1; i >= 0; i--) {
			vetorInvertido[indice] = vetor[i];
			indice++;
		}
		return vetorInvertido;
	}

	public boolean isPalindroma(char[] palavra) {
		int indiceFinal = palavra.length - 1;
		int indiceInicial = 0;
		boolean isPalindroma = true;
		do {

			if (palavra[indiceFinal] != palavra[indiceFinal]) {
				isPalindroma = false;
				break;
			}

			indiceFinal = indiceFinal - 1;
			indiceInicial = indiceInicial + 1;
		} while (indiceFinal != indiceInicial);

		return isPalindroma;

	}

	// exercicios matrizes

	public int somatoriaDosElementosDaMatriz(int[][] matriz) {
		int somatoria = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somatoria = somatoria + matriz[linha][coluna];
			}
		}
		return somatoria;
	}

	public void imprimeMatriz(int[][] matriz) {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
	}

	public void imprimeDiagonalPrincipal(int[][] matriz) {
		int indice = 0;
		do {
			System.out.print(matriz[indice][indice]);
			indice = indice + 1;
		} while (indice < matriz.length);
	}

	public void imprimeDiagonalSegundaria(int[][] matriz) {
		int linha = 0;
		int coluna = matriz.length - 1;
		do {
			System.out.print(matriz[linha][coluna]);
			coluna = coluna - 1;
			linha = linha + 1;
		} while (linha < matriz.length);
	}

	public int[][] matrizMultiplicadaPorDez(int[][] matriz) {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (linha == coluna) {
					matriz[linha][coluna] = 0;
				} else {
					matriz[linha][coluna] = matriz[linha][coluna] * 10;
				}
			}
		}
		return matriz;
	}

	public void mostraOcorrenciaDeNumeros(int[] vetor) {
		int ocorrencias[][] = new int[2][vetor.length];
		String resultado = "";
		for (int indice = 0; indice < vetor.length; indice++) {
			adicionaOcorrencia(vetor[indice], ocorrencias, indice);
		}

		for (int coluna = 0; coluna < ocorrencias[1].length; coluna++) {
			if (ocorrencias[1][coluna] != 0) {
				resultado += "N. " + ocorrencias[0][coluna] + " -> "
						+ ocorrencias[1][coluna] + " vezes | ";
			}
		}

		System.out.print(resultado);

	}

	public void adicionaOcorrencia(int numero, int ocorrencias[][],
			int lugarNoVetor) {
		boolean encontrou = false;
		for (int coluna = 0; coluna < ocorrencias.length; coluna++) {
			if (ocorrencias[0][coluna] == numero) {
				ocorrencias[1][coluna] = ocorrencias[1][coluna] + 1;
				encontrou = true;
				break;
			}

		}

		if (!encontrou) {
			ocorrencias[0][lugarNoVetor] = numero;
			ocorrencias[1][lugarNoVetor] = ocorrencias[1][lugarNoVetor] + 1;
		}

	}
	
	public int digitosDoNumero(int numero){
		int digitos=0;
		do {
			numero=numero/10;
			digitos=digitos+1;
		} while (numero>0);
		return digitos;
	}
	
	public String montaEspacos(int numero, int maxDigitos){
		String espacos=" ";
		int qtEspacos = maxDigitos-this.digitosDoNumero(numero);
		for(int i=0; i<=qtEspacos;i++){
			espacos=espacos+" ";
		}
		return espacos;
	}
	
	public void imprimeTabela(int numero){
		int matriz[][] = new int[numero][numero];
		
		for(int linha=0; linha<matriz.length;linha++){
			for(int coluna=0;coluna<matriz[linha].length;coluna++){
				int numeroAtual = (linha+1)*(coluna+1);
				System.out.print(this.montaEspacos(numeroAtual, 2)+numeroAtual);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int vetor[] = {1,2,3,1,1};
		VetoresUtil vetoresUtil = new VetoresUtil();
		 vetoresUtil.imprimeTabela(8);
	}

}
