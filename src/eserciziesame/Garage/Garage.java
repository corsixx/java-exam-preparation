package eserciziesame.Garage;
import java.util.ArrayList;
/*Classe Garage: rappresenta un garage in cui le persone possono parcheggiare le proprie auto.
• Attributi:
	o ArrayList<Auto> parcheggio: una lista che contiene le auto parcheggiate nel garage.
• Metodi:
	o public int aggiungiAuto(Auto auto)
        aggiunge al garage l’auto
	o public void rimuoviAuto(Auto auto)
        rimuove un'auto dal garage, ovvero rimuove l’auto con la stessa targa della auto data in input alla funzione.
	o public void visualizzaAuto()
        stampa tutte le auto parcheggiate nel garage. */
public class Garage 
{
    private ArrayList<Auto> parcheggio;
    private int capienza;
    public Garage(int capienza)
    {
        this.parcheggio = new ArrayList<>();
        this.capienza = capienza;
    }
    public int aggiungiAuto(Auto newAuto)
    {
        for(Auto a: this.parcheggio)
        {
            if(a.getTarga() == newAuto.getTarga())
                return 0;
        }
        parcheggio.add(newAuto);
        return 1;
    }
    public void rimuoviAuto(Auto newAuto)
    {
        for(Auto a: this.parcheggio)
        {
            if(a.getTarga() == newAuto.getTarga())
            {
                parcheggio.remove(newAuto);
            }
        }
    }
    public void visualizzaAuto()
    {
        for(Auto a: this.parcheggio)
        {
            System.out.println(a);
        }
    }
    public int getCapienza()
    {
        return this.capienza;
    }
    public int getPostiOccupati()
    {
        //aggiunge sicurezza poiche cosi posso vedere solo quanti posti sono occupati
        // e non tutto l'arraylist parcheggio(se facessi getParcheggio)
        return this.parcheggio.size();
    }
    public int addCapienza()
}
