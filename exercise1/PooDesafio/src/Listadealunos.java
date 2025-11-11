import java.util.List;
import java.util.ArrayList;

public class Listadealunos {

    private List<Aluno> lista;

    // Construtor da lista
    public Listadealunos() {
        this.lista = new ArrayList<>();
    }
    // adiciona o objeto na lista
    public void adicionarAluno(String nome, String endereco, String telefone, String email, int matricula) {
        lista.add(new Aluno(nome, endereco, telefone, email, matricula));
        System.out.println("Aluno adicionado com sucesso!");
    }
 // mostra todos os objetos dentro dessa lista
    public void mostrarAlunos() {
        for (Aluno a : lista) {
            System.out.println(a);
            System.out.println("---------------------");
        }
                                    // thiagojose20172017@gmail.com
    }
}
