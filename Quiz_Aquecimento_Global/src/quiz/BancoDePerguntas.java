package quiz;

import java.util.ArrayList;
import java.util.List;

public class BancoDePerguntas {

	public List<Pergunta> buscar() {
		List<Pergunta> perguntas = criarPerguntas();
		return perguntas;
	}

	private List<Pergunta> criarPerguntas() {
		List<Pergunta> perguntas = new ArrayList<>();
		Alternativa alternativas;
		Pergunta pergunta;
		String Titulo; 

		//Questão 1
		alternativas =  new Alternativa()
				.setAlternativa1("A) A nossa sociedade depende da queima de combustíveis fósseis (carvão, petróleo e seus derivados, como o óleo diesel e a gasolina), responsáveis juntos por 80 % do problema.")
				.setAlternativa2("B) É um processo natural. Os raios do sol aquecem a superfície do planeta, que emite ondas de calor. O calor é perdido para o espaço, mas parte destas ondas é retida na atmosfera, o que faz com que a temperatura média do planeta fique em 13 graus Celsius e as condições favoráveis à vida")
				.setAlternativa3("C) Existe um ciclo natural de aquecimento e resfriamento do planeta que aconteceu nos últimos 400 mil anos, com as Eras Glaciais e períodos interglaciais mais quentes")
				.setAlternativa4("D) O que seria o dobro da concentração existente na atmosfera antes da industrialização.");
	
		String titulo = "1- O que é o Efeito Estufa?";

		pergunta =  new Pergunta(titulo, "B",
				alternativas);

		perguntas.add(pergunta);
		alternativas = null;
		pergunta = null;
		titulo = "";

		//Questão 2
		alternativas =  new Alternativa()
				.setAlternativa1("A) Está. Nos últimos 250 anos, a quantidade de CO2 na atmosfera aumentou de 290 para 379 partes por milhão, com previsão de chegar a 580 partes em 2100, o que seria o dobro da concentração existente na atmosfera antes da industrialização. ")
				.setAlternativa2("B) Eles conseguiram estudar o clima nos últimos 400 mil anos analisando a composição de gases das bolhas de ar aprisionadas nas geleiras da Antártida, no pólo sul. ")
				.setAlternativa3("C) O que seria o dobro da concentração existente na atmosfera antes da industrialização.")
				.setAlternativa4("D) A primeira reunião entre cientistas e governantes aconteceu em 1988 na cidade de Toronto no Canadá. O assunto só ganhou espaço na imprensa recentemente com o aumento das certezas sobre a relação do aquecimento do planeta com as atividades humanas. ");
		
		titulo = "2) A quantidade de gás carbônico está aumentando?";

		pergunta =  new Pergunta(titulo, "A",
				alternativas);

		perguntas.add(pergunta);
		alternativas = null;
		pergunta = null;

		
		//Questão 3
		alternativas =  new Alternativa()
				.setAlternativa1("A)")
				.setAlternativa2("B)")
				.setAlternativa3("C)")
				.setAlternativa4("D)");
		titulo = "";

		pergunta =  new Pergunta(titulo, "C",
				alternativas);

		perguntas.add(pergunta);
		alternativas = null;
		pergunta = null;

		
		//Questão 4
		alternativas =  new Alternativa()
				.setAlternativa1("A)")
				.setAlternativa2("B)")
				.setAlternativa3("C)")
				.setAlternativa4("D)");
		titulo = "";

		pergunta =  new Pergunta(titulo, "D",
				alternativas);

		perguntas.add(pergunta);
		alternativas = null;
		pergunta = null;

		
		
		return perguntas;			
	}

}
