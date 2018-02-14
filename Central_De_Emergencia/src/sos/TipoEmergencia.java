package sos;

public enum TipoEmergencia {
	BOMBEIRO("Bombeiro",193),POLICIAL("Policial",190),SAMU("Samu", 192);
	
	private int numero;
	private String atendimento;
	
	TipoEmergencia( String atendimento, int numero){
		this.numero = numero;
		this.atendimento = atendimento;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getAtendimento() {
		return atendimento;
	}
}
