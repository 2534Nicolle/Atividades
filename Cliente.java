package Atividade_23_10;

public class Cliente {
	
	private String nome;
	private ContaBancaria contaBancaria;
	
	public  Cliente(String nome,ContaBancaria contaBancaria) {
	    this.nome = nome;
	    this.contaBancaria = contaBancaria;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
