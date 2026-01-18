package eserciziteoria.esempioClassi;

import java.util.ArrayList;

public class Group 
{
    private ArrayList<Person> people;
    private String name;
    public Group(String name)
    {
        this.people = new ArrayList<Person>();
        this.name = name;
    }
    public Group(String name,ArrayList<Person> people)
    {
        this.people = people;
        this.name = name;
    }
    public ArrayList<Person> getPeople()
    {
        return this.people;
    }
}
