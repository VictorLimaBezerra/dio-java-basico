public class PessoaNova {
    private String nome;
    private int codidoDeIdenticacao;
    private String endereco;

    public PessoaNova(String nome, int codidoDeIdenticacao){
        this.nome = nome;
        this.codidoDeIdenticacao = codidoDeIdenticacao;
    }


    public String getNome() {
        return nome;
    }

    public int getCodidoDeIdenticacao() {
        return codidoDeIdenticacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
