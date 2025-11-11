package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaModelo {

    private List<Modelo> listaModelo;

    public ListaModelo() {
        this.listaModelo = new ArrayList<>();
    }
    public void adicionarModelo(String placaVeiculo, String modelo, int anoVeiculo, String fabricanteVeiculo, String corVeiculo){
        listaModelo.add(new Modelo(placaVeiculo, modelo, anoVeiculo, fabricanteVeiculo, corVeiculo));
        System.out.println(" Adicionado com Sucesso");
    }
    public void mostrarCarros(){
        for(Modelo m : listaModelo){
            System.out.println(m);
        }

        }
        public int quantidadeModelo(){
        return listaModelo.size();
    }




}
