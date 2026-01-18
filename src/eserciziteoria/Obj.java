package eserciziteoria;

public class Obj 
{
    // 1. Variabile STATICA: ne esiste solo UNA per tutta la classe.
    // Viene creata quando il programma parte e non quando fai "new".
    private static int contatore = 0;

    // 2. Costruttore: viene chiamato ogni volta che fai "new Obj()".
    public Obj() 
    {
        // Ogni nuovo oggetto che nasce va a incrementare l'UNICO contatore esistente.
        contatore++; 
        //il this non è permesso qui perché il costruttore è statico per definizione.
    }

    // 3. Metodo di ISTANZA (non statico): restituisce il valore del contatore.
    public int getContatore() 
    {
        // Qui 'this' è permesso perché il metodo non è statico.
        return this.contatore;
    }

    public static void main(String[] args) {
        // 4. Primo oggetto: chiama il costruttore -> contatore diventa 1.
        Obj o1 = new Obj();
        
        // 5. Secondo oggetto: chiama lo STESSO costruttore -> contatore diventa 2.
        Obj o2 = new Obj();
        
        // 6. Stampa il risultato.
        System.out.printf("Contatore: %d\n", o2.getContatore());
    }
}
