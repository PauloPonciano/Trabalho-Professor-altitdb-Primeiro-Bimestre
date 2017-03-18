package br.com.alvorada.trabalho.exerciciosdemultiplicacao;

import java.util.Scanner;

public class NotasDeAlunos {
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
