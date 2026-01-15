package eserciziteoria;

import java.util.Scanner;

public class stampaQ 
{
    public static void main(String [] args)
    {
        // Stampa una riga e va a capo.
        System.out.println("Hello, World!");
        // Stampa una riga e non va a capo).
        System.out.print("Hello, World!");
        // Stampa una riga con formattazione.
        System.out.printf("Hello, %s!\n", "World");
        // Creiamo un oggetto scanner
        Scanner scanner = new Scanner(System.in);
        // Leggi un intero
        System.out.println("Ora inserisci un intero.");
        int i = scanner.nextInt();
        System.out.printf("Hai inserito, %d.\n", i);
        //metodo Davide Corso
        System.out.println("Hello, World! "+i+" diocane");
        // Chiudiamo scanner quando non serve più
        scanner.close();
    }
}
