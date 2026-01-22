package eserciziesame.Hotel;
/*Classe Stanza: classe astratta che descrive una stanza dell'hotel. La classe possiede tre attributi:

numero: un intero che modella il numero della stanza, univoco;

numeroLetti: un intero che modella il numero di letti della stanza;

nomeOspite: una String che modella il nome dell'ospite che attualmente occupa la stanza. Nota: si assume che l'ospite sia sempre da solo. Il valore di default è null (stanza vuota). */
public abstract class Stanza 
{
    private int nunmero;
    private int numeroLetti;
    private String nomeOspite;
    public Stanza (int numero, int numeroLetti)
    {
        this.nunmero = numero;
        this.numeroLetti = numeroLetti;
        this.nomeOspite = null;
    }
    public int getNumero() 
    {
        return nunmero;
    }
    public int getNumeroLetti() 
    {
        return numeroLetti; 
    }
    public String getNomeOspite() 
    {
        return nomeOspite; 
    }
    public void setNomeOspite(String nomeOspite)
    {
        this.nomeOspite = nomeOspite; 
    }
    @Override
    public String toString() 
    {
        if(nomeOspite == null)
            return "Stanza{" +"numero=" + nunmero +", numeroLetti=" + numeroLetti +", nomeOspite= vuota" +'}';
        else
            return "Stanza{" +"numero=" + nunmero +", numeroLetti=" + numeroLetti +", nomeOspite='" + nomeOspite + '\'' +'}';
    }
}
