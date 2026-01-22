package eserciziesame.Hotel;
/*Classe Hotel: classe che rappresenta l'hotel, e viene usata per la sua gestione. Ha un solo attributo stanze, definito come una lista che contiene 
le stanze (Standard e Suite) presenti nell'hotel. Fornisce i seguenti metodi:

-void aggiungiStanza(Stanza s): aggiunge una Stanza (Standard o Suite) alla lista stanze. Si assume che una stanza aggiunta non sia occupata.

-Stanza assegna(String nomeOspite, boolean suite, int numeroLetti): cerca una Stanza disponibile per l'ospite con nome nomeOspite. La Stanza deve:
essere di tipo Suite se il parametro suite vale true, Standard altrimenti;avere un numero di letti maggiore o uguale del numero indicato nel parametro numeroLetti. 
Il metodo restituisce la Stanza trovata nell'elenco delle stanze dell'hotel e la occupa con il nome dell'ospite. 
In caso non vi sia una stanza libera che rispetta contemporaneamente entrambi i requisiti, il metodo restituisce null.
Stanza liberaStanza(String nomeOspite): libera e restituisce la Stanza occupata dall'ospite con nome nomeOspite. Se non c'è alcun ospite registrato con quel nome, restituisce null.

La classe Solver, che vi viene fornita, implementa il metodo main e i) vi permette di sperimentare facilmente con il vostro codice, 
e ii) vi fornisce una traccia dell'implementazione delle altre classi. Quindi, questa classe non deve essere modificata. */
import java.util.ArrayList;
public class Hotel 
{
    ArrayList<Stanza> listaStanze;
    public Hotel() 
    {
        listaStanze = new ArrayList<>();
    }
    public void aggiungiStanza(Stanza s)
    {
        for(Stanza stanza : listaStanze)
        {
            if(stanza.getNumero() == s.getNumero())
                return;
        }
        listaStanze.add(s);
    }
    public Stanza assegna(String nomeOspite, boolean suite, int numeroLetti) 
    {
        if(suite)
        {
            for(Stanza stanza : listaStanze)
            {
                if(stanza instanceof Suite)
                {
                    if(stanza.getNomeOspite() == null)
                    {
                        if(stanza.getNumeroLetti() >= numeroLetti)
                        {
                            stanza.setNomeOspite(nomeOspite);
                            return stanza;
                        }
                    }
                }
            }
            return null;
        }
        else
        {
            for(Stanza stanza : listaStanze)
            {
                if(stanza instanceof Standard)
                {
                    if(stanza.getNomeOspite() == null)
                    {
                        if(stanza.getNumeroLetti() >= numeroLetti)
                        {
                            stanza.setNomeOspite(nomeOspite);
                            return stanza;
                        }
                    }
                }
            }
            return null;
        }
    }
    public Stanza liberaStanza(String nomeOspite) 
    {
        for(Stanza stanza : listaStanze)
        {
            if(stanza.getNomeOspite() == nomeOspite)    //so che dovevo fare equals, ma ero di fretta e non ci ho pensato
            {
                stanza.setNomeOspite(null);
                return stanza;
            }
        }
        return null;
    }
}
