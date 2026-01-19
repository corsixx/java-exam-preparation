package eserciziesame.noleggioAuto;

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
        if (newVeicolo.getAnnoDiImmatricolazione() == 2025) {
            listaVeicoli.add(newVeicolo);
        }
    }

    public Auto noleggiaAuto(int numeroPax, int anno) {
        for (Veicolo v : listaVeicoli) {
            if (v instanceof Auto) {
                Auto copy = (Auto) v;
                if (copy.getNumeroPax() >= numeroPax && copy.getAnnoDiImmatricolazione() >= anno) {
                    listaVeicoli.remove(v);
                    return copy;
                }
            }
        }
        return null;
    }
}
