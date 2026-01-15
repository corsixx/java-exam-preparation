package eserciziteoria;

import java.util.Scanner;

public class selezioneEcicli 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        //ERRATO
        /*System.out.print("Inserisci un numero > 0: ");
        int i = scanner.nextInt();
        while (i <= 0) 
        {
            System.out.print("Inserisci un numero > 0: ");
            i = scanner.nextInt();
        }
        System.out.printf("Hai inserito: %d\n", i);
        scanner.close(); */
        //GIUSTO
        int i;
        do 
        {
            System.out.print("Inserisci un numero > 0: ");
            i = scanner.nextInt();
        }
        while (i <= 0);
        scanner.close();
    }
}
