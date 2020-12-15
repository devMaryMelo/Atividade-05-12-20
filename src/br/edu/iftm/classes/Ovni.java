package br.edu.iftm.classes;

public class Ovni extends Aereo 
{
    //Método Construtor
    public Ovni(String combustivel, String piloto, int assentos, int qtdPropulsor)
    {
        super(combustivel, piloto, assentos, qtdPropulsor);
    }

    //Métodos
    private void abduzir()
    {
        System.out.println("Ovni abduzindo vacas e desenhando em plantacoes");
    }

    //Métodos Override
    @Override
    public void movimentar()
    {
        System.out.println("\nOvni esta perambulando pelo planeta.");
    }

    @Override
    public void parar()
    {
        System.out.println("Ovni parando");
        abduzir();
    }

}
