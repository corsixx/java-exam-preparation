package eserciziteoria;
import java.util.Scanner;
public class calcolatriceSemplicissima 
{
    static Scanner scanner = new Scanner(System.in);
    /* costanti: */
    public static final char ADDIZIONE = 0;
    public static final char SOTTRAZIONE = 1;
    /* dichiarazione funzioni ... */
    public static int addizione(int n1,int n2)
    {
        return n1+n2;
    }
    public static int sottrazione(int n1,int n2)
    {
        return n1-n2;
    }
    public static void main(String[] args)
    {
        System.out.println("PROGRAMMA CALCOLATRICE");
        int result = 0;
        System.out.print("inserisci il primo valore: ");
        int n1 = scanner.nextInt() ;
        System.out.printf("\ninserisci il secondo valore: ");
        int n2 = scanner.nextInt() ;
        System.out.printf("\nscegli l'operazione da fare\n0.ADDIZIONE \n1.SOTTRAZIONE\n");
        int scelta = scanner.nextInt() ;
        switch (scelta) 
        {
            case ADDIZIONE:     //0
                result = addizione(n1, n2);
                break;
            case SOTTRAZIONE:   //1
                result = sottrazione(n1, n2);
                break;
            default:
                System.out.println("Scelta non valida!");
        }
        System.out.println("risultato: "+result);
    }
}
