//04) Crie um algoritmo que realize a exponenciação de um número inteiro de acordo com o seu valor e retorne o resultado. Exemplo: Número 3, então será realizado o cálculo 3 x 3 x 3 = 27.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double result = 0;
		System.out.println("Digite um Valor: ");
		num = sc.nextDouble();
		for (Integer i = 0; i<=num;i++){
			result = Math.pow(num, i);
		}
		System.out.println(result);
	}

}
