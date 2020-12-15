package br.edu.iftm.classes;

public class Aereo extends Transporte
{
    //Atributos
    protected int qtdPropulsor;
    
    //Método Construtor
    public Aereo(String combustivel, String piloto, int assentos, int qtdPropulsor)
    {
        super(combustivel, piloto, assentos);
        this.qtdPropulsor = qtdPropulsor;
    }

    //Métodos override
	@Override
    public void movimentar() 
    {
        System.out.println("Voando.\n");
	}

	@Override
    public void parar() 
    {
		System.out.println("Pousando.\n");
	}
}
