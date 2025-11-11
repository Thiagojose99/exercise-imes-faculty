public class Cadastro {
       private int id;
       private String nome;
       private String logradouro;
       private long cep;
       private String bairro;
       private String cidade;
       private String uf;
       private String telefone;
       private long cpfCnpj;


    public Cadastro(int id,String nome, String logradouro, long cep, String bairro, String cidade, long cpfCnpj, String telefone, String uf) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
        this.uf = uf;

    }

    public void exibirInformacoes(){
        System.out.println(" ID: "+ id);
        System.out.println(" Nome: "+nome);
        System.out.println(" Logradouro: "+ logradouro);
        System.out.println(" Cep: "+ cep);
        System.out.println(" Bairro: "+bairro);
        System.out.println(" Cidade: "+ cidade);
        System.out.println(" Uf: "+ uf);
        System.out.println(" Cpf/Cnpj: "+cpfCnpj);
        System.out.println(" Telefone: "+ telefone);
    }



}
/*  associados (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, situação e número de associado);

— colaborador (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, cargo ou função);

— fornecedores (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, nome fantasia e website).*/
