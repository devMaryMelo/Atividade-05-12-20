package br.edu.iftm.classes;

public class Terrestre extends Transporte
{
    protected int numRodas;
    
    //Método construtor
    public Terrestre(String combustivel, String piloto, int assentos, int numRodas)
    {
        super(combustivel, piloto, assentos);
        this.numRodas = numRodas;
    }

    //Métodos Override
    @Override
    public void movimentar() 
    {
        System.out.println("Acelerando.\n");
    }

    @Override
    public void parar() 
    {
        System.out.println("Estacionando.\n");
    }
}
