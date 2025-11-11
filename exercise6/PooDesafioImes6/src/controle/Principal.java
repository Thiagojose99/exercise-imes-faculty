package controle;


import modelo.Cliente;
import modelo.ListaCliente;
import modelo.ListaModelo;
import modelo.Modelo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaCliente list = new ListaCliente();
        ListaModelo listMo = new ListaModelo();

       while (true){
           System.out.println(" (1) Cliente");
           System.out.println(" (2) Carro ");
           int op = scan.nextInt();
           switch (op){
               case 1 :
                   while (true){
                       System.out.println(" ( 1 ) Adicionar Cliente");
                       System.out.println(" ( 2 ) Ver Cliente");
                       System.out.println(" ( 3 ) Voltar");
                       int op2 = scan.nextInt();
                       if(op2 == 1){
                           System.out.println(" Nome: ");
                           String nome = scan.next();
                           scan.nextLine();
                           System.out.println(" Endereço: ");
                           String endereco = scan.nextLine();
                           scan.nextLine();
                           System.out.println(" Telefone: ");
                           String telefone = scan.nextLine();
                           scan.nextLine();
                           System.out.println(" Email: ");
                           String email= scan.nextLine();
                           scan.nextLine();
                           list.adicionarCliente(nome,telefone,endereco,email);

                       } else if (op2 == 2) {
                           int quant = list.quantidade();
                           if (quant == 0){
                               System.out.println(" Não contem Cliente");
                               System.out.println(" Digite 1 para Cadastrar");
                           }
                           else{
                               list.selecionarCliente();
                           }




                       }
                       else if(op2 == 3){
                           break;
                       }
                   }
                   break;
               case 2 :
                   while(true){
                       System.out.println(" ( 1 )Adicionar Carro");
                       System.out.println(" ( 2 ) Ver Carros ");
                       int op3 = scan.nextInt();
                       if (op3 == 1){
                           System.out.println(" Placa: ");
                           String placa = scan.nextLine();
                           scan.nextLine();
                           System.out.println(" Modelo do Carro");
                           String modelo = scan.nextLine();
                           scan.nextLine();
                           System.out.println(" Ano do Veiculo: ");
                           int anoVeiculo = scan.nextInt();
                           System.out.println(" Fabricante do veiculo");
                           String fabricante = scan.nextLine();
                           scan.nextLine();
                           System.out.println(" Cor do veiculo");
                           String cor = scan.nextLine();
                           scan.nextLine();
                           listMo.adicionarModelo(placa,modelo,anoVeiculo,fabricante,cor);

                       }
                       else if(op3 == 2){
                           int quanti = listMo.quantidadeModelo();
                           if(quanti == 0){
                               System.out.println(" Nao contem Carros");
                               System.out.println(" Digite 1 para Cadastrar");

                           }else{
                               listMo.mostrarCarros();
                           }

                       }
                       else if(op3 == 3){
                           break;
                       }


                   }
                   break;
               case 3:
                   break;


           }

       }





    }
}