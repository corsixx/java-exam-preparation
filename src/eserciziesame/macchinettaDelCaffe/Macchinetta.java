package eserciziesame.macchinettaDelCaffe;

import java.util.ArrayList;
//import java.util.Iterator;

public class Macchinetta {
    private ArrayList<Prodotto> prodotti;

    public Macchinetta() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        this.prodotti.add(prodotto);
    }

    public Merendina compraMerendina(int soldi, int calorie) {
        /*
         * Iterator<Prodotto> it = prodotti.iterator();
         * while(it.hasNext()) {
         * Prodotto p=it.next();
         * if(p instanceof Merendina)
         * {
         * Merendina m=(Merendina) p; //per passare dal tipo apparente prodotto al tipo
         * effettivo merendina
         * //e chimare getCalorie
         * if(m.getCosto() <= soldi && m.getCalorie() <=calorie ){
         * it.remove();
         * return m;
         * }
         * }
         * }
         */

        for (int i = 0; i < prodotti.size(); i++) {
            Prodotto p = prodotti.get(i);

            if (p instanceof Merendina) {
                Merendina m = (Merendina) p;
                if (m.getCosto() <= soldi && m.getCalorie() <= calorie) {
                    prodotti.remove(i);
                    return m;
                }
            }
        }
        return null;
    }

    public Bevanda compraBevanda(int soldi, int volume) {

        for (int i = 0; i < prodotti.size(); i++) {
            Prodotto p = prodotti.get(i);

            if (p instanceof Bevanda) {
                Bevanda b = (Bevanda) p;
                if (b.getCosto() <= soldi && b.getVolume() >= volume) {
                    prodotti.remove(i);
                    return b;
                }
            }
        }
        return null;
    }

    public void ordinaProdottiPerCosto() {
        ArrayList<Prodotto> copia = new ArrayList<>(prodotti);
        /*
         * copia.sort(new Comparator<Prodotto>(){
         * 
         * @Override
         * public int compare(Prodotto p1, Prodotto p2) {
         * return Integer.compare(p1.getCosto(), p2.getCosto());
         * }
         * })
         */
        // lambda expression
        copia.sort((p1, p2) -> Integer.compare(p1.getCosto(), p2.getCosto()));
        for (Prodotto p : copia) {
            System.out.println(p.toString());
        }
    }
}