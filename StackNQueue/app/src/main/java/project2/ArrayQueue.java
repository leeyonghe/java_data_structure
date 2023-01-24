package project2;

import java.util.EmptyStackException;

public class ArrayQueue<T> {

    private T array[];

    private int front, rear, size;

    public ArrayQueue(){
        array = (T[]) new Object[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void add(T item){
        array[rear++] = item;
        size++;
    }

    public void remove(){
        array[front++] = null;
        size--;
    }

    public void displayAll(){
        String result = "";
        for (int i = front; i <= rear-1; i++) {
            result += array[i].toString() + (i == rear-1 ? "" : " | ");
        }
        System.out.println(result);
    }

    public T[] getArray() {
        return array;
    }
 
    public void setArray(T[] array) {
        this.array = array;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }
    
}
