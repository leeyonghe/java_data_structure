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

    
    
}
