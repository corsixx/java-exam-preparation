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
}
