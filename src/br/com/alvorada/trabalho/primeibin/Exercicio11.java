//11) Crie um algoritmo que receba uma data no formato DD/MM/AAAA e devolva uma string no formato Dia de mesPorExtenso de Ano. É necessário validar se a data está correta.
package br.com.alvorada.trabalho.primeibin;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int options = 0;

		String mes = "";
		String data;
		String dataFormat;
		System.out.println("Digite a data em formato DD/MM/AAAA: ");
		data = sc.next();
		mes = data.charAt(3) + "" + data.charAt(4);

		switch (mes) {
		case "01":
			mes = "De Janeiro";

			break;
		case "02":
			mes = "De Fevereiro";

			break;
		case "03":
			mes = "De Março";

			break;
		case "04":
			mes = "De Abril";

			break;
		case "05":
			mes = "De Maio";

			break;
		case "06":
			mes = "De Junho";
			break;
		case "07":
			mes = "De Julho";

			break;
		case "08":
			mes = "De Agosto";

			break;
		case "09":
			mes = "De Setembro";
			break;
		case "10":
			mes = "De Outubro";

			break;
		case "11":
			mes = "De Novembro";

			break;
		case "12":
			mes = "De Dezembro";

			break;

		default:
			mes = "mes invalido não localizado";
			System.out.println(mes);
			break;
		}
		dataFormat = data.charAt(0) + "" + data.charAt(1) + " " + mes + " De " + data.charAt(6) + "" + data.charAt(7)
				+ "" + data.charAt(8) + "" + data.charAt(9);
		System.out.println(dataFormat);
	}
}
