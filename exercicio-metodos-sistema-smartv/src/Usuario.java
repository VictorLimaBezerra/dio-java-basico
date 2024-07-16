public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Situação modificada: TV ligada? "+smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.avançarCanal();
        smartTv.avançarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(4);
        System.out.println("Canal atual: "+smartTv.canal);

        smartTv.desligar();
        System.out.println("Situação modificada: TV ligada? "+smartTv.ligada);
    }
}
