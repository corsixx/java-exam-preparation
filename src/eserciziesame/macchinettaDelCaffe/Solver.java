package eserciziesame.macchinettaDelCaffe;

import java.util.Scanner;

public class Solver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int soldiaDisposizione = 0;
        Macchinetta macchinetta = new Macchinetta();
        while (scanner.hasNext()) {
            String next = scanner.next();
            switch (next) {
                case "B": {
                    String newNome = scanner.next();
                    int newCosto = scanner.nextInt();
                    int newVolume = scanner.nextInt();
                    macchinetta.aggiungiProdotto(new Bevanda(newVolume, newCosto, newNome));
                    break;
                }
                case "M": {
                    String newNome = scanner.next();
                    int newCosto = scanner.nextInt();
                    int newCalorie = scanner.nextInt();
                    macchinetta.aggiungiProdotto(new Merendina(newCalorie, newCosto, newNome));
                    break;
                }
                case "S": {
                    int newSoldi = scanner.nextInt();
                    if (newSoldi < 0) {
                        throw new IllegalArgumentException("Importo minore di 0.");
                    }
                    soldiaDisposizione += newSoldi;
                    break;
                }
                case "CB": {
                    int volMin = scanner.nextInt();
                    Bevanda bevandaComprata = macchinetta.compraBevanda(soldiaDisposizione, volMin);
                    if (bevandaComprata != null) {
                        soldiaDisposizione = soldiaDisposizione - bevandaComprata.getCosto();
                        bevandaComprata.toString();
                    }
                    break;
                }
                case "CM": {
                    int calorieMin = scanner.nextInt();
                    Merendina merendinaComprata = macchinetta.compraMerendina(soldiaDisposizione, calorieMin);
                    if (merendinaComprata != null) {
                        soldiaDisposizione = soldiaDisposizione - merendinaComprata.getCosto();
                        merendinaComprata.toString();
                    }
                    break;
                }
                case "SORT": {
                    macchinetta.ordinaProdottiPerCosto();
                    break;
                }
                case "F": {
                    return;
                }
            }
        }
    }
}
