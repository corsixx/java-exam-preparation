package esercizilab.lab14.es3;
/*ESERCIZIO 3
Scrivete un programma che permetta di calcolare il perimetro di un cerchio dato il
raggio. Per farlo, creare una classe Cerchio.
Per definire il centro della classe Cerchio, utilizzate un Vett, definito nell’e-
sercizio 3. Aggiungete metodi a Vett se ne avete bisogno.
Aggiungete ulteriori classi che possono servire a definire un oggetto di tipo Cerchio.
Utilizzare le classi definite negli esercizi precedenti. Progettate con criterio i co-
struttori di Cerchio, i metodi, e gli attributi, considerando la loro visibilità. */
/*ESERCIZIO 4
Implementate nuovi metodi per la classe Cerchio:
• Calcolo dell’area del cerchio
• Metodo isConcentric per valutare se un cerchio è concentrico rispetto ad
un altro
• Metodo contains che specifica se un cerchio è contenuto in un altro. */
public class Cerchio
{
    private Vett CentroCerchio;
    private double raggio;
    public Cerchio()    //costruttore di default
    {
        this.CentroCerchio = new Vett(0,0);
        this.raggio = 1;
    }
    public Cerchio(double x, double y, double raggio)   //costruttore con coordinate e raggio
    {
        this.CentroCerchio = new Vett(x,y);
        this.raggio = raggio;
    }
    public Cerchio(Vett punto, double raggio)   //costruttore con punto e raggio
    {
        this.CentroCerchio = new Vett(punto);
        this.raggio = raggio;
    }
    public double getRaggio()
    {
        return this.raggio;
    }
    public Vett getCentroCerchio()
    {
        return this.CentroCerchio;
    }
    public double calcolaPerimetroCerchio()
    {
        return 2*Math.PI*raggio;
    }
    public double calcolaAreaCerchio()
    {
        return Math.PI*Math.pow(this.raggio, 2);
    }
    public boolean isConcentric(Cerchio other)
    {
        if(this.CentroCerchio.getX() == other.CentroCerchio.getX() && this.CentroCerchio.getY() == other.CentroCerchio.getY())
        {
            if(this.raggio != other.raggio)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public Cerchio contains(Cerchio other)
    {
        double distanzaTraCentri = this.CentroCerchio.distanzaDa(other.CentroCerchio);
        if(this.raggio > other.raggio)
        {
            if(distanzaTraCentri <= this.raggio - other.raggio)
            {
                return other;
            }
        }
        else if(this.raggio < other.raggio)
        {
            if(distanzaTraCentri <= other.raggio - this.raggio)
            {
                return this;
            }
        }
        else if(this.raggio == other.raggio && distanzaTraCentri == 0)
        {
            return this; //sono uguali
        }
        return null; //nessuno dei due è contenuto nell'altro
    }
    @Override
    public String toString()
    {
        return "Cerchio di raggio: "+this.raggio+" e cordinate "+this.CentroCerchio.toString();
    }
    public Cerchio copy()
    {
        return new Cerchio(this.CentroCerchio, this.raggio);
    }
}
