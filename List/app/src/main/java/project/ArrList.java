package project;

import java.util.NoSuchElementException;

public class ArrList<T> {

    private T[] array;

    /**
     * 
     */
    public ArrList(){
        array = (T[]) new Object[1];
        array[0] = (T) new Object();
    }

    /**
     * @param index
     * @return
     */
    public T peek(int index){
        if (array.length == 0) {
            throw new NoSuchElementException();
        }
        return array[index];
    }

    /**
     * @param item
     * @param index
     */
    public void insert(T item, int index){

        if (index >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        resizeOneByOne(RESIZE_TYPE.PLUS);
        for (int i = array.length-1; i >= 0  ; i--) {
            if (i >= index) {
                array[i] = array[i-1];
            }
        }
        
        array[index] = item;

    }

    /**
     * @param item
     */
    public void insertLast(T item){
        resizeOneByOne(RESIZE_TYPE.PLUS);
        try {
            array[array.length-1] = item;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    /**
     * @param index
     */
    public void delete(int index){

        if (index >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        int firstIndex = index;
        int LastIndex = array.length-2;
        for (int i = firstIndex; i <= LastIndex; i++) {            
            array[i] = array[i+1];
        }
        resizeOneByOne(RESIZE_TYPE.MINUS);
    }

    /**
     * @param k
     */
    public void resizeOneByOne(RESIZE_TYPE type){
        switch(type){
            case PLUS:{
                int totalcount = array.length+1;
                Object[] temp = new Object[totalcount];
                for (int i = 0; i < array.length; i++) {
                    temp[i] = (Object) array[i];
                }
                array = null;
                array = (T[]) temp;
            }break;
            case MINUS:{
                int totalcount = array.length-1;
                Object[] temp = new Object[totalcount];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = (Object) array[i];
                }
                array = null;
                array = (T[]) temp;
            }break;
        }
    }

    /**
     * 
     */
    public void displayAll(){
        for (int i = 0; i < array.length; i++) {
            Object obj = array[i];
            if (obj instanceof String) {
                System.out.println(obj.toString());
            }
            
        }
    }


}