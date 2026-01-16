package eserciziesame.macchinettaDelCaffe;

public abstract class Prodotto {
    private int costo;
    private String nome;

    public Prodotto(int costo, String nome) {
        this.costo = costo;
        this.nome = nome;
    }

    public int getCosto() {
        return this.costo;
    }

    public String getNome() {
        return this.nome;
    }
}
