package Atividade_23_10;

public class Brinquedo {
	
	private String cor;
	private String tipo;
	private int velocidade;
	private String nome;
	
	public Brinquedo (String cor, String tipo, int velocidade, String nome) {
		this.cor = cor;
		this.tipo = tipo;
		this.velocidade = velocidade;
		this.nome = nome;
	}
	
	public void mover() {
		System.out.println("Movendo");
	}

}
