package esercizilab.lab14.es2;
/*Scrivete l’ADT di un numero complesso Complex, partendo da una versione scritta
in C. Scrivete prima le specifiche su carta, poi implementarle.
Modellate lo stato e il comportamento in Java, definendo tutte le funzioni necessarie
ad operare sul tipo di dato.
Istanziate e testate la classe Complex eseguendo delle operazioni semplici sul dato.
Usate un’apposita classe separata, contenente il main */
public class Complex 
{
    private double a;   //parte reale
    private double bi;  //parte immaginaria
    public Complex()
    {
        this.a = 0;
        this.bi = 0;
    }
    public Complex(double a, double bi)
    {
        this.a = a;
        this.bi = bi;
    }
    public double getA()
    {
        return this.a;
    }
    public double getBI()
    {
        return this.bi;
    }
    @Override
    public String toString()
    {
        if(bi>=0)
            return this.a+" + "+this.bi+"i";
        else
            return this.a+" "+this.bi+"i";
    }
    public Complex somma(Complex num2)
    {
        double sommaA = this.a + num2.getA();
        double sommaBI = this.bi + num2.getBI();
        Complex SommaTot = new Complex(sommaA,sommaBI);
        return SommaTot;
    }
    public void sommaModificando(Complex altro) 
    {
        this.a = this.a + altro.a;
        this.bi = this.bi + altro.bi;
        // Non restituisco nulla, ho cambiato "me stesso"
    }
    public Complex sottrazione(Complex num2)
    {
        double sottrazioneA = this.a - num2.getA();
        double sottrazioneBI = this.bi - num2.getBI();
        Complex SottrazioneTot = new Complex(sottrazioneA,sottrazioneBI);
        return SottrazioneTot;
    }
    public Complex moltiplicazione(Complex num2)
    {
        //(a+bi)⋅(c+di)=ac+adi+bci+bdi2
        //(ac−bd)+(ad+bc)i
        double newMoltA = ((this.a*num2.getA())-(this.bi*num2.getBI()));
        double newMoltBI = ((this.a*num2.getBI())+(this.bi*num2.getA()));
        return new Complex(newMoltA,newMoltBI);
    }
    public double Modulo()
    {
        return Math.sqrt((this.a*this.a)+(this.bi*this.bi));
    } 
}
