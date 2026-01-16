package esercizilab.lab13;
/* Scrivere un programma che riceva una stringa in input e stampi la stringa invertita.*/
public class es9 
{
    static void invertiStringa(char[] copy)
    {
        int dim = copy.length;
        for(int i = 0; i <= dim/2 ; i++)
        {
            char temp = copy[i];
            copy[i] = copy[dim-1-i];
            copy[dim-1-i] = temp;
        }
    }
    public static void main(String[] args) 
    {
        String stringa1 = "metropolitana";
        System.out.println("stringa inserita: "+stringa1);
        char[] copy = stringa1.toCharArray();
        invertiStringa(copy);
        stringa1 = new String(copy);
        System.out.println("nuova stringa: "+stringa1);
    }
}