package project3;

public class CList<T> {

    private Node<T> last;
    private int size;

    public CList(){
        last = null;
        size = 0;
    }

    public void insert(T item){
        if (last == null) {
            last = new Node<T>(item);
            last.setNext(last);            
        }else{
            Node<T> newItem = new Node<T>(item);
            newItem.setNext(last.getNext());
            this.last.setNext(newItem);            
        }
        size++;
    }

    public void delete(T item){
        Node<T> obj = last;
        while (obj.getNext() != last) {
            Node<T> previous = obj;
            obj = obj.getNext();
            if (obj.getItem() == item) {
                previous.setNext(obj.getNext());
                break;
            }            
        }
        size--;
    }

    public void displayAll(){
        Node<T> obj = last;
        String result = "";
        while ((obj = obj.getNext()) != last) {
            result += obj.getItem().toString();
        }
        System.out.println(result);
    }

}
