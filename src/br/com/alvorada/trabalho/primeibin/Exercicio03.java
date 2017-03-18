package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double exp = 2.0;
		double result;
		System.out.println("Informe Um Numero: ");
		num = sc.nextInt();
		result = Math.pow(num, exp);
		System.out.println(result);

	}

}
