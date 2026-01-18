package eserciziteoria.Lista;

public class Node 
{
    private int data;
    private Node next;
    public Node(int data)   //uguale a initList in C
    {
        this.data = data;
        this.next = null;
    }
    public boolean hasNext()
    {
        return this.next != null;   //true se next non è null
    }
    public Node getNext()   //restituisce il riferimento al nodo successivo
    {
        return this.next;
    }
    public void setNext(Node next)  //imposta il riferimento al nodo successivo
    {
        this.next = next;
    }
}
