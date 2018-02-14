package ensinandoMultiplicacao;

import java.util.Random;

public class GeradorNumerico {

	
	public static int gerarNumero(){
		Random gerador = new Random();
		return 1 + gerador.nextInt(9);
	}
	
	public static int gerarNumeroMensagem(){
		Random gerador = new Random();
		return  gerador.nextInt(4);
	}
	
}
