package project1;

public class SList<T> {

    private Node<T> head;
    private int size;

    public SList(){
        head = null;
        size = 0;
    }

    public T search(T target){
        Node<T> p = head;
        for (int i = 0; i < size; i++) {
            T obj = (T) p.getItem();
            if (obj instanceof String) {
                if (((String)obj).compareTo((String) target) == 0) {
                    return (T) p.getItem();
                }
            }else if(obj instanceof Integer){
                if (((Integer)obj).compareTo((Integer) target) == 0) {
                    return (T) p.getItem();
                }
            }
        }
        return null;
    }

    public void insertFront(T item){
        head = new Node<T>(item, head);
        size++;
    }

    public void insertAfter(T item, Node<T> p){
        p.setNext(new Node<T>(item, p.getNext()));
        size--;
    }

    public void deleteFront(){
        this.head = this.head.getNext();
        this.size--;
    }

    public void insertAfeter(T item){
        Node<T> obj = head;
        Node<T> endobj = null;
        while( obj.getNext() != null){
            obj = obj.getNext();
        }
        endobj = obj;
        endobj.setNext(new Node<T>(item, null));
    }

    public void deleteAfeter(Node<T> p){
        Node<T> t = p.getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;
    }

    public void displayAll() {
        String result = "";
        Node<T> obj = head;
        do{
            result += obj.getItem().toString()+" | ";
        }while((obj = obj.getNext()) != null);
        System.out.println("Total result : "+result);
        System.out.println("Total count : "+size);
    }
    
}
