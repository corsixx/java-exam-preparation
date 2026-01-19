package eserciziesame.noleggioAuto;

import java.util.Scanner;

/*Scrivere una classe Solver che crea un Noleggio. Quindi, la classe legge da
standard input una sequenza di righe che comincia con i seguenti comandi (pensate
opportunamente il resto della riga di comando)
ADD ....
R ....
NAuto ....
NMoto ...
S...
END...
Le righe che iniziano con ADD richiedono di inserire un nuovo veicolo. Dopo
l’inserimento, viene stampato il veicolo (con una opportuna toString()).
Le righe che iniziano con R restituiscono il veicolo. Dopo la restituzione viene
stampata la lista dei veicoli, ordinata per numero di noleggi.
Le righe che iniziano con NAuto o NAuto richiedono di noleggiare una auto o una
moto. Il risultato del noleggio deve produrre in stampa il veicolo noleggiato, o deve
fornire una stringa del tipo Auto/Moto non disponibile.
Le righe che iniziano con S richiedono ordinare la lista di veicoli per anno di
immatricolazione e di stamparla.
Il programma termina quando viene inserita una riga che comincia con END.
Per questo tipo di input è conveniente utilizzare un ciclo basato su uno Scanner:
fin tanto che Scanner.hasNext() restituisce true leggete il prossimo input
utilizzando Scanner.next() per le parole e Scanner.nextInt() per gli interi.
Non vanno fatte assunzioni sul numero di linee in input. L’input va letto da
standard input, possibilmente utilizzando la redirezione fornita da shell (si veda
l’esempio sotto) */
public class Solver {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PROGRAMMA NOLEGGIO AUTO");
        NoleggioAuto noleggio = new NoleggioAuto();
        while (scanner.hasNext()) {
            String operazione = scanner.next();
            switch (operazione) {
                case "ADD": {
                    String tipoVeicolo = scanner.next();
                    if (tipoVeicolo.equals("A")) {
                        int nPax = scanner.nextInt();
                        String targa = scanner.next();
                        String modello = scanner.next();
                        int annoImmatricolazione = scanner.nextInt();
                        int numeroNoleggi = scanner.nextInt();
                        noleggio.aggiungiVeicolo(new Auto(nPax, targa, modello, annoImmatricolazione, numeroNoleggi));
                    } else if (tipoVeicolo.equals("M")) {
                        int cavalli = scanner.nextInt();
                        String targa = scanner.next();
                        String modello = scanner.next();
                        int annoImmatricolazione = scanner.nextInt();
                        int numeroNoleggi = scanner.nextInt();
                        noleggio.aggiungiVeicolo(
                                new Moto(cavalli, targa, modello, annoImmatricolazione, numeroNoleggi));
                    }
                }
                case "R": {
                    String tipoVeicolo = scanner.next();
                    if (tipoVeicolo.equals("A")) {
                        int nPax = scanner.nextInt();
                        String targa = scanner.next();
                        String modello = scanner.next();
                        int annoImmatricolazione = scanner.nextInt();
                        int numeroNoleggi = scanner.nextInt();
                        noleggio.restituisciVeicolo(
                                new Auto(numeroNoleggi, targa, modello, annoImmatricolazione, numeroNoleggi));
                    } else if (tipoVeicolo.equals("M")) {
                        int cavalli = scanner.nextInt();
                        String targa = scanner.next();
                        String modello = scanner.next();
                        int annoImmatricolazione = scanner.nextInt();
                        int numeroNoleggi = scanner.nextInt();
                        noleggio.restituisciVeicolo(
                                new Moto(cavalli, targa, modello, annoImmatricolazione, numeroNoleggi));
                    }
                    noleggio.veicoliPerNoleggi();
                }
                case "NAuto": {

                }
                case "NMoto": {

                }
                case "S": {

                }
                case "END": {
                    System.out.println("FINE PROGRAMMA");
                    return;
                }
            }
        }
    }
}
