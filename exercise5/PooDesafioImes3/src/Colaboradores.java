public class Colaboradores extends Cadastro {
    private String cargo;


    public Colaboradores(int id, String nome, String logradouro, long cep, String bairro, String cidade, long cpfCnpj, String telefone, String uf,String cargo) {
        super(id, nome, logradouro, cep, bairro, cidade, cpfCnpj, telefone, uf);
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(" Colaboradores");
        super.exibirInformacoes();
        System.out.println(" Cargo: "+cargo);
    }
}
