package enqueteSocial;

public class CalcularResultado {

	public CalcularResultado() {
		resultado = new StringBuffer();
		resultado.append("Media \t Enquete \t Total Votos \n ");
	}

	private int maiorClassificao;
	private String maiorEnquete;
	private int menorClassificao = 10;
	private String menorEnquete;
	private StringBuffer resultado;

	public void calcular(int[][] votacao, String[] enquete) {
		int totalVendas = 0;
		int media = 0;

		for (int i = 0; i < votacao.length; i++) {
			for (int j = 0; j < votacao[i].length; j++) {
				if (votacao[i][j] == 0)continue;
				totalVendas++;
				media += votacao[i][j];

				desempenho(votacao[i][j], enquete[i]);
			}

			if (media != 0 && totalVendas != 0)
				media /= totalVendas;

			amontarTabela(media, enquete[i], totalVendas);

			media = 0;
			totalVendas = 0;
		}
		
	}
	
	
	public void imprimirResultado(){
		gerarDesempenho();
		System.out.println(resultado.toString());
	}
	

	private void desempenho(int valor, String enquete) {
		avaliacaoMaior(valor, enquete);
		avaliacaoMenor(valor, enquete);

	}
	
	private void gerarDesempenho(){
		resultado.append("Maior: ");
		resultado.append(maiorEnquete);
		resultado.append("\t");
		resultado.append(maiorClassificao);
		resultado.append("\n");
		
		resultado.append("Menor: ");
		resultado.append(menorEnquete);
		resultado.append("\t");
		resultado.append(menorClassificao);
		resultado.append("\n");
	}

	private void avaliacaoMenor(int i, String enquete) {
		if (i < menorClassificao) {
			menorClassificao = i;
			menorEnquete = enquete;
		}

	}

	private void avaliacaoMaior(int i, String enquete) {
		if (i > maiorClassificao) {
			maiorClassificao = i;
			maiorEnquete = enquete;
		}

	}
	
	private void amontarTabela(int media, String enquete, int totalVendas) {
		resultado.append(media);
		resultado.append("\t");
		resultado.append(enquete);
		resultado.append("\t");
		resultado.append(totalVendas);
		resultado.append("\n");
	}

}
