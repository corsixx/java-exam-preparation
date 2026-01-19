package eserciziesame.noleggioAuto;

public class Moto extends Veicolo {
    private int Cavalli;

    public Moto(int Cavalli, String Targa, String Modello, int annoDiImmatricolazione, int numeroNoleggi) {
        super(Targa, Modello, annoDiImmatricolazione, numeroNoleggi);
        if (Cavalli >= 200 && Cavalli <= 2000)
            this.Cavalli = Cavalli;
        else
            this.Cavalli = 1000;
    }

    public int getCavalli() {
        return this.Cavalli;
    }
}
