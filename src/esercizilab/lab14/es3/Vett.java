package esercizilab.lab14.es3;
/*Scrivete una classe che descriva un vettore Vett, che definisce un punto nello spazio
2D. 
Pensate allo stato e all’interfaccia di tale classe:
 • stato: caratteristiche intrinseche della classe.
• interfaccia: come interagisce con il resto del mondo
• costruttori: senza parametri, a partire da coordinate intere, a partire da
un altro punto
Definite quindi gli attributi e i metodi che la classe Vett deve avere. Alcuni esempi
sono:
• Possibilità di muovere il punto nello spazio dopo la creazione
• Possibilità di calcolare la distanza dal punto di origine degli assi
• Altre operazioni possono essere necessarie? Definitele e implementatele.
Create un nuovo progetto contenente il main e aggiungete la classe Vett a questo
progetto.*/
public class Vett 
{
    private double x;
    private double y;
    public Vett()
    {
        this.x = 0;
        this.y = 0;
    }
    public Vett(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Vett(Vett other) //costruttore di copia
    {
        if(other != null)
        {
            this.x = other.x;
            this.y = other.y;
        }
        else
        {
            this.x = 0.0;
            this.y = 0.0;
        }
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public void trasla(double offsetX, double offsetY)
    {
        this.x += offsetX;
        this.y += offsetY;
    }
    public double distanzaCentro()
    {
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    public double distanzaDa(Vett altro) 
    {
        double deltaX = this.x - altro.x;
        double deltaY = this.y - altro.y;
        return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
    }
    @Override
    public String toString()
    {
        return "x: "+this.x+" y: "+this.y;
    }
    public boolean equals(Vett other)
    {
        if(this.x == other.x && this.y == other.y)
            return true;
        else
            return false;
    }
}
