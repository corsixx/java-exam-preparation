package esercizilab.lab13;
import java.util.Scanner;
/*Scrivere un programma Java che legga in input da tastiera una stringa e restituisca
in output la stringa ottenuta trasformando la stringa in caratteri maiusco*/
public class es6 
{
    static Scanner scanner = new Scanner(System.in);
    static String trasformaStringa(String s1)
    {
        return s1.toUpperCase();
    }
    public static void main(String[] args) 
    {
        System.out.println("TRASFORMAZIONE IN CARATTERI MAIUSCOLI");
        String stringa1;
        System.out.print("inserisci una stringa: ");
        stringa1 = scanner.nextLine();
        System.out.println();
        stringa1 = trasformaStringa(stringa1);
        System.out.println("stringa nuova: "+stringa1);
    }
}
