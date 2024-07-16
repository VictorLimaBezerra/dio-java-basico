import java.util.concurrent.ThreadLocalRandom;
public class ExercicioWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Valor do doce adicionado ao carrinho: "+valorDoce);
            mesada = mesada - valorDoce;
        }

        System.out.println("Saldo da mesada: "+mesada);
        System.out.println("Astolfo gastou toda a mesada em doce.");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
