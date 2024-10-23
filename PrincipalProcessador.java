package Atividade_23_10;

import RelacionamentoClasses.Composição.Pessoa;

public class PrincipalProcessador {

    public static void main(String[] args) {

        Processador processador = new Processador("Intel", "3.6");

        Computador computador = new Computador("Dell", processador);

        System.out.println("O computador " + computador.getModelo() + " possui um processador " + processador.getMarca() + " de " + processador.getFrequencia() + " GHz.");
    }
}
