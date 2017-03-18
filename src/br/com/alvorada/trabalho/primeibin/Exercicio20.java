//20) Crie um algoritmo que utilize uma Matriz como tipo de retorno.
package br.com.alvorada.trabalho.primeibin;

public class Exercicio20 {
	public static void main(String[] args) {
		for (int i = 0; i < Nomes().length; i++) {
			for (int j = 0; j < Nomes().length; j++) {
				System.out.println(Nomes()[i][j]);
			}
			
		}
	}

	static Integer[][] Nomes() {
		Integer[][] matriz = new Integer[2][2];
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			matriz [i][j] = j;
			
		}	
			
		}
		return matriz;
	}

}
