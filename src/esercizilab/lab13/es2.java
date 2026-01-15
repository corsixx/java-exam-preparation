package esercizilab.lab13;

import java.util.Scanner;

/*Lettura di un array – versione con metodi.
Tempo: 10 min.
Modificate il programma nell’Esercizio 1, definendo un metodo int[] readArray()
per la lettura dell’array, e un metodo void printArray(int[] array) che mostra
il contenuto dell’array in output. */
/*Scrivere un programma che legga in input un array e ne mostra il contenuto in
output. Come prima cosa, il programma chiede all’utente il numero di elementi di
cui si compone l’array, poi legge gli elementi uno per uno, di tipo int. In seguito,
mostrate in output il contenuto dell’array letto */
public class es2 
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
    public static void main(String[] args) 
    {
        int[] vettore = readArray();
        printArray(vettore);
    }
}
