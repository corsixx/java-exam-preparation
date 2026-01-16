package esercizilab.lab13;
/*Scrivere un programma che riceva una stringa in input e stampi la stringa ottenuta
invertendo la prima e l’ultima lettera.*/
public class es8 
{   
    public static void invertiChar(StringBuilder s1)
    {
        char char1 = s1.charAt(0);
        s1.setCharAt(0, s1.charAt(s1.length()-1));
        s1.setCharAt((s1.length()-1), char1);
    }
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("fabio is taller than andrea");
        System.out.println("stringa inserita: "+sb);
        invertiChar(sb);
        System.out.println("nuova stringa: "+sb);
    }
}
