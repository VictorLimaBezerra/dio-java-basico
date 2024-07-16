public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicão1 = false;
        boolean condicão2 = true;

        if (condicão2 && condicão1) {
            System.out.println("Ambas condições são verdadeiras.");
        }
        if (condicão2 || condicão1) {
            System.out.println("Alguma das condições são verdadeiras.");
        }
        if (condicão2 || (8 < 5)) {
            System.out.println("As sentenças são verdadeiras.");
        }
    }
}
