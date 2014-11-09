package vetores.string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestaVetoresDeString {

	
	@Test
	public void vetoresDeStringIguais(){
		char[] vetor1 = new char[3];
		vetor1[0]='a';
		vetor1[1]='b';
		vetor1[2]='c';
		char[] vetor2 = vetor1;
		
		VetoresUtil vetoresUtil = new VetoresUtil();
		assertEquals(true, vetoresUtil.isVectorEquals(vetor1,vetor2));
		
	}
	
	@Test
	public void vetoresDeStringComTamanhoDiferente(){
		char[] vetor1 = new char[3];
		vetor1[0]='a';
		vetor1[1]='b';
		vetor1[2]='c';
		char[] vetor2 = new char[3];
		vetor2[0]='a';
		vetor2[1]='b';

		VetoresUtil vetoresUtil = new VetoresUtil();
		assertEquals(false, vetoresUtil.isVectorEquals(vetor1,vetor2));
		
	}
	
	@Test
	public void vetoresDeStringComTamanhoIgualEValorDiferente(){
		char[] vetor1 = new char[3];
		vetor1[0]='a';
		vetor1[1]='b';
		vetor1[2]='c';
		
		char[] vetor2 = new char[3];
		vetor2[0]='a';
		vetor2[1]='b';
		vetor2[2]='i';
		
		VetoresUtil vetoresUtil = new VetoresUtil();
		assertEquals(false, vetoresUtil.isVectorEquals(vetor1,vetor2));
		
	}
	
	
	@Test
	public void  deveRetornarMaiorVetor(){
		char[] vetor1 = new char[3];
		vetor1[0]='a';
		vetor1[1]='b';
		vetor1[2]='c';
		
		char[] vetor2 = new char[3];
		vetor2[0]='a';
		vetor2[1]='b';
		
		
		VetoresUtil vetoresUtil = new VetoresUtil();
		char[] maiorVetor = vetoresUtil.retornaMaiorVetor(vetor1,vetor2);
		assertEquals(3, maiorVetor.length);
	}
	
	@Test
	public void numeroDeNumerosDeveSerDois(){
		char[] texto = new  char[4];
		texto[0]='1';
		texto[1]='a';
		texto[2]='c';
		texto[3]='9';
		
		VetoresUtil util = new VetoresUtil();
		
		assertEquals(2, util.retornaNumerosVogaisEConsoantesDeVetor(texto)[0]);
	}	
	
	@Test
	public void numeroDeVogaisDeveSerDois(){
		char[] texto = new  char[4];
		texto[0]='1';
		texto[1]='a';
		texto[2]='c';
		texto[3]='A';
		
		VetoresUtil util = new VetoresUtil();
		
		assertEquals(2, util.retornaNumerosVogaisEConsoantesDeVetor(texto)[2]);
	}
	
	@Test
	public void numeroDeConsoantesDeveSerDois(){
		char[] texto = new  char[4];
		texto[0]='C';
		texto[1]='a';
		texto[2]='c';
		texto[3]='A';
		
		VetoresUtil util = new VetoresUtil();
		
		assertEquals(2, util.retornaNumerosVogaisEConsoantesDeVetor(texto)[1]);
	}
	
	@Test
	public void deveInverterVetor(){
		char [] vetor = new char[3];
		vetor[0]='a';
		vetor[1]='b';
		vetor[2]='c';
		
		VetoresUtil util = new VetoresUtil();
		
		vetor = util.inverteVetor(vetor);
		
		
		char[] vetorEsperado = new char[3];
		vetorEsperado[0]='c';
		vetorEsperado[1]='b';
		vetorEsperado[2]='a';
		assertEquals(true, util.isVectorEquals(vetorEsperado, vetor));
	}
	
	@Test
	public void palavraRirDeveSerPalindroma(){
		char[] texto = new char[3];
		texto[0]='r';
		texto[1]='i';
		texto[2]='r';
		
		VetoresUtil util = new VetoresUtil();
		
		assertEquals(true, util.isVectorPalindromo(texto));
	}
	
	@Test
	public void palavraOiNaoDeveSerPalindroma(){
		char[] texto = new char[2];
		texto[0]='o';
		texto[1]='i';
		
		VetoresUtil util = new VetoresUtil();
		
		assertEquals(false, util.isVectorPalindromo(texto));
	}
	
}
