public class Pessoa {
    String cabelo;
    int idade;

    public Pessoa(String corte, int anos){
        this.cabelo = corte;
        this.idade = anos;
    }
    public String toString(){
        return "corte: "+cabelo+", idade: "+idade;
    }
}
