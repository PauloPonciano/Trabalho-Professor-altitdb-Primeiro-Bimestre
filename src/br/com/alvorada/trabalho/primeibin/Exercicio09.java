//09) Crie um algoritmo que retorna o tipo do triangulo de acordo com o tamanho dos lados informados.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		double ladoA,ladoB,ladoC;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite O lado A : ");
		ladoA = sc.nextDouble();
		System.out.println("Digite O Lado B: ");
		ladoB = sc.nextDouble();
		System.out.println("Digite O Lado C: ");
		ladoC = sc.nextDouble();
		if(ladoA == ladoB && ladoB == ladoC && ladoA == ladoC){
			System.out.println("Seu Triangulo é Equilátero.");
		}else if((ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB || (ladoA != ladoB && ladoB == ladoC))){
			System.out.println("Seu Tirangulo é Isósceles.");
		}else{
			System.out.println("Seu Triangulo é Escaleno.");
		}
	}
}
