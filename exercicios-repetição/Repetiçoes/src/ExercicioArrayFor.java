public class ExercicioArrayFor {
    public static void main(String[] args) {
        String nomes[] = {"Victor", "Rafael", "Jean", "Biel", "Wesley", "Renan"};

        for(int z = 0; z <nomes.length; z++) {
            System.out.println("O nome correspondente ao ídice "+z+" é "+nomes[z]);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Outro meio de fazer o exercio");
        System.out.println("------------------------------------------------");

        for(String nome : nomes){
            System.out.println("O nome deste ser é: "+nome);
        }
    }   
}
