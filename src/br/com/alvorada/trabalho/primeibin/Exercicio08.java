//08) Crie um algoritmo que exibe um menu com as seguintes opções:
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner; 

public class Exercicio08 {

	public static void main(String[] args) {
		Integer options;
		double altura,baseMaior,base, profundidade,largura,lado,area, raio;
		double pi = 3.141592;
		Scanner sc = new Scanner(System.in);

		System.out.println("1 - Calcular área do Triângulo");
		System.out.println("2 - Calcular área do Quadrado");
		System.out.println("3 - Calcular área do Retangulo");
		System.out.println("4 - Calcular área do Circulo");
		System.out.println("5 - Calcular área do Trapezio");

		options = sc.nextInt();
		switch (options) {
		case 1:
			System.out.println("Digite a Base");
			base = sc.nextDouble();
			System.out.println("Digite a Altura");
			altura = sc.nextDouble();
			area = (base*altura) / 2;
			System.out.println("A Area do Triangulo é : "+area);
			break;
		case 2:
			System.out.println("Digite o lado ");
			lado = sc.nextDouble();
			area = lado*lado;
			System.out.println("A Area de Um quadrado é : "+area);
			break;
		case 3:
			System.out.println("Digite Altura : ");
			altura = sc.nextDouble();
			System.out.println("Digite a Largura");
			largura = sc.nextDouble();
			area = altura * largura;
			System.out.println("A Area do Retangulo é : "+area);
			break;
		case 4:
			System.out.println("Digite o Raio");
			raio = sc.nextDouble();
			area = pi*(raio*raio);
			System.out.println("A area do Circulo é: "+area);
			break;
		case 5:
			System.out.println("Digite a Base Maior");
			baseMaior = sc.nextDouble();
			System.out.println("Digite a Base Menor: ");
			base = sc.nextDouble();
			System.out.println("Digite a Altura: ");
			altura = sc.nextDouble();
			area = ((baseMaior+base)*altura)/2;
			System.out.println("A area do Trapezio é :"+area);
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}

	}

}
