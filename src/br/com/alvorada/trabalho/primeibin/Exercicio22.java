//22) Crie um algoritmo que copia os dados de um Array (Vetor) para outro Array (Vetor).
package br.com.alvorada.trabalho.primeibin;

public class Exercicio22 {
	public static void main(String[] args) {
	Integer[] vetorUm = new Integer[4];
	Integer[] vetorDois = new Integer[4];
	vetorUm [0] = 1;
	vetorUm [1] = 2;
	vetorUm [2] = 3;
	vetorUm [3] = 4;	
	for (int i = 0; i < vetorUm.length; i++) {
		vetorDois[i] = vetorUm[i];
	}
	for (int i = 0; i < vetorDois.length; i++) {
		System.out.println(vetorDois[i]);
	}
	}
}
