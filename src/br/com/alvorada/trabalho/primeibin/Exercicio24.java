//24) Crie um algoritmo que altera o valor de uma posição do Array (Vetor) informada pelo usuário.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer[] numb = new Integer[4];
		Integer numero;
		Integer numeroDois;
		String condic = "sim";
		
		numb[0] = 10;
		numb[1] = 11;
		numb[2] = 12;
		numb[3] = 13;
		
		do {
			System.out.println("Digite a posição de 0 a 3 para alterar seu valor: ");
			numero = sc.nextInt();
			System.out.println("Digite o Valor: ");
			numeroDois = sc.nextInt();
			numb[numero] = numeroDois;
			System.out.println("Digite Sim Para continuar:");
			condic = sc.next();
			System.out.println(numb[numero]);
		} while (condic.equals("sim"));
		     }
}
