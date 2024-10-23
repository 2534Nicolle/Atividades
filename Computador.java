package Atividade_23_10;

public class Computador {
	
	private String modelo;
	private Processador processador;
	
	public Computador (String modelo, Processador processador) {
		this.modelo = modelo;
		this.processador = processador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

}
