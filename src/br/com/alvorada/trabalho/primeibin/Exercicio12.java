//12) Crie um algoritmo que armazena 10 valores inteiros em um vetor e realiza a soma destes valores, e por fim apresente o resultado da soma.
package br.com.alvorada.trabalho.primeibin;

public class Exercicio12 {
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
