package br.com.alvorada.trabalho.menu;

import java.util.Scanner;

public class MenuOptions {
	public static void main(String[] args) {
		
		
		Switch(Mennu());
		
	}

	static int Mennu() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("| Bem Vindos ao programa que nao te leva alugar nenhum!|");
		System.out.println("|                                                      |");
		System.out.println("| para Opção 1 digite o numero 1, é logico             |");
		System.out.println("| para Opção 1 digite o numero 2, é logico             |");
		System.out.println("| para Opção 1 digite o numero 3, é logico             |");
		System.out.println("| para Opção 1 digite o numero 4, é logico             |");
		System.out.println("| para Opção 1 digite o numero 5, é logico             |");
		System.out.println("| para Opção 1 digite o numero 6, é logico             |");
		System.out.println("|                                                      |");
		System.out.println("|______________________________________________________|");
		
		return option = sc.nextInt();
	}
	static void  Switch(int option){
		Scanner sc = new Scanner(System.in);
		switch (option) {
		case 1:
			System.out.println("Ola você esta na opção 1");
			Switch(Mennu());
			break;
		case 2:
			System.out.println("Ola você esta na opção 2");
			Switch(Mennu());
			
			break;
		case 3:
			System.out.println("Ola você esta na opção 3");
			Switch(Mennu());

			break;
		case 4:
			System.out.println("Ola você esta na opção 4");
			Switch(Mennu());

			break;
		case 5:
			System.out.println("Ola você esta na opção 5");
			Switch(Mennu());

			break;
		case 6:
			System.out.println("Ola você esta na opção 5");
			Switch(Mennu());

			break;

		default:
			break;
		}
	}
}
