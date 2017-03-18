package br.com.alvorada.trabalhalho.vetoresematrizes;

public class MatrizParaMatriz {
	public static void main(String[] args) {
		Integer[][] numb = new Integer[2][2];
		Integer[][] numbA = new Integer [2][2];
		numb[0][0] = 1;
		numb[0][1] = 2;
		numb[1][0] = 3;
		numb[1][1] = 4;
		for (int i = 0; i < numb.length; i++) {
			for (int j = 0; j < numb.length; j++) {
				numbA[i][j] = numb[i][j];
			}
			
		}
		for (int i = 0; i < numbA.length; i++) {
			for (int j = 0; j < numbA.length; j++) {
				System.out.println(numbA[i][j]);
			}
			
		}
}
}