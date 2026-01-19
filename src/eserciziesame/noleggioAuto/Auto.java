package eserciziesame.noleggioAuto;

/*Classe Auto: Sottoclasse di Veicolo le cui istanze rappresentano una au-
to. Oltre alla targa, e l’anno di immatricolazione una auto è caratterizzata
dall’attributo numeroPax che deve essere tra 2 e 8 e identifica il numero
di persone per cui l’auto è immatricolata. Se il numero non è compreso tra
2 e 8, viene assegnato di default il valore 5. */
public class Auto extends Veicolo {
    private int numeroPax;

    public Auto(int numeroPax, String Targa, String Modello, int annoDiImmatricolazione, int numeroNoleggi) {
        super(Targa, Modello, annoDiImmatricolazione, numeroNoleggi);
        if (numeroPax >= 2 && numeroPax <= 8)
            this.numeroPax = numeroPax;
        else
            this.numeroPax = 5;
    }

    public int getNumeroPax() {
        return this.numeroPax;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero di Passeggeri: " + this.numeroPax;
    }
}
