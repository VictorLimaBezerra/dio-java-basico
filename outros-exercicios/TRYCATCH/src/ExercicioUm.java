import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class ExercicioUm {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o teu nome.");
        String nome = scanner.next();

        System.out.println("Digite a última parte do teu sobrenome.");
        String sobrenome = scanner.next();

        System.out.println("Digite a tua idade.");
        int idade = scanner.nextInt();

        System.out.println("Digite a tua altura");
        double altura = scanner.nextDouble();

        System.out.println("Nome fornecido: " + nome.toUpperCase()+"\nSobrenome fornecido: "+ sobrenome.toUpperCase()+"\nIdade fornecida : " + idade+"\nAltura fornecida: "+altura);
    
        scanner.close();

        }catch(InputMismatchException e){
            System.out.println("Os campos altura e idade são NÚMERICOS");
        }

    }
}
