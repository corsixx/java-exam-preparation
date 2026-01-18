package eserciziteoria.esempioClassi;

import java.util.ArrayList;

public class Solver 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person("Mario", "Rossi", "123");
        Person p2 = new Person("Mario", "Bianchi", "456");
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        Group group = new Group("Marii", people);
        people = group.getPeople();
        System.out.println("Numero di persone nel gruppo: " + people.size());
        System.out.println("Primo nome della prima persona: " + people.get(0).getFirstName());
        System.out.println("Primo nome della prima persona: " + group.getPeople().get(0).getFirstName());   //uguale a sopra
        System.out.println("Primo nome della seconda persona: " + people.get(1).getFirstName());
        /*people è una variabile di tipo ArrayList, cioè un
        puntatore all’oggetto ArrayList (tipo ArrayList* in C) */
        people.clear();
        /*people è una variabile di tipo ArrayList, cioè un
        puntatore all’oggetto ArrayList (tipo ArrayList* in C)
        Le modifiche sono applicate sullo stesso oggetto, quindi anche
        su group.people */
        System.out.println("clear eseguito, numero elementi :" + group.getPeople().size());
        System.out.println("clear eseguito, numero elementi :" + people.size());
    }
}
