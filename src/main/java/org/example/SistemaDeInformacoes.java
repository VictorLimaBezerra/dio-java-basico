package org.example;

public class SistemaDeInformacoes {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.printf("\tSigla: %s\n \tEstado: %s\n \tCapital: %s\n \tDDD: %d\n\n",
                    e.getSigla(), e.getNome(), e.getCapital(), e.getDdd());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.RIO_DE_JANIERO;
        System.out.println(eb.getSigla());
        System.out.println(eb.getNome());
        System.out.println(eb.getCapital());
        System.out.println(eb.getDdd());
        System.out.println(eb.getClass());
    }
}
