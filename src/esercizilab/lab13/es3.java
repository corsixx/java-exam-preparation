package esercizilab.lab13;
/*Scrivere un programma che legga in input un array e stampi in output l’array
invertito. Usate il metodo int[] readArray() definito nell’Esercizio 2.  */
import java.util.Scanner;

public class es3 
{
    static Scanner scanner = new Scanner(System.in);
    static int[] readArray()
    {
        int n;
        System.out.println("Lettura di un array - inverso");
        System.out.print("inserisci la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] vettore = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vettore[i] = scanner.nextInt();
        }
        return vettore;
    }
    static void printArrayInverso(int[] array)
    {
        System.out.print("array inverso: ");
        for(int i=array.length-1; i >= 0 ;i--)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[] vettore = readArray();
        printArrayInverso(vettore);
    }
}
