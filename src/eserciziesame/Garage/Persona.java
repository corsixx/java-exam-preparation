package eserciziesame.Garage;

/*Classe Persona: rappresenta una persona che possiede un'auto.
• Attributi:
	o String nome: il nome della persona.
	o Auto auto: l'auto posseduta dalla persona.
• Metodi:
	o public void parcheggia(Garage garage)
        permette alla persona di parcheggiare la propria auto nel garage.
	o public void rimuoviAuto(Garage garage)
        permette alla persona di rimuovere la propria auto dal garage. */
public class Persona {
    private String nome;
    private Auto auto;

    public Persona(String nome, Auto auto) {
        this.nome = nome;
        this.auto = auto;
    }

    public void parcheggia(Garage garage) {
        if (garage.getCapienza() > garage.getPostiOccupati()) {
            if (garage.aggiungiAuto(this.auto) == 1)
                System.out.println("parcheggio eseguito dall'" + this.auto);
            else
                System.out.println("impossibile parcheggiare l'" + this.auto);
        } else
            System.out.println("->tutti i posti sono occupati");
    }

    public void rimuoviAuto(Garage garage) {
        garage.rimuoviAuto(this.auto);
    }

    public String getNome() {
        return this.nome;
    }
}
