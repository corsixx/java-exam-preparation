package esercizilab.lab13;
/*Scrivere un programma che crei un oggetto di tipo String, contenente il proprio
nome, e stampi il primo e l’ultimo carattere della stringa. Descrivere ciò che avviene
in memoria durante l’esecuzione del programma, aiutandosi con un disegno. */
public class es7 
{
    public static void main(String[] args) 
    {
        String stringa = "fabio is taller than andrea";
        System.out.println("stringa inserita: "+stringa);
        System.out.println("primo carattere: "+stringa.charAt(0)+", ultimo carattere: "+stringa.charAt(stringa.length()-1));
    }
}
