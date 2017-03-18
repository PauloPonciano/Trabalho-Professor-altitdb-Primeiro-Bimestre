//15) Crie um algoritmo que realize o cadastro de 10 clientes, com nome, e-mail e telefone utilizando vetores e funções. Ao inserir mais de 10 clientes, o algoritmo deve informar que o espaço de armazenamento é insuficiente.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio15 {
	static String[] nome1 = new String[10];
	static String[] email1 = new String[10];
	static String[] telefone1 = new String[10];
	static int contador = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome = "";
		String telefone = "";
		String email = "";
		String op = "s";

		do {
			if (contador <= 9) {
				System.out.println("Digite Seu Nome: ");
				nome = sc.next();
				System.out.println("Digite Seu Telefone:");
				telefone = sc.next();
				System.out.println("Digite Seu Email:");
				email = sc.next();

				CadastroCliente(nome, email, telefone, contador);
				contador++;
				System.out.println("Deseja Continuar o cadastro? digite s para continuar");
				op = sc.next();
			} else {
				System.out.println("Espaço Insuficiente.");
				System.out.println("");
				break;
			}
		} while (op.equals("s"));

		for (int i = 0; i < contador; i++) {
			ImprimeClientes(i);
		}

	}

	static void CadastroCliente(String nome, String email, String telefone, int numero) {

		nome1[numero] = nome;
		telefone1[numero] = telefone;
		email1[numero] = email;

	}

	static void ImprimeClientes(int numero) {
		System.out.println("O nome do cliente é " + nome1[numero]);
		System.out.println("O telefone é " + telefone1[numero]);
		System.out.println("O email é " + email1[numero]);
		System.out.println("");
	}
}
