package br.com.alvorada.trabalhalho.vetoresematrizes;

public class MatrizReturn {
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
