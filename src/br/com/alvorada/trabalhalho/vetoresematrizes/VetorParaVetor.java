package br.com.alvorada.trabalhalho.vetoresematrizes;

public class VetorParaVetor {
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
