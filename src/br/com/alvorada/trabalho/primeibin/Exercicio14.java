//14) Crie um algoritmo que simule “Máquina de calcular”, este algoritmo deverá conter as quatro operações básicas, fatorial e potência, todas implementadas em funções.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio14 {
	static Scanner sc = new Scanner(System.in);
	static int numA, numB, total;

	public static void main(String[] args) {
		int options;
		System.out.println("1 -  Soma");
		System.out.println("2 -  Subtração");
		System.out.println("3 -  Multiplicação");
		System.out.println("4 -  Divisão");
		System.out.println("5 -  Potenciação");
		System.out.println("6 -  Fatorial");
		options = sc.nextInt();

		switch (options) {
		case 1:
			Soma();
			break;
		case 2:
			Sub();
			break;
		case 3:
			Multi();
			break;
		case 4:
			Div();
			break;
		case 5:
			Potencia();
			break;
		case 6:
			Fat();
			break;

		default:
			break;
		}
	}

	static void Soma() {
		System.out.println("Digite o Primeiro Valor: ");
		numA = sc.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		numB = sc.nextInt();
		total = numA + numB;
		System.out.println("O total da soma é : " + total);

	}

	static void Multi() {
		System.out.println("Digite o Primeiro Valor");
		numA = sc.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		numB = sc.nextInt();
		total = numA * numB;
		System.out.println("O total da Multiplicação é : " + total);
	}

	static void Div() {
		System.out.println("Digite o Primeiro Valor");
		numA = sc.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		numB = sc.nextInt();
		total = numA / numB;
		System.out.println("O total da Divisão é : " + total);
	}

	static void Sub() {
		System.out.println("Digite o Primeiro Valor");
		numA = sc.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		numB = sc.nextInt();
		total = numA - numB;
		System.out.println("O total da Subtração é : " + total);
	}

	static void Potencia() {
		System.out.println("Digite o Primeiro Valor");
		numA = sc.nextInt();
		System.out.println("Digite a Potencia: ");
		numB = sc.nextInt();
		total = (int) Math.pow((double)numA, (double)numB);
		System.out.println("O total é : " + total);
	}
	static void Fat(){
		System.out.println("Digite o numero a ser fatorado: ");
		numA = sc.nextInt();
		total = 1;
		for (int i = 1; i <= numA; i++) {
			total *= i;
		}
		System.out.println("O total da Subtração é : " + total);
	}
	
}
