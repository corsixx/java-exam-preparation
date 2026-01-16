package esercizilab.lab13;

import java.util.Scanner;

/*Scrivete un programma che legge in input una sequenza di numeri interi, fino a che
l’utente non inserisce un valore specifico, definito da voi a tempo di compilazione.
Il programma calcola il minimo e il massimo di questa sequenza. Implementate
una versione senza memorizzare l’intera sequenza, e una versione in cui usate la
struttura dati più adatti per memorizzare l’intera sequenza, e il calcolo del massimo
(e minimo, resp.) è implementato in un metodo chiamato getMax (getMin, resp.) */
public class es11 
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("MASSIMO E MINIMO\n");
        int max = 0, min = 0, num;
        boolean primociclo = false;
        System.out.print("inserisci il numero con cui ti vuoi fermare: ");
        int stop = scanner.nextInt();
        System.out.println();
        System.out.print("inserisci il numero: ");
        num = scanner.nextInt();
        if(num == stop)
        {
            max = num;
            min = num;
        }
        else
        {
            while(num != stop)
            {
                if(!primociclo)
                {
                    max = num;
                    min = num;
                    primociclo = true;
                }   
                else if(num > max)
                    max=num;
                else if(num < min)
                    min=num;
                System.out.print("inserisci il numero: ");
                num = scanner.nextInt();
            }
        }
        System.out.println("il minimo trovato: "+min+" mentre il massimo :"+max);
    }
}
