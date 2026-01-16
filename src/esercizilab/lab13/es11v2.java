package esercizilab.lab13;

import java.util.Scanner;
import java.util.ArrayList;

/*Scrivete un programma che legge in input una sequenza di numeri interi, fino a che
l’utente non inserisce un valore specifico, definito da voi a tempo di compilazione.
Il programma calcola il minimo e il massimo di questa sequenza. Implementate
una versione senza memorizzare l’intera sequenza, e una versione in cui usate la
struttura dati più adatti per memorizzare l’intera sequenza, e il calcolo del massimo
(e minimo, resp.) è implementato in un metodo chiamato getMax (getMin, resp.) */
public class es11v2 
{
    static Scanner scanner = new Scanner(System.in);
    static int getMax(ArrayList<Integer> array)
    {
        int max=0;
        for(int i : array )
        {
            if(i>max)
                max=i;
        }
        return max;
    }
    static int getMin(ArrayList<Integer> array)
    {
        int min=0;
        boolean primavolta = false;
        for(int i : array )
        {
            if(!primavolta)
            {
                min = i;
                primavolta = true;
            }
            else if(i<min)
                min=i;
        }
        return min;
    }
    public static void main(String[] args) 
    {
        System.out.println("MASSIMO E MINIMO\n");
        ArrayList<Integer> array = new ArrayList<>();
        int capacity = 10;
        int max = 0, min = 0, num;
        boolean primociclo = false;
        System.out.print("inserisci il numero con cui ti vuoi fermare: ");
        int stop = scanner.nextInt();
        System.out.println();
        System.out.print("inserisci il numero: ");
        num = scanner.nextInt();
        if(num == stop)
        {
            array.add(num); //l'avrei fatto in modo diverso ma essendo che mi dice di usare arraylist lo uso
        }
        else
        {
            while(num != stop)
            {
                array.add(num);
                System.out.print("inserisci il numero: ");
                num = scanner.nextInt();
            }
        }
        System.out.println("lista: "+ array);
        /*int massimo = Collections.max(numeri); 
        System.out.println("Il massimo è: " + massimo); // Output: 50 */
        System.out.println("il minimo trovato: "+getMin(array)+" mentre il massimo :"+getMax(array));
    }
}
