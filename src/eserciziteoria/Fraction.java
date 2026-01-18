package eserciziteoria;

public class Fraction 
{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) 
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    /*public boolean equals(Fraction other)
    {
        return this.numerator/this.denominator == other.numerator/other.denominator;
    }*/
    //se facessi cosi, al posto di controllare se gli opgetti sono uguali, controllerei se i riferimenti sono uguali
    public String toString() 
    {
        return String.format("%d/%d", this.numerator, this.denominator);    //string format significa che ritorna una stringa formattata
    }
    public static void main(String[] args) 
    {
        Fraction f1 = new Fraction(5, 4);
        Fraction f2 = new Fraction(10, 8);
        Fraction f3 = new Fraction(5, 4);
        System.out.printf("f1(%s) equals f2(%s)? %b\n",f1.toString(), f2.toString(), f1.equals(f2));
        //output: f1(5/4) equals f2(5/4)? false
        System.out.printf("f1(%s) equals f3(%s)? %b\n",f1.toString(), f3.toString(), f1.equals(f3));
        //output: f1(5/4) equals f3(5/4)? true

        /*L’implementazione del metodo determina cosa si intende per uguaglianza (ad es., confronto un sottinsieme degli attributi) */
    }
}
