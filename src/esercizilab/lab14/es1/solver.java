package esercizilab.lab14.es1;
import java.util.Scanner;
public class solver 
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("inserisci un numero: ");
        int a = scanner.nextInt();
        Contatore cont = new Contatore(a);
        cont.inc();
        System.out.println("il contatore ha incrementato, new numero: "+cont.getA());
    }
}
