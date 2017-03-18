//10) Crie um algoritmo que valida se os dados digitados podem formar um triangulo.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double lado;
		Integer contador = 0;
		String options = "sim";
		do {
			System.out.println("Digite o Lado");
			lado = sc.nextDouble();
			contador ++;
			System.out.println("Para continuar Digite sim, para parar digite não");
			options = sc.next();
		} while (options.equals("sim"));
		if(contador == 3){
			System.out.println("É Um triangulo");
		}else{
			System.out.println("Não é um Triangulo");
		}
	}

}
