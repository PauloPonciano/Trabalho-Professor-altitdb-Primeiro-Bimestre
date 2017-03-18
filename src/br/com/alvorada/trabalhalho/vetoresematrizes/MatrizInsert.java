package br.com.alvorada.trabalhalho.vetoresematrizes;

public class MatrizInsert {
	public static void main(String[] args) {
		for (int i = 0; i < Numb().length; i++) {
			for (int j = 0; j < Numb().length; j++) {
				for (int j2 = 0; j2 < Numb().length; j2++) {
					for (int k = 0; k < Numb().length; k++) {
						System.out.println(Numb()[i][j][j2][k]);
					}
				}
			}
		}
	}

	static Integer[][][][] Numb() {
		int contador = 1;
		Integer[][][][] matriz = new Integer[10][10][10][10];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				for (int j2 = 0; j2 < matriz.length; j2++) {
					for (int k = 0; k < matriz.length; k++) {
						
						matriz [i][j][j2][k] = contador;
						contador++;
						
					}
				}

			}

		}

		return matriz;
	}
}
