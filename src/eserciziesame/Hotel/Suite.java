package eserciziesame.Hotel;
/*Classe Suite: classe che estende Stanza e identifica una suite dell'hotel. 
La classe include un attributo numeroAmbienti, di tipo int, che modella il numero di ambienti della stanza. 
Le regole dell'hôtellerie prevedono che una suite abbia almeno due ambienti separati, quindi numeroAmbienti dev'essere $\ge 2$.
 In caso venga specificato un numero di ambienti non conforme, specificate 2. */
public class Suite extends Stanza 
{
    private int numeroAmbienti;
    public Suite(int numero, int numeroLetti, int numeroAmbienti) 
    {
        super(numero, numeroLetti);
        this.numeroAmbienti = (numeroAmbienti >= 2) ? numeroAmbienti : 2;
    }
    public int getNumeroAmbienti() 
    {
        return numeroAmbienti;
    }
}