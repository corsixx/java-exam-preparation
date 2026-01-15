package esercizilab.lab13;

import java.util.Scanner;

/*Modificate il programma nell’Esercizio 3, definendo un metodo int[] reverse(int[])
per l’inversione dell’array. Il metodo non deve modificare l’array in input, ma deve
ritornare un array nuovo*/
public class es4 
{
    static Scanner scanner = new Scanner(System.in);
    static int[] readArray()
    {
        int n;
        System.out.println("Lettura di un array -> inverso con metodi.");
        System.out.print("inserisci la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] vettore = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vettore[i] = scanner.nextInt();
        }
        return vettore;
    }
    static int[] reverse(int[] array)
    {
        int[] newArr = new int[array.length];
        int j = array.length-1;
        for(int i=0; i < array.length ;i++)
        {
            newArr[j--] = array[i];
        }
        return newArr;
    }
    static void printArray(int[] array)
    {
        System.out.print("array: ");
        for(int i:array)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[] vett1 = readArray();
        printArray(vett1);
        vett1 = reverse(vett1);
        printArray(vett1);
    }
}
