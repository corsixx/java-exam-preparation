package eserciziesame.macchinettaDelCaffe;

public class Merendina extends Prodotto {
    private int calorie;

    public Merendina(int calorie, int costo, String nome) {
        super(costo, nome);
        this.calorie = calorie;
    }

    public int getCalorie() {
        return this.calorie;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.calorie + " calorie";
    }
    // super usa toString della classe padre Prodotto ealla stampa del genitore
    // aggiunge calorie
}
