package br.com.alvorada.trabalho.cadastro.clientes;

import java.util.Scanner;

public class ArmazenaDezNomes {
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
