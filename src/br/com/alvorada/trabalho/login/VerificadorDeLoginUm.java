package br.com.alvorada.trabalho.login;

import java.util.Scanner;

public class VerificadorDeLoginUm {
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
