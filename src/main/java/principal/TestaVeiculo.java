package principal;

import poo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class TestaVeiculo {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setModelo("palio");
        veiculo1.setCor("azul");
        veiculo1.setAno(2010);

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setModelo("fiat");
        veiculo2.setCor("preto");
        veiculo2.setAno(2020);

        List<Veiculo> veiculos  = new ArrayList<Veiculo>();
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);

        mostrarValoresAtributos(veiculos);

    }

    private static void mostrarValoresAtributos(List<Veiculo> veiculos) {
        if(veiculos != null){
            System.out.println("---LISTA DE VEICULO---");
            for (Veiculo veiculo : veiculos) {
                veiculo.exibe();
                System.out.println("\n");
            }
        }
    }
}
