package enqueteSocial;

public class Enquete {
	
	String[] enquete;
	
	public String[] enquetes(){
	    enquete = new String[5];
		
		enquete[0] = "Politica";
		enquete[1] = "Futebol";
		enquete[2] = "Religião";
		enquete[3] = "Dengue";
		enquete[4] = "Tecnologia";
		
		return enquete;
	}
	

	public void resultado(int[][] votacao) {
		CalcularResultado resultado = new CalcularResultado();
		resultado.calcular(votacao, enquete);
		resultado.imprimirResultado();
		
	}


	
	
}
