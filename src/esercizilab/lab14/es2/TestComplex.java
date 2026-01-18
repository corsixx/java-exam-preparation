package esercizilab.lab14.es2;
import java.util.Scanner;
import java.util.ArrayList;
public class TestComplex 
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ArrayList<Complex> numeriComplessi = new ArrayList<>();
        int volte =0;
        System.out.println("CLASSE PER TESTARE L'ABT COMPLEX");
        System.out.println("----------------------------------------------");
        System.out.println("operazioni disponibili: aggiungicomplesso, somma, sottrazione, moltiplicazione, modulo");
        System.out.println("----------------------------------------------");
        System.out.print("scegli l'operazione da eseguire: ");
        String operazione = scanner.next();
        scanner.nextLine();
        while(!operazione.equals("esci"))
        {
            switch(operazione)
            {
                case "aggiungicomplesso":
                {
                    System.out.print("inserisci parte reale: ");
                    double a = scanner.nextDouble();
                    System.out.print("inserisci parte immaginaria: ");
                    double bi = scanner.nextDouble();
                    numeriComplessi.add(new Complex(a,bi));
                    System.out.println("numero complesso creato: "+numeriComplessi.get(numeriComplessi.size()-1).toString());
                    volte++;
                    break;
                }
                case "somma":
                {
                    if(volte<2)
                    {
                        System.out.println("devi prima aggiungere almeno due numeri complessi");
                        break;
                    }
                    else
                    {
                        System.out.println("implementa somma");
                        System.out.println("scegli i due numeri complessi da sommare (inserisci gli indici da 0): ");
                        int index1 = scanner.nextInt();
                        int index2 = scanner.nextInt();
                        if(index1 < 0 || index1 >= numeriComplessi.size() || index2 < 0 || index2 >= numeriComplessi.size())
                        {
                            System.out.println("indici non validi");
                            break;
                        }
                        else
                        {
                            System.out.println("i numeri che vuoi sommare sono: "+numeriComplessi.get(index1).toString()+" e "+numeriComplessi.get(index2).toString());
                            System.out.println("il risultato è: "+numeriComplessi.get(index1).somma(numeriComplessi.get(index2)).toString());
                        }
                        break;
                    }
                }   
                case "sottrazione":
                {
                    if(volte<2)
                    {
                        System.out.println("devi prima aggiungere almeno due numeri complessi");
                        break;
                    }
                    else
                    {
                        System.out.println("implementa sottrazione");
                        System.out.println("scegli i due numeri complessi da sottrarre (inserisci gli indici da 0): ");
                        int index1 = scanner.nextInt();
                        int index2 = scanner.nextInt();
                        if(index1 < 0 || index1 >= numeriComplessi.size() || index2 < 0 || index2 >= numeriComplessi.size())
                        {
                            System.out.println("indici non validi");
                            break;
                        }
                        else
                        {
                            System.out.println("i numeri che vuoi sottrarre sono: "+numeriComplessi.get(index1).toString()+" e "+numeriComplessi.get(index2).toString());
                            System.out.println("il risultato è: "+numeriComplessi.get(index1).sottrazione(numeriComplessi.get(index2)).toString());
                        }
                        break;
                    }
                }
                case "moltiplicazione":
                {
                    if(volte<2)
                    {
                        System.out.println("devi prima aggiungere almeno due numeri complessi");
                        break;
                    }
                    else    
                    {
                        System.out.println("implementa moltiplicazione");
                        System.out.println("scegli i due numeri complessi da moltiplicare (inserisci gli indici da 0): ");
                        int index1 = scanner.nextInt();
                        int index2 = scanner.nextInt();
                        if(index1 < 0 || index1 >= numeriComplessi.size() || index2 < 0 || index2 >= numeriComplessi.size())
                        {
                            System.out.println("indici non validi");            
                            break;
                        }
                        else
                        {
                            System.out.println("i numeri che vuoi moltiplicare sono: "+numeriComplessi.get(index1).toString()+" e "+numeriComplessi.get(index2).toString());
                            System.out.println("il risultato è: "+numeriComplessi.get(index1).moltiplicazione(numeriComplessi.get(index2)).toString());
                        }
                        break;
                    }
                }
                case "modulo":
                {
                    if(volte<1)
                    {
                        System.out.println("devi prima aggiungere almeno un numero complesso");
                        break;
                    }
                    else    
                    {
                        System.out.println("implementa modulo");
                        System.out.println("scegli il numero complesso di cui vuoi calcolare il modulo (inserisci l'indice da 0): ");
                        int index = scanner.nextInt();
                        if(index < 0 || index >= numeriComplessi.size())    
                        {
                            System.out.println("indice non valido");
                            break;
                        }
                        else
                        {
                            System.out.println("il numero complesso è: "+numeriComplessi.get(index).toString());
                            System.out.println("il modulo è: "+numeriComplessi.get(index).Modulo());
                        }
                        break;
                    }
                }
                default:
                    System.out.println("operazione non riconosciuta");
            }
            System.out.print("scegli l'operazione da eseguire: ");
            operazione = scanner.next();
        }
    }
}

