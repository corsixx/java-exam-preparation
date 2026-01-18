package eserciziteoria.Lista;

public class LinkedList 
{
    private Node head;
    private int size;
    public LinkedList() 
    {
        this.head = null;
        this.size = 0;
    }
    public void addElement(int value)
    {
        Node newNode = new Node(value);//crea un nuovo nodo
        if (this.head == null)  //se la lista è vuota
        {
            this.head = newNode;    //il nuovo nodo diventa la testa
        } 
        else 
        {
            Node current = this.head;   //parto dalla testa
            while (current.hasNext())   //scorro fino alla fine della lista
            {
                current = current.getNext();    //mi sposto al nodo successivo
            }
            //ora current è l'ultimo nodo
            current.setNext(newNode);   //collego il nuovo nodo alla fine della lista
        }
        this.size++; //incremento la dimensione della lista
    }
}
