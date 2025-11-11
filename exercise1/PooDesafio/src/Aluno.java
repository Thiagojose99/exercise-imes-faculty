public class Aluno {

    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private int matricula;


    // Contrutor do aluno
    public Aluno(String nome, String endereco,String telefone, String email, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone= telefone;
        this.email = email;
        this.matricula = matricula;
    }

    // São os Getters onde se visualiza os atributos
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno" +"\n"+
                " Nome:" + nome + "\n" +
                " Endereço: " + endereco + "\n" +
                " Telefone: " + telefone + "\n" +
                " Email:" + email + "\n" +
                "Matricula: " + matricula ;
    }
}
