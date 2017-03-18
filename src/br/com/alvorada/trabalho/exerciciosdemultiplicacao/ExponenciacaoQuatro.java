package br.com.alvorada.trabalho.exerciciosdemultiplicacao;

import java.util.Scanner;

public class ExponenciacaoQuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double result = 0;
		System.out.println("Digite um Valor: ");
		num = sc.nextDouble();
		for (int i = 0; i<=num;i++){
			result = Math.pow(num, i);
		}
		System.out.println(result);
	}

}
