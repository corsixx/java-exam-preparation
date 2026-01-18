package esercizilab.lab14.es1;
/*Esercizio 1
Implementare e testare una classe fornita.
Tempo: 5 min.
Implementate la classe Contatore, definita in Figura 1. Istanziatela e chiamatela
da una apposta classe, definita in un file a parte, contenente il main. */
public class Contatore
{
    private int a;
    public Contatore()
    {
        this.a=0;
    }
    public Contatore(int aa)
    {
        this.a = aa;
    }
    public void inc()
    {
        this.a+=1;
    }
    public void reset()
    {
        this.a = 0;
    }
    public int getA()
    {
        return this.a;
    }
}
