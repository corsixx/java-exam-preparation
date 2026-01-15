package esercizilab.lab13;

import java.util.Scanner;

/*Scrivete un programma che implementi l’algoritmo di ordinamento BubbleSort se-
condo lo pseudocodice riportato in Figura 1, definendo un metodo void sortArray(int[]
array). Il programma legge in input un array usando il metodo definito nell’Eser-
cizio 2. */
public class es5 
{
    static Scanner scanner = new Scanner(System.in);
    static int[] readArray()
    {
        int n;
        System.out.println("Lettura di un array - versione con metodi.");
        System.out.print("inserisci la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] vettore = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vettore[i] = scanner.nextInt();
        }
        return vettore;
    }
    static void printArray(int[] array)
    {
        System.out.print("array: ");
        for(int i:array)
            System.out.print(i+" ");
        System.out.println();
    }
    static void sortArray(int[] array)
    {
        boolean scambio = true;
        while(scambio == true)
        {
            scambio = false;
            for(int i=0;i < array.length-1; i++)
            {
                if(array[i]>array[i+1])
                {
                    scambio = true;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        /*versione alternativa
        for(int i=0;i < array.length-1; i++)
        {
            for(int j=0;j < array.length-i-1; i++)
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        }*/
    }
    public static void main(String[] args) 
    {
        int[] vett1 = readArray();
        printArray(vett1);
        sortArray(vett1);
        printArray(vett1);
    }
}
