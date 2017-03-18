//05) Crie um algoritimo que retorne “APROVADO” para notas maiores ou iguais a 7.0, “EM EXAME” para notas maior ou igual 4.0 e menor 7.0, e  “REPROVADO” para notas menores que 4.0, de acordo com a nota informada.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double nota ;
		double resultado;
		System.out.println("Digite a Nota: ");
		nota = sc.nextDouble();
		if (nota >= 7.0){
			System.out.println("APROVADO");
			
		}else if (nota >= 4.0 && nota < 7.0) {
			System.out.println("Em Exame");
			
		}else {
			System.out.println("REPROVADO");
		}
		
	}
}
