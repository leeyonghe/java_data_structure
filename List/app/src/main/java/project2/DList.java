package project2;

public class DList<T> {

    private Node<T> head, tail;
    private int size;

    public DList(){
        head = new Node<T>(null, null, null);
        tail = new Node<T>(null, head, null);
        head.setNext(tail);
        size = 0;
    }

    public void insertBefore(T item, Node<T> target){
        if (size == 0 || target == null) {
            Node<T> newItem = new Node<T>(item, head, tail);
            head.setNext(newItem);
            tail.setPrevious(newItem);
        }else{
            Node<T> previousNode = target.getPrevious();            
            Node<T> newItem = new Node<T>(item, previousNode, target);
            target.setPrevious(newItem);
            previousNode.setNext(newItem);
        }
        size++;
    }

    public void insertAfter(T item, Node<T> target){
        if (size == 0 || target == null) {
            Node<T> newItem = new Node<T>(item, head, tail);
            head.setNext(newItem);
            tail.setPrevious(newItem);
        }else{
            Node<T> newItem = new Node<T>(item, target, target.getNext());
            target.setNext(newItem);
        }        
        size++;
    }

    public void deleteNode(Node<T> target){
        Node<T> previousNode = target.getPrevious();
        Node<T> nextNode = target.getNext();
        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);
        size--;
    }

    public Node<T> getItem(int index) throws NoResultException {

        if (size <= index) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> obj = head;
        int i = 0;
        while ((obj = obj.getNext()) != tail) {
            if (i == index) {   
                return obj;
            }
            i++;
        }

        throw new NoResultException();
    }

    public void displayAll() {
        Node<T> obj = head;      
        String result = "Head -> ";  
        while ((obj = obj.getNext()) != tail) {
            result += obj.getItem().toString() + " -> ";
        }
        result += "Tail";
        System.out.println(result);
    }


    
}
