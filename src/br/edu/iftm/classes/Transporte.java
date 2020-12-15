package br.edu.iftm.classes;

public abstract class Transporte 
{
    //Atributos
    protected String combustivel = "";
    protected String piloto = "";
    protected int assentos;

    //Método Construtor
    public Transporte(String combustivel, String piloto, int assentos)
    {
        this.combustivel = combustivel;
        this.piloto = piloto;
        this.assentos = assentos;
    }

    //Métodos
    public abstract void movimentar();
    public abstract void parar();
    
}
