import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
      Listadealunos l = new Listadealunos();
      l.adicionarAluno("Pedro","Rua dos Navegantes","(99)99999-9999","Pedro@.com",123456);

        l.adicionarAluno("Joao","Rua dos Viajantes","(99)88888-8888","Joao@.com",654321);

        l.mostrarAlunos();
    }
}