package esercizilab.lab14.es3;
/*Progettare e implementare classi che usano classi definite in precedenza.
Tempo: 30 min.
Creare una classe Segmento basandosi su Vett. Per farlo, aggiungete i metodi
necessari a Vett. Create i) un metodo equals per le classi Vett e per Segmento,
che stabilisca se due oggetti – dello stesso tipo – sono equivalenti, e ii) un metodo
copy, che crea una copia di un oggetto identico all’attuale. Fate lo stesso per la
classe Cerchio.
Testate i metodi sviluppati in un apposito main. */
public class Segmento 
{
    private Vett puntoA;
    private Vett puntoB;
    public Segmento(Vett puntoA, Vett puntoB)
    {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    public Segmento(double x1, double y1, double x2, double y2)
    {
        this.puntoA = new Vett(x1, y1);
        this.puntoB = new Vett(x2, y2);
    }
    public Vett getA()
    {
        return this.puntoA;
    }
    public Vett GetB()
    {
        return this.puntoB;
    }
    public boolean equals(Segmento other)
    {
        if(this.puntoA.equals(other.puntoA) && this.puntoB.equals(other.puntoB))
            return true;
        else
            return false;
    }
}
