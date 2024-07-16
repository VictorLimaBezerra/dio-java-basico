public class SmartTv {
    boolean ligada = false;
    int canal = 11;
    int volume = 15;

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void aumetarVolume (){
        ++volume;
        System.out.println("Volume aumentado para: "+volume);      
    }

    public void diminuirVolume (){
        --volume;
        System.out.println("Volume diminuído para: "+volume);
    }

    public void avançarCanal (){
        canal++;
        System.out.println("Canal avançado para: "+canal);
    }

    public void diminuirCanal (){
        canal--;
        System.out.println("Canal diminuído para: "+canal);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}