package CalculadoraFC;

public class RegraCalculoFrequenciaCardiaca {

	private int frequenciaMAX;
	private double frequenciaAlvo;
	
	private Pessoa pessoa;
	
	public RegraCalculoFrequenciaCardiaca(Pessoa pessoa){
		this.pessoa = pessoa;
	}
	
	public void calcularFrequenciaMAX(){
		
		if(pessoa.getSexo() == Sexo.HOMEM){
			 frequenciaMAX = 220 - pessoa.getIdade();
		}else{
			frequenciaMAX = 226 - pessoa.getIdade();
		}
	}
	
	public void calcularFrquenciaAlvo(){
		frequenciaAlvo = (frequenciaMAX * 60)/100;
	}
	
	public void imprimirResultado(){
		StringBuffer dados = new StringBuffer();
		dados.append("Nome: ");
		dados.append(pessoa.getNome() + " ");
		dados.append(pessoa.getSobreNome());
		dados.append("\n");
		dados.append("Data de Nascimento: ");
		dados.append(pessoa.getDataNascimento());
		dados.append("\n");
		dados.append("Sexo: ");
		dados.append(pessoa.getSexo());
		dados.append("\n");
		dados.append("Idade: ");
		dados.append(pessoa.getIdade());
		dados.append("\n");
		dados.append("Frequencia Cardiaca Maxima: ");
		dados.append(frequenciaMAX);
		dados.append("\n");
		dados.append("Frequencia Cardiaca Alvo: ");
		dados.append(frequenciaAlvo);
		
		System.out.println(dados.toString());
	}
	
}
