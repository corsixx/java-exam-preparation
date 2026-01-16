package esercizilab.lab13;
/*Scrivere un programma che riceva una stringa in input e stampi Palindroma, se
la stringa è palindroma, Non palindroma, altrimenti. Definite un metodo boolean
isPalindroma(String) per lo scopo.*/
import java.util.Scanner;
public class es10 
{
    static boolean isPalindroma(char[] copy)
    {
        int dim = copy.length;
        int cont=0;
        for(int i = 0; i <= dim/2 ; i++)
        {
            if(copy[i] == copy[dim-1-i])
            {
                cont++;
            }
        }
        if(cont >= dim/2)
            return true;
        else
            return false;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("PAROLA PALINDROMA O NON PALINDROMA");
        System.out.print("inserisci una parola: ");
        String stringa1 = scanner.nextLine();
        char[] copy = stringa1.toCharArray();
        System.out.println();
        if(isPalindroma(copy))
            System.out.print("la parola è palindroma");
        else
            System.out.print("la parola non è palindroma");
    }
}
