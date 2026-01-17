package esercizilab.lab13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Scrivete un programma che legge in input una stringa contente una frase e calcola il
 numero di occorrenze di ciascuna parola nella frase, indipendentemente da maiusco-
le e minuscole. Non dovete considerare spazi e segni di punteggiatura. Suddividete
il codice in funzioni, e usate delle strutture dati dinamiche*/
public class es12 
{
    static HashMap contaOccorrenze(String s)
    {
        /*avrei utilizzato una matrice di arraylist ma ho scoperto che ce una struttura piu semplice, cioe HashMap*/
        HashMap<String,Integer> occorrenze = new HashMap<>();
        String frasePulita = s.toLowerCase();
        String[] tokens = frasePulita.split("[\\p{Punct}\\s]+");
        //utilizzo le regex
        //[ e ]: Le parentesi quadre creano una classe di caratteri.
        // \\p{Punct}: È un codice standard che indica tutta la punteggiatura
        // \\s indica spazio
        // + indica che si prendono anche punteggiture/spazi doppi
        for(String parole : tokens)
        {
            // Se la chiave non esiste, la aggiungo con valore 1
            if (!occorrenze.containsKey(parole)) 
            {
                occorrenze.put(parole, 1);
            } 
            // Se esiste già, prendo il vecchio valore e aggiungo 1
            else 
            {
                int vecchioConteggio = occorrenze.get(parole);
                /*get(Object chiave): Restituisce il valore associato. Se la chiave non c'è, restituisce null. */
                occorrenze.put(parole, vecchioConteggio + 1);
            }
        }
        return occorrenze;
    }
    static void stampaRisultati(HashMap<String, Integer> occorrenze) 
    {
        System.out.println("\n--- Occorrenze delle parole ---");
        if (occorrenze.isEmpty()) {
            System.out.println("Nessuna parola trovata.");
            return;
        }

        // Usiamo un ciclo for-each sul "Set" delle voci (Entry) della mappa
        for (Map.Entry<String, Integer> cella : occorrenze.entrySet()) 
        {
            System.out.println(cella.getKey() + ": " + cella.getValue());
        }
        //Map.Entry<String, Integer> è semplicemente il tipo di dato che rappresenta una singola cella della hashmap.
        /*Nell'HashMap ci dati sono sparsi (non sono in fila). 
        è come se accoppiase valore e chiave  un unico pacchetto cosi puoi farci l'iterazione e selezioanrli*/
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("PROGRAMMA CONTA OCCORRENZE");
        System.out.print("immetti una stringa: ");
        String stringa1 = scanner.nextLine();
        HashMap<String, Integer> conteggio = contaOccorrenze(stringa1);
        stampaRisultati(conteggio);
    }
}
