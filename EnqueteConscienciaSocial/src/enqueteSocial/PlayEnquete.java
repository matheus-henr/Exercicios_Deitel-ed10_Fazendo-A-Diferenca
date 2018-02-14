package enqueteSocial;

import java.util.Scanner;

public class PlayEnquete {	
	
	public static void main(String[] args) {

		Enquete enquete = new Enquete();
		String[] enquetes = enquete.enquetes();
		int[][] votacao = new int[5][10];
		int nota = 1;

		Scanner teclado = new Scanner(System.in);

		System.out.println("----Enquete Social-----");
		System.out.println("\t de 1 (menos importante) a 10 (mais importante)");
		System.out.println("qualquer numero que não esteja entre o intervalo \n aceito, não e validado");
		System.out.println("---------------------------------------------------------");

		for(int i = 0; i < votacao.length; i++){
			System.out.println("-----------------------------------------");
			System.out.println(enquetes[i]);
			for(int v = 0; v < votacao[i].length; v++){
				System.out.println("nova votação");
				nota = teclado.nextInt();
				
				if(nota < 1 || nota > 10) continue;
				votacao[i][v] = nota;
			}
			System.out.println("-----------------------------------------");
		}
		teclado.close();
		
		enquete.resultado(votacao);

	}

}



