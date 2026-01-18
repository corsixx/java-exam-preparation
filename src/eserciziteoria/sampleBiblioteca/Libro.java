package eserciziteoria.sampleBiblioteca;

public class Libro 
{
    private String titolo;
    private String author;
    private boolean isBorrowed;

    public Libro(String titolo, String author, boolean isBorrowed)
    {
        this.titolo = titolo;
        this.author = author;
        this.isBorrowed = false;
    }
    public void borrowBook()
    {
        if(isBorrowed)
            System.out.println("il libro "+this.titolo+" è in prestito");
        else
        {
            System.out.println("il libro "+this.titolo+" non è in prestito...");
            this.isBorrowed = true;
            System.out.println("prestito del libro "+this.titolo+" eseguito.");
        }
    }
    public void returnBook()
    {
        if (!isBorrowed) 
        {
            System.out.println("Non in prestito.");
        } 
        else 
        {
            this.isBorrowed = false;
            System.out.println("Grazie per aver restituito: " + this.titolo);
        }
    }
}
