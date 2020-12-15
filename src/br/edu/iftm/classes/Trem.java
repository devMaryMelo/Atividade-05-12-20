package br.edu.iftm.classes;

public class Trem extends Terrestre
{
    //Atributos
    private int vagoes;
   
    //Método construtor
    public Trem(String combustivel, String piloto, int assentos, int numRodas, int vagoes)
    {
        super(combustivel, piloto, assentos, numRodas);
        this.vagoes = vagoes;
    }

    //Métodos
    public void partir(boolean defeito)
    {
        if(defeito)
        {
            System.out.println("O trem não pode deixar a estacao, pois esta com defeito!!");
        }
        else if(!defeito)
        {
            System.out.println("\nO trem esta novinho em folha e pode deixar a estacao!");
        }
    }

    public void partir(String horario)
    {
        if(horario.equals("manha"))
        {
            System.out.println("O trem esta deixando a estacao");
        }
        else if(horario.equals("tarde"))
        {
            System.out.println("O trem esta chegando na estacao");
        }
        else if(horario.equals("noite"))
        {
            System.out.println("Horario encerrado.");
        }
    }
    
    @Override
    public final void movimentar()
    {
        System.out.println("O trem está se locomovendo.");
    }

    @Override
    public final void parar()
    {
        System.out.println("Parando engrenagens do trem!");
    }

    //Getters e Setters
    public int getVagoes()
    {
        return vagoes;
    }

    public void setVagoes(int vagoes)
    {
        this.vagoes = vagoes;
    }
}
