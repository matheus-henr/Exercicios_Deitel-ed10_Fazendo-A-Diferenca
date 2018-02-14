package CalculadoraFC;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String nome;
	private String sobreNome;
	private LocalDate dataNascimento;
	private Sexo sexo;
	
	public Pessoa(String nome,String sobreNome, LocalDate dataNascimento, Sexo sexo){
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}
	
	public int getIdade(){
		Period period = Period.between(dataNascimento, LocalDate.now());
		int idade = period.getYears();
		return idade;
	}
	
	
}
