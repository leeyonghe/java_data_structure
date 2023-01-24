package project1;

public class Node<T> implements Cloneable{

    private T item;

    private Node<T> next;

    public Node(T item, Node<T> next) throws CloneNotSupportedException{
        this.item = item;
        if (next != null) {
            this.next = next.clone(); // deep copy
        }else{
            this.next = null;
        }
        
    }
    
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    protected Node<T> clone() throws CloneNotSupportedException {
        return (Node<T>) super.clone();
    }    
    
}
