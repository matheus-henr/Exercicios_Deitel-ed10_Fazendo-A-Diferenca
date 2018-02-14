package ensinandoMultiplicacao;

public class Mensagem {

	public static String mensagemAcerto(int numero){
		switch (numero) {
		case 0: return "Muito bom!";
		case 1: return "Excelente!";
		case 2: return "Bom trabalho!";
		case 3: return "Mantenha um bom trabalho!";
		default:
			return "ERRO NO SISTEMA";
		}
	}
	
	public static String mensagemErro(int numero){
		switch (numero) {
		case 0: return "Não. Por favor, tente de novo.";
		case 1: return "Errado. Tente mais uma vez.";
		case 2: return "Não desista!";
		case 3: return "Não. Continue tentando.";

		default:
			return "ERRO NO SISTEMA";
		}
	}
}
