public class IfOperadores {
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4;

        numero1 = 7;
        numero2 = 18;

        boolean simNao = numero1 == numero2;

        if (simNao) {
            System.out.println("Os números 1 e 2 são iguais");
        }
        if (simNao = numero1 != numero2) {
            System.out.println("Os números 1 e 2 são diferentes");
        }
        if (simNao = numero1 >= numero2) {
            System.out.println("O número 1 é maior ou igual ao 2");
        }
        if (simNao = numero1 <= numero2) {
            System.out.println("O número 1 é menor ou igual ao 2");
        }

        numero3 = 15;
        numero4 = 13;

        String faros = numero3 == numero4 ? "Os números 3 e 4 são iguais." : "Os números 3 e 4 são diferentes.";
        System.out.println(faros);
        
        faros = numero3 <= numero4 ? "O número 3 é menor que o 4." : "O número 3 é maior que o 4.";
        System.out.println(faros);
    }
}
