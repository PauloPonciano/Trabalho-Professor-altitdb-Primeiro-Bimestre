//Crie um algoritmo que realize a multiplicação de dois valores numéricos
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer primeiroValor = 0;
		Integer segundoValor = 0;
		Integer multiplica;
		System.out.println("Digite o Primeiro Valor: ");
		primeiroValor = sc.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		segundoValor = sc.nextInt();
		multiplica = primeiroValor*segundoValor;
		System.out.println("A soma Total é: "+multiplica);
	}

}
