package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente {
    private List<Cliente> listaCliente;

    public ListaCliente() {
        this.listaCliente = new ArrayList<>();
    }
    public void adicionarCliente(String nome, String endereco, String telefone, String email){
        listaCliente.add(new Cliente (nome,endereco,telefone,email));
        System.out.println(" Adicionado Com sucesso! ");
    }

    public void selecionarCliente(){
        for(Cliente c : listaCliente){
            System.out.println(c);
        }
    }
    public int quantidade(){
        return listaCliente.size();
    }
}
