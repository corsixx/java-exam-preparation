package eserciziesame.Hotel;
/*La classe Solver, che vi viene fornita, implementa il metodo main e i) vi permette di sperimentare facilmente con il vostro codice, 
e ii) vi fornisce una traccia dell'implementazione delle altre classi. Quindi, questa classe non deve essere modificata.

Struttura dell'Input
L'input è strutturato come segue:

Le righe con formato ADDSTANZA SUITE,<numero>,<numero-letti>,<numero-ambienti> aggiungono una nuova stanza di tipo Suite.

Le righe con formato ADDSTANZA STANDARD,<numero>,<numero-letti> aggiungono una nuova stanza di tipo Standard.

Le righe con formato CHECK-IN <nome>,<tipo>,<numero-letti> corrispondono al check-in dell'ospite con nome <nome>. 
L'ospite vuole una stanza di tipo <tipo> (che può valere SUITE o STANDARD) con almeno <numero-letti>.

Le righe con formato CHECK-OUT <nome> corrispondono al check-out dell'ospite con nome <nome>.

La riga con formato END fa terminare il programma. Il programma termina anche quando non c'è più testo nello standard input. */
public class Solver 
{
    public static void main(String[] args) 
    {
        Hotel hotel = new Hotel();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine().trim();
            
            if(line.equals("END"))
                break;
            
            if(line.startsWith("ADDSTANZA SUITE"))
            {
                // Formato: ADDSTANZA SUITE,<numero>,<numero-letti>,<numero-ambienti>
                String[] parts = line.split(",");
                int numero = Integer.parseInt(parts[0].split(" ")[2]);
                int numeroLetti = Integer.parseInt(parts[1]);
                int numeroAmbienti = Integer.parseInt(parts[2]);
                
                Suite suite = new Suite(numero, numeroLetti, numeroAmbienti);
                hotel.aggiungiStanza(suite);
                System.out.println("Aggiunta Suite numero " + numero);
            }
            else if(line.startsWith("ADDSTANZA STANDARD"))
            {
                // Formato: ADDSTANZA STANDARD,<numero>,<numero-letti>
                String[] parts = line.split(",");
                int numero = Integer.parseInt(parts[0].split(" ")[2]);
                int numeroLetti = Integer.parseInt(parts[1]);
                
                Standard standard = new Standard(numero, numeroLetti);
                hotel.aggiungiStanza(standard);
                System.out.println("Aggiunta Standard numero " + numero);
            }
            else if(line.startsWith("CHECK-IN"))
            {
                // Formato: CHECK-IN <nome>,<tipo>,<numero-letti>
                String[] parts = line.substring(8).trim().split(",");
                String nome = parts[0].trim();
                String tipo = parts[1].trim();
                int numeroLetti = Integer.parseInt(parts[2].trim());
                
                boolean suite = tipo.equals("SUITE");
                Stanza stanza = hotel.assegna(nome, suite, numeroLetti);
                
                if(stanza != null)
                {
                    System.out.println("Check-in eseguito: " + nome + " -> " + stanza);
                }
                else
                {
                    System.out.println("Check-in fallito: nessuna stanza disponibile per " + nome);
                }
            }
            else if(line.startsWith("CHECK-OUT"))
            {
                // Formato: CHECK-OUT <nome>
                String nome = line.substring(9).trim();
                Stanza stanza = hotel.liberaStanza(nome);
                
                if(stanza != null)
                {
                    System.out.println("Check-out eseguito: " + nome + " da " + stanza);
                }
                else
                {
                    System.out.println("Check-out fallito: ospite " + nome + " non trovato");
                }
            }
        }
        
        scanner.close();
    }
}
