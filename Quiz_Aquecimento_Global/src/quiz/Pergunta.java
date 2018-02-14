package quiz;

import java.util.Map;

public class Pergunta {

	private String titulo;
	private Alternativa alternativas;
	private String alternativaCorreta ;
	
	public Pergunta(){}
	
	public Pergunta(String titulo, String alternativaCorreta,
			Alternativa alternativas){
		this.titulo = titulo;
		this.alternativaCorreta  = alternativaCorreta;
		this.alternativas = alternativas;
		}
	
	public String getTitulo() {
		return titulo;
	}
	public  Alternativa getAlternativas() {
		return alternativas;
	}
	public String getAlternativaCorreta() {
		return alternativaCorreta ;
	}
	
	
}
