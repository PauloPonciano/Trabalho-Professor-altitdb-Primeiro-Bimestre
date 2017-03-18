//18) Crie um algoritmo que utilize uma Matriz como parametro.
package br.com.alvorada.trabalho.primeibin;

public class Exercicio18 {
	public static void main(String[] args) {
		String time[][] = new String [2][2];
		time[0][0] = "sao-paulo";
		time[0][1] = "flamengo";
		time[1][0] = "santos";
		time[1][1] = "vasco";
				matriz(time);
	}
	static void matriz (String[][]time){
		for (int i = 0; i < time.length; i++) {
			for (int j = 0; j < time.length; j++) {
				System.out.println(time[i][j]);
			}
		}
	}
}
