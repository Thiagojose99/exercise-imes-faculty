//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Assoaciados a = new Assoaciados(1,"Farmacia Popular","Rua Chile",12345664,"Jardim Vitoria","Bauru",1234567897, "(14)99999-99999","Sp",10);
        Colaboradores c = new Colaboradores(12,"Thiago","Rua do Aviador",145678995,"Jardom do Sul","Bauru",456785621,"(88)8888-8888","SP","Atendente");
        Fornecedores f = new Fornecedores(123,"XYZ","Rua Ipiranga",1234567789,"Bom Jesus","Rio de Janeiro",1234567898,"(12)77777-77777","RJ","Dipirona","xyz.com");
        a.exibirInformacoes();
        System.out.println("-------------------------------------------------");
        c.exibirInformacoes();
        System.out.println("-----------------------------------------------");
        f.exibirInformacoes();
    }
}