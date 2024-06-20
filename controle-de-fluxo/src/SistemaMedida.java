public class SistemaMedida {
    public static void main(String[] args) {
        
        String tamanho = "P";
        
        switch (tamanho) {
            case "PP":{
                System.out.println("Pequeno-");
                break;
            }

            case "P":{
                System.out.println("Pequeno");
                break;
            }
            
            case "M":{
                System.out.println("Medio");
                break;
            }

            case "G":{
                System.out.println("Grande");
                break;
            }

            case "GG":{
                System.out.println("Grande+");
                break;
            }
            
            default:
                System.out.println("Indefinido.");
                break;
        }
        
    }
}
