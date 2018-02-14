package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		double peso;
		double altura;
		String newCalculo;
		
		do{
			System.out.println("----Calculadora IMC----");
			System.out.println("Informe seu peso:");
			peso = entrada.nextDouble();
			System.out.println("Informe sua altura:");
			altura = entrada.nextDouble();

			double imc = converterDoubleDoisDecimais(calcularIMC(altura, peso));
			System.out.println("Seu IMC é: " + imc); 
			System.out.println("------------------------");
			
			System.out.println("Deseja fazer um novo calculo? (s/n)");
			newCalculo = entrada.next();
			
		}while(newCalculo.equalsIgnoreCase("s"));
		
		System.out.println("----Execução encerrada----");
		entrada.close();
	}

	private static double calcularIMC(double altura, double peso){
		if(peso == 0 || altura == 0)
			throw new ArithmeticException("Peso em altura pode ser 0");
		return peso/(Math.pow(altura, 2));
	}
	
	public static double converterDoubleDoisDecimais(double precoDouble) {
	    DecimalFormat fmt = new DecimalFormat("0.00");      
	    String string = fmt.format(precoDouble);
	    String[] part = string.split("[,]");
	    String string2 = part[0]+"."+part[1];
	        double preco = Double.parseDouble(string2);
	    return preco;
	}
}
