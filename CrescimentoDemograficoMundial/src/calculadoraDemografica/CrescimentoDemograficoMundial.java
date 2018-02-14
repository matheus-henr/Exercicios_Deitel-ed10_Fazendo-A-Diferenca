package calculadoraDemografica;

import java.time.LocalDate;

public class CrescimentoDemograficoMundial {
	final static double TAXA_DE_CRESCIMENTO = 1.2;
	
	public static void main(String[] args) {
		crescimentoNosProximos75ano();
	}

	private static void crescimentoNosProximos75ano() {
		int ano = LocalDate.now().getYear();
		int proximosAnos = 75;
	    double populacao = 7.60;
	    
	    System.out.printf("Ano: %d ---------- população: ---------- %.2f Bilhão\n",
				ano,populacao);
	    
	    
		while(proximosAnos != 0){
			ano += 1;
			populacao *= TAXA_DE_CRESCIMENTO;
			System.out.printf("Ano: %d ---------- população: ---------- %.2f\n",
					ano,populacao);
			proximosAnos--;
		}
		
	}
}
