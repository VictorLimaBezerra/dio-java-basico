public class Operadores {
    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = 7;
        numero2 = 18;

        boolean simNao = numero1 == numero2;
        System.out.println("Os numeros 1 e 2 são iguais? "+simNao);

        simNao = numero1 != numero2;
        System.out.println("Os numeros 1 e 2 são diferentes? "+simNao);

        simNao = numero1 >= numero2;
        System.out.println("O numero 1 é maior ou igual ao 2? "+simNao);

        simNao = numero1 <= numero2;
        System.out.println("O numero 1 é menor ou igual ao 2? "+simNao);

    }
}
