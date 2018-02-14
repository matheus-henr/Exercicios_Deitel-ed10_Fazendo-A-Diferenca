package ensinandoMultiplicacao;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int resposta = 0;
		int numero1;
		int numero2;

		System.out.println("---Bem Vindo ao mundo da multiplicação------");
		System.out.println("para sair da calculadora digite '-1'");
		System.out.println("--------------------------------------------");

		while(resposta != -1){
			numero1 = GeradorNumerico.gerarNumero();
			numero2 = GeradorNumerico.gerarNumero();
			
			System.out.println("Quanto é "+  numero1 + " vezes " + numero2 + " ?");
			resposta = entrada.nextInt();
			
			if(resposta == -1) break;
			
			
			verificaResultado(numero1, numero2, resposta);
			System.out.println("--------------------------------------------");
		}
		
		System.out.println("----Aplicação encerrada----");
		
		entrada.close();

	}

	private static void verificaResultado(int numero1, int numero2, int resposta) {
		int resultado = numero1 * numero2;
		
		if(resultado == resposta)System.out.println(Mensagem.mensagemAcerto(
				GeradorNumerico.gerarNumeroMensagem()));
		else System.out.println(Mensagem.mensagemErro(GeradorNumerico.gerarNumeroMensagem()));
		
	}

}
