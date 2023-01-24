package project1;

public class ListStack<T> {

    private Node<T> top;
    private int size;

    public ListStack(){
        top = null;
        size = 0;
    }

    public void push(T item) throws CloneNotSupportedException{
        if (top == null) {
            top = new Node<T>(item, null);
        }else{
            Node<T> newitem = new Node<T>(item, top);
            top = newitem;
        }
        size++;
    }

    public void pop(){
        if (top == null) {
            
        }else{
            top = top.getNext();
            size--;
        }
    }

    public void displayAll(){
        Node<T> obj = top;
        String result = "";
        while ((obj = obj.getNext()) != null) {
            result += obj.getItem().toString() + "\n";
        }
        System.out.println(result);
    }
    
}
