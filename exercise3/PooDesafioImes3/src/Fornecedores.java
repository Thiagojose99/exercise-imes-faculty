public class Fornecedores extends Cadastro{
    private String nomeFant;
    private String website;

    public Fornecedores(int id, String nome, String logradouro, long cep, String bairro, String cidade, long cpfCnpj, String telefone, String uf,String nomeFant,String website) {
        super(id, nome, logradouro, cep, bairro, cidade, cpfCnpj, telefone, uf);
        this.nomeFant = nomeFant;
        this.website = website;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println(" Fornecedores");
        super.exibirInformacoes();
        System.out.println(" Nome Fantasia: "+ nomeFant);
        System.out.println(" Website: "+ website);
    }
}
