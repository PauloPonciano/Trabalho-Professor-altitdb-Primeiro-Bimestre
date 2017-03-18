//19) Crie um algoritmo que utilize um Array (Vetor) como tipo de retorno.
package br.com.alvorada.trabalho.primeibin;

public class Exercicio19 {
	public static void main(String[] args) {
		for (int i = 0; i < Nomes().length; i++) {
			System.out.println(Nomes()[i]);
		}
			
		
	}
	static Integer[] Nomes(){
		Integer[] array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		return array;
		
	}
}
