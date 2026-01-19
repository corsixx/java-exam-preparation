package eserciziesame.noleggioAuto;

public abstract class Veicolo {
    private String Targa;
    private String Modello;
    private int annoDiImmatricolazione;
    private int numeroNoleggi;

    public Veicolo(Veicolo other) {
        this.Targa = other.Targa;
        this.Modello = other.Modello;
        this.annoDiImmatricolazione = other.annoDiImmatricolazione;
        this.numeroNoleggi = other.numeroNoleggi;
    }

    public Veicolo(String targa, String Modello, int annoDiImmatricolazione, int numeroNoleggi) {
        this.Targa = Targa;
        this.Modello = Modello;
        if (annoDiImmatricolazione >= 1800 && annoDiImmatricolazione <= 2025)
            this.annoDiImmatricolazione = annoDiImmatricolazione;
        else
            this.annoDiImmatricolazione = 2025;
        this.numeroNoleggi = numeroNoleggi;
    }

    public int getAnnoDiImmatricolazione() {
        return this.annoDiImmatricolazione;
    }

    public String getModello() {
        return this.Modello;
    }
}
