//16) Crie um algoritmo que realize o armazenamento de 10 nomes, e que permita a listagem de todos os nomes inseridos.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio16 {
		public static void main(String[] args) {
			String nome[] = new String [10];
			Scanner sc = new Scanner (System.in);
			for (int i = 0; i < nome.length; i++) {
				System.out.println("Digite um Nome: ");
				nome[i] = sc.next();
				
			}
			for (String string : nome) {
				System.out.println(string);
				
			}
		}

}
