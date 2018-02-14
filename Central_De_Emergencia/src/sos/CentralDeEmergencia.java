package sos;

import java.util.Scanner;

public class CentralDeEmergencia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("\t ----Bem-Vindo a Central de emergencia-----");
		
		System.out.println("Informe o tipo de atentimento que deseja:");
		System.out.println("1) Bombeiros");
		System.out.println("2) Policia");
		System.out.println("3) Samu");
		TipoEmergencia atedimento = atendimento(teclado.nextInt());
		
		System.out.println("Seu nome:");
		String nome = teclado.next();
		
		System.out.println("Numero de telefone: ");
		String telefone = teclado.next();
		
		System.out.println("Endereço do local: ");
		String endereco = teclado.next();
		
		System.out.println("Descrição do acontecimento: ");
		String descricao = teclado.next();
		
		Emergencia emergencia = new Emergencia(nome,telefone,endereco,descricao, atedimento);
		System.out.println(emergencia.gerarEmergencia());
		
		teclado.close();
	}
	
	public static TipoEmergencia atendimento(int opcao){
		switch (opcao) {
		case 1: return TipoEmergencia.BOMBEIRO;
		case 2: return TipoEmergencia.POLICIAL;
		case 3: return TipoEmergencia.SAMU;
		default:
			throw new IllegalAccessError("Nenhuma opção correspondente");
		}
	}
	
}
