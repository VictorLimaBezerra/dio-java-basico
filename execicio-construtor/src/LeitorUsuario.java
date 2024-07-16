public class LeitorUsuario {
    public static void main(String[] args) {
        Usuario pijas = new Usuario(4, "pica", 2000.00);
        Usuario pijas2 = new Usuario(8, "pica", 2500.000001);
        System.out.println(pijas.credencial);
        System.out.println(pijas2.credencial);
        System.out.println(pijas2.salario);
        
    }
}
