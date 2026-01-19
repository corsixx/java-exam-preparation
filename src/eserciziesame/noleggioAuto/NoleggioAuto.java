package eserciziesame.noleggioAuto;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*Classe Noleggio: Classe che rappresenta un noleggio auto. Ha un so-
lo attributo listaVeicoli che contiene una lista dei veicoli disponibili.
Fornisce i seguenti metodi per aggiunta/noleggio/restituzione veicoli:
– void aggiugiVeicolo(Veicolo): aggiunge un nuovo Veicolo
(auto o moto) alla lista dei Veicoli, ovvero un veicolo immatricolato
nel 2025.
– Auto noleggiaAuto(int numeroPax, int anno): restituisce
il primo veicolo che è di classe Auto (usate instanceof), può cari-
care almeno numeroPax persone ed è immatricolato durante o dopo
l’anno anno. Se non è disponibile nessuna auto che soddisfa i requisiti
restituisce null; altrimenti, il veicolo viene tolto dalla lista di veicoli.
– Moto noleggiaMoto(String modello, int cavalli): resti-
tuisce la prima moto con modello modello e con un numero di cavalli
superiore o uguale a cavalli. Se non viene trovata nessuna moto che
rispecchia il requisito il metodo restituisce null; altrimenti, il veicolo
viene tolto dalla lista di veicoli.
– void restituisciVeicolo(Veicolo): rappresenta la restitu-
zione di un veicolo. Lo riaggiunge quindi alla lista dei Veicoli.
– void sort(void): ordina i prodotti per ordine crescente di anno
di immatricolazione. */

public class NoleggioAuto {
    private ArrayList<Veicolo> listaVeicoli;

    public NoleggioAuto() {
        ArrayList<Veicolo> listaVeicoli = new ArrayList<>();
    }

    public void aggiungiVeicolo(Veicolo newVeicolo) {
        // if (newVeicolo.getAnnoDiImmatricolazione() == 2025) {
        listaVeicoli.add(newVeicolo);
        // }

    }

    public Auto noleggiaAuto(int numeroPax, int anno) {
        for (int i = 0; i < listaVeicoli.size(); i++) {
            if (listaVeicoli.get(i) instanceof Auto) {
                Auto copy = (Auto) listaVeicoli.get(i);
                if (copy.getNumeroPax() >= numeroPax && copy.getAnnoDiImmatricolazione() >= anno) {
                    listaVeicoli.remove(i);
                    return copy;
                }
            }
        }
        return null;
    }

    public Moto noleggiaMoto(String Modello, int Cavalli) {
        for (int i = 0; i < listaVeicoli.size(); i++) {
            if (listaVeicoli.get(i) instanceof Moto) {
                Moto copy = (Moto) listaVeicoli.get(i);
                if (copy.getModello().toLowerCase().equals(Modello.toLowerCase()) && copy.getCavalli() >= Cavalli) {
                    listaVeicoli.remove(i);
                    return copy;
                }
            }
        }
        return null;
    }

    public void restituisciVeicolo(Veicolo VeicoloDaRestituire) {
        listaVeicoli.add(VeicoloDaRestituire);
        VeicoloDaRestituire.addNdiNoleggi();
    }

    public void SORT() {
        listaVeicoli.sort((v1, v2) -> Integer.compare(v1.getAnnoDiImmatricolazione(), v2.getAnnoDiImmatricolazione()));
        //// Ordinamento DECRESCENTE (dal 2025 al 1800)
        // listaVeicoli.sort((v1, v2) ->
        //// Integer.compare(v2.getAnnoDiImmatricolazione(),v1.getAnnoDiImmatricolazione()));
    }

    public void veicoliPerNoleggi() {
        ArrayList<Veicolo> copiaLista = new ArrayList<>(listaVeicoli);

        copiaLista.sort((v1, v2) -> Integer.compare(v1.getNoleggi(), v2.getNoleggi()));
        for (Veicolo v : copiaLista) {
            System.out.println(v.getModello() + " - Noleggi: " + v.getNoleggi());
        }
    }
    public ArrayList<Veicolo> getListaVeicoli() {
        return this.listaVeicoli;
    }
}
