package Atividade_23_10;

public class Carro extends Brinquedo{
		
		public Carro(String nome, String sexo, String raca) {
			super(nome, sexo, raca);
		}
		
		@Override
		public void emitirSom() {
			System.out.println("O cachorro está latindo.");
		}

	}

}
