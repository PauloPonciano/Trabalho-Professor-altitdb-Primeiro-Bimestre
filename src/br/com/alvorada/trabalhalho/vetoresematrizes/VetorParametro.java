package br.com.alvorada.trabalhalho.vetoresematrizes;

public class VetorParametro {
	public static void main(String[] args) {
		String nomes[] = {
				new String("joao"),
				new String("marcos"),
				new String("Paulo")
				
		};
				vetor(nomes);
		}
	
	static void vetor (String [] nomes){
		for (String string : nomes) {
			System.out.println(string);
			
		}
	}
}

