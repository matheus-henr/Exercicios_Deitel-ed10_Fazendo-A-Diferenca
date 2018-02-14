package quiz;

import java.util.List;
import java.util.Scanner;

public class QuizPlay {
	static List<Pergunta> perguntas;
	
	static{
		BancoDePerguntas banco = new BancoDePerguntas();
		perguntas = banco.buscar();// so 2 questão que esta cadastrada.
	}
	
	public static void main(String[] args) {
		int acerto = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("----Quiz de 5 perguntas----");
		
		for(Pergunta pergunta : perguntas){
			System.out.println(pergunta.getTitulo());
			System.out.println("    " + pergunta.getAlternativas().getAlternativa1());
			System.out.println("    " + pergunta.getAlternativas().getAlternativa2());
			System.out.println("    " + pergunta.getAlternativas().getAlternativa3());
			System.out.println("    " + pergunta.getAlternativas().getAlternativa4());
			
			String resposta = teclado.next();
			if(resposta.equalsIgnoreCase(pergunta.getAlternativaCorreta()))
				acerto++;
			
			System.out.println("--------------------------------------------------");
		}
		
		System.out.println("-----------------");
		resultado(acerto);
		System.out.println("-----------------");
		
		teclado.close();
	}

	private static void resultado(int acerto) {
		switch (acerto) {
			case 4: System.out.println("Exelente...");
				break;
			case 3:	System.out.println("Muito Bom...");
				break; 	
		default:
			System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
			break;
		}
		
	}
}
