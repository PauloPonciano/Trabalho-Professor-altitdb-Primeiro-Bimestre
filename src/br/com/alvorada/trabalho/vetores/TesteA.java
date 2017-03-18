package br.com.alvorada.trabalho.vetores;

import java.util.Scanner;

public class TesteA {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double numbA;
		double numB;
		double exp;
		
	System.out.println("Digite o Primeiro Numero");
	numbA = sc.nextDouble();
	System.out.println("Digite o Segundo Numero");
	numB = sc.nextDouble();
	exp = Math.pow(numbA, numB);
	System.out.println("O Resultado é : "+exp);
		
	}

}
