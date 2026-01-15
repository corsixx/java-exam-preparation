package esercizilab.lab13;

import java.util.Scanner;

/*Scrivere un programma che legga in input un array e ne mostra il contenuto in
output. Come prima cosa, il programma chiede all’utente il numero di elementi di
cui si compone l’array, poi legge gli elementi uno per uno, di tipo int. In seguito,
mostrate in output il contenuto dell’array letto */
public class es1 
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Lettura di un array");
        System.out.print("inserisci la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] vettore = new int[n];
        //inserimento elementi
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Elemento " + (i+1) + ": ");
            vettore[i] = scanner.nextInt();
        }
        //stampa elementi
        System.out.print("array: ");
        for(int i:vettore)
            System.out.print(i+" ");
        System.out.println();
        scanner.close();
    }
}
