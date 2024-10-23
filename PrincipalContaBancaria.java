package Atividade_23_10;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
      
        ContaBancaria contaBancaria = new ContaBancaria("1", 1000000);

        Cliente cliente = new Cliente("João", contaBancaria);

        System.out.println("Cliente: " + cliente.getNome() + "\nContaBancaria: " + contaBancaria.getNumero());
    }
}

