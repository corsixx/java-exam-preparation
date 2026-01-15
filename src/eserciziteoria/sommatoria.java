package eserciziteoria;

public class sommatoria 
{
    public static int sottoProgramma(int a)
    {
        if (a < 0) return 0; 
        return (a * (a + 1)) / 2;
    }
    public static void main(String[] args) 
    {
        int a = 10;
        System.out.println("PROGRAMMA DI SOMMATORIA");
        System.out.printf("->variabile iniziale: %d\n",a);
        int ris = sottoProgramma(a);
        System.out.println("risultato sommatoria: "+ris);
    }
}
