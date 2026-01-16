package eserciziesame.macchinettaDelCaffe;

public class Bevanda extends Prodotto {
    private int volume;

    public Bevanda(int volume, int costo, String nome) {
        super(costo, nome);
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return "Bevanda[nome: " + super.getNome() + ",volume: " + this.volume + ",costo: " + super.getCosto() + "]";
    }

}
