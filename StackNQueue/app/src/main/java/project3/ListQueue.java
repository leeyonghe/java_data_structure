package project3;

public class ListQueue<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public ListQueue(){
        this.front = null;
        this.rear = null;
        size = 0;
    }

    public void add(T item) throws CloneNotSupportedException{
        
        Node<T> newitem = new Node<T>(item, null);        
        
        if (size == 0) {
            
            this.front = newitem;
            this.rear = newitem;

        }else{

            newitem.setNext(this.rear.clone());
            this.rear = newitem.clone();

            newitem.setNext(null);            
            if (this.front.getNext() == null) {
                this.front.setNext(newitem);
            }else{
                Node<T> obj = front;
                while (obj.getNext() != null) {
                    obj = obj.getNext();
                }
                obj.setNext(newitem);
            }

        }
        
        size++;
    }

    public void remove(){
        this.front = this.front.getNext();
    }

    public void displayAll(){
        Node<T> obj = front;
        String result = "";
        System.out.println("###################");
        System.out.println("Front");
        System.out.println("###################");
        while (obj.getNext() != null) {
            result += obj.getItem().toString()+" | ";
            obj = obj.getNext();
        }
        result += obj.getItem().toString();
        System.out.println(result);

        System.out.println("###################");
        System.out.println("Rear");
        System.out.println("###################");
        obj = rear;
        result = "";
        while (obj.getNext() != null) {
            result += obj.getItem().toString()+" | ";
            obj = obj.getNext();
        }
        result += obj.getItem().toString();
        System.out.println(result);
    }
    
}
