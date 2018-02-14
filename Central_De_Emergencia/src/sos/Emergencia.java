package sos;

import java.time.LocalDateTime;

public class Emergencia {

	private String nomeAutor;
	private String endereco;
	private String telefoneAutor;
	private String descricaoSocorro;
	private LocalDateTime data;
	private TipoEmergencia tipo;
	
	public Emergencia(String nomeAutor,String telefone, String endereco, String descricaoSocorro, TipoEmergencia tipo) {
		this.nomeAutor = nomeAutor;
		this.telefoneAutor = telefone;
		this.endereco = endereco;
		this.descricaoSocorro = descricaoSocorro;
		this.data = LocalDateTime.now();
		this.tipo = tipo;
	}

	public String gerarEmergencia() {
		String emergencia = String.format("Nome: %s\n Telefone: %s\n Endereço: %s\n Data: %s\n Descrição: %s\n Atendimento: %S\t%d "
				, nomeAutor,telefoneAutor,endereco,data.toString(),descricaoSocorro
				,tipo.getAtendimento(), tipo.getNumero());
		
		return emergencia;
		
	}
	
	
}
