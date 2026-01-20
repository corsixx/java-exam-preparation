package eserciziesame.Garage;

/*Scrivete una funzione main che crea N persone 
(N è un valore chiesto all’utente come prima azione del main). 
Per ogni persona, il programma chiede di inserire il modello della sua auto, 
e assegna a ogni auto una targa univoca, ovvero un valore intero a tre cifre 
(cominciate con la prima auto che avrà valore 100).
A questo punto, il main da la possibilità a ogni utente di scegliere, 
tramite un menù a tendina, chi entra nel garage e chi esce dal garage.

Per la precisione; i comandi:
“E nome”
“U nome”
Indicano una persona che entra (E) o esce (U) dal garage
Il programma termina quando il comando inserito è “F” */
import java.util.Scanner;
import java.util.ArrayList;

public class Solver {
    static Persona trovaPersona(String nome, ArrayList<Persona> persone) {
        for (Persona p : persone) {
            if (p.getNome().equalsIgnoreCase(nome))
                return p;
        }
        return null;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PROGRAMMA GARAGE AUTO");
        System.out.print("inserisci quante persone vuoi aggiugnere: ");
        int n = scanner.nextInt();
        Garage garage = new Garage(n - 2);
        ArrayList<Persona> persone = new ArrayList<>();
        int targa = 100;
        for (int i = 0; i < n; i++) {
            System.out.print("Persona " + (i + 1) + ", indica il tuo nome:");
            String nome = scanner.next();
            System.out.println();
            System.out.print("Persona " + (i + 1) + ", e il modello della tua auto:");
            String modelloIn = scanner.next();
            persone.add(new Persona(nome, new Auto(modelloIn, targa)));
            targa++;
        }
        String inOut;
        System.out.println("usare i comandi per accedere/uscire dal garage:");
        System.out.println("-> 'E nome'(entrata nel garage)");
        System.out.println("-> 'U nome' (uscita dal garage)");
        System.out.println("-> 'F'(TERMINA)");
        System.out.print("inserisci l'opearazione da eseguire e l'utente:");
        inOut = scanner.next();
        while (!inOut.equals("F")) {
            switch (inOut) {
                case "E": {
                    inOut = scanner.next();
                    Persona personaTrovata = trovaPersona(inOut, persone);
                    if (personaTrovata != null)
                        personaTrovata.parcheggia(garage);
                    else
                        System.out.println("-> persona non trovata !!");
                    garage.visualizzaAuto();
                    break;
                }
                case "U": {
                    inOut = scanner.next();
                    Persona personaTrovata = trovaPersona(inOut, persone);
                    if (personaTrovata != null)
                        personaTrovata.rimuoviAuto(garage);
                    else
                        System.out.println("-> persona non trovata !!");
                    garage.visualizzaAuto();
                    break;
                }
                default: {
                    System.out.println("comando non valido!!");
                }
            }
            System.out.println("usare i comandi per accedere/uscire dal garage:");
            System.out.println("-> 'E nome'(entrata nel garage)");
            System.out.println("-> 'U nome' (uscita dal garage)");
            System.out.println("-> 'F'(TERMINA)");
            System.out.print("inserisci l'opearazione da eseguire e l'utente:");
            inOut = scanner.next();
        }
        System.out.println("programma terminato con F");
    }
}
