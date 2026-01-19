package eserciziesame.noleggioAuto;

public class Veicolo {
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
}
