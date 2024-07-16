package org.example;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo", "São Paulo",11),
    RIO_DE_JANIERO ("RJ","Rio de Janeiro", "Rio de Janeiro",21),
    PIAUI ("PI","Piauí", "Teresina",89),
    MARANHAO ("MA", "Maranhão", "São Luís",98),
    CEARA ("CE","Ceara", "Fortaleza", 85),

    ;

    private String sigla;
    private String nome;
    private String capital;
    private int ddd;

    private EstadoBrasileiro(String sigla, String nome, String capital, int ddd) {
        this.nome = nome;
        this.sigla = sigla;
        this.capital = capital;
        this.ddd = ddd;
    }

    public String getCapital() {
        return capital.toUpperCase();
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome(){
        return  nome.toUpperCase();
    }

    public int getDdd() {
        return ddd;
    }
}
