//06) Crie um algoritmo que retorne verdadeiro caso o login informado seja igual a “admin” e falso caso o login seja diferente de “admin”.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String login = "admin";
		String compara;
		System.out.println("Digite Seu Login");
		compara = sc.nextLine();
		if (login.equals(compara)){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
