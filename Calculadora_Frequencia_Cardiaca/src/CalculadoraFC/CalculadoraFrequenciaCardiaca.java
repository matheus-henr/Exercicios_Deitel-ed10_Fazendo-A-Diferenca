package CalculadoraFC;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculadoraFrequenciaCardiaca {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		String newCalculo;

		do{
			System.out.println("----Calculadora Cardiaca----");

			System.out.println("Informe seu nome: ");
			String nome = entrada.next();

			System.out.println("Informe seu sobre nome: ");
			String sobreNome = entrada.next();

			System.out.println("Informe seu sexo (h/m): ");
			Sexo sexo  = escolhaSexo(entrada.next());

			System.out.println("Informe o seu dia de nascimento: ");
			int dia = entrada.nextInt();

			System.out.println("Informe o seu mes de nascimento: ");
			int mes = entrada.nextInt();

			System.out.println("Informe o seu ano de nascimento: ");
			int ano = entrada.nextInt();
			
			Pessoa pessoa = new Pessoa(nome, sobreNome, LocalDate.of(ano, mes, dia), sexo);

			RegraCalculoFrequenciaCardiaca regra = new RegraCalculoFrequenciaCardiaca(pessoa);
			regra.calcularFrequenciaMAX();
			regra.calcularFrquenciaAlvo();
			System.out.println("--------------------------------------------");
			regra.imprimirResultado();
			System.out.println("--------------------------------------------");
			
			System.out.println("\n Fazer um novo calculo ? (s/n)");
			newCalculo = entrada.next();
			
		}while(newCalculo.equalsIgnoreCase("s"));
		
		entrada.close();
		
		System.out.println("---Aplicação encerrada----");
		
	}


	public static Sexo escolhaSexo(String sexo){

		switch(sexo.toUpperCase()){
		case "H": return Sexo.HOMEM;
		case "M": return Sexo.MULHER;
		default: return null;
		}
	}
}
