public class SistemaCadastro {
    public static void main(String[] args) {
        PessoaNova pessoa = new PessoaNova("Claytin",344556);
        pessoa.setEndereco("Onde Judas perdeu as botas.");

        System.out.printf(
                "Nome:%s\n " +
                "Código de Identificação: %d\n " +
                "Endereço: %s\n"
                , pessoa.getNome(), pessoa.getCodidoDeIdenticacao(), pessoa.getEndereco());
    }
}
