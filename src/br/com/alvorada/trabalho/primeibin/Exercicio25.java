//25) Crie um algoritmo que simula o comportamento de um contador de acessos.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Integer condic;
		int contador= 0;
		String acesso = "sim";
		Scanner sc  = new Scanner(System.in);
		do {
			System.out.println("digite sim para entrar! ");
			acesso = sc.next();
			if (acesso.equals("sim")) {
				
				contador ++;
			}	
		} while (acesso.equals("sim"));
		
		System.out.println(contador);
	}

}
