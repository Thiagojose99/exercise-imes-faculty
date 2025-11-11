public class Assoaciados extends Cadastro{
   private int numAssoaciado;

    public Assoaciados(int id, String nome, String logradouro, long cep, String bairro, String cidade, long cpfCnpj, String telefone, String uf, int numAssociado) {
        super(id,nome, logradouro, cep, bairro, cidade, cpfCnpj, telefone, uf);
        this.numAssoaciado = numAssoaciado;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println(" Associados");
        super.exibirInformacoes();
        System.out.println(" Numeros de Associados: "+numAssoaciado);
    }


}
