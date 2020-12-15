package br.edu.iftm.teste;

import br.edu.iftm.classes.Trem;
import br.edu.iftm.classes.Ovni;

public class Teste 
{
    public static void main(String[] args)
    {
        Trem trem = new Trem("Carvao", "Maquinista", 20, 160, 400);
        trem.partir(false);
        trem.movimentar();
        trem.partir("manha");

        Ovni ovni = new Ovni("Energia Solar", "Extraterrestre", 7, 3);
        ovni.movimentar();
        ovni.parar();
    }    
}
