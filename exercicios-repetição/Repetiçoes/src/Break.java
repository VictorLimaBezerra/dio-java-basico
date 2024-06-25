public class Break {
    public static void main(String[] args) {
        for(int z = 1; z <= 6; z++){
            if (z == 4) {
                continue;
            }

            if (z==5) {
                break;
            }
            System.out.println(z);
        }

    }
}
