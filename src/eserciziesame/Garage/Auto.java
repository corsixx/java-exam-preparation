package eserciziesame.Garage;
/*Classe Auto: rappresenta un'auto.
• Attributi:
	o String modello: il modello dell'auto.
	o int targa: la targa dell'auto. E’ univoca per auto. Altrimenti detto, due auto devono avere targhe diverse.
 */
public class Auto 
{
    private String Modello;
    private int Targa;
    public Auto(String Modello, int Targa)
    {
        this.Modello = Modello;
        this.Targa = Targa;
    }
    public Auto(Auto other)
    {
        this.Modello = other.Modello;
        this.Targa = other.Targa;
    }
    public int getTarga()
    {
        return this.Targa;
    }
    @Override
    public String toString()
    {
        return "auto modello: "+this.Modello+" targa: "+this.Targa;
    }
}
