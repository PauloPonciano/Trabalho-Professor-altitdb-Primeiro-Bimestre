//07) Crie um algoritmo que retorne “Login efetuado com sucesso!” caso o login e senha informado seja igual a “admin” e para os demais casos retornar “Usuário e/ou senha incorretos”. 
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String comparaLogin;
		String comparaSenha;
		String login = "admin";
		String senha = "admin12345";
		System.out.println("Digite Seu login : ");
		comparaLogin = sc.nextLine();
		System.out.println("Digite Sua Senha");
		comparaSenha = sc.nextLine();
		if(login.equals(comparaLogin) && senha.equals(comparaSenha)){
			System.out.println("Login Efetuado com Sucesso");
		}else{
			System.out.println("Senha ou Login invalidos");
			
		}
	}
}
