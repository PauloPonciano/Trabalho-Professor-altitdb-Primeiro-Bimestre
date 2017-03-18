package br.com.alvorada.trabalho.vetores;

public class ArmazenaVetor {
	public static void main(String[] args) {
		int soma = 0;
		int vetor [] = new int [10];
		for (int i = 0; i < vetor.length; i++) {
			vetor [i] = i;
			
		}		
		for (int b2 : vetor) {
			System.out.print(b2+", ");
		}
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println("A soma total do vetor é : "+soma);
	}
}
