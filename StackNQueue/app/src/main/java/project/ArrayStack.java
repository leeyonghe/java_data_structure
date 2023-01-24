package project;

import java.util.EmptyStackException;

public class ArrayStack<T> {

    private T stack[];
    private int top;

    /**
     * 
     */
    ArrayStack(){
        stack = null;
        top = -1;
    }

    /**
     * @return
     */
    public int size(){
        return top+1;
    }

    /**
     * @return
     */
    public boolean isEmpty(){
        return (top == -1);
    }

    public T peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public void push(T item){
        top++;
        if (stack == null) {
            stack = (T[]) new Object[top+1];
            stack[top] = item;
        }else{
            T newStack[] = (T[]) new Object[top+1];
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            newStack[top] = item;
            stack = newStack;
        }
    }

    public void pop(){
        stack[top] = null;
        top--;
        T newStack[] = (T[]) new Object[top+1];
        for (int i = 0; i < newStack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public void displayAll(){
        String result = "";
        for (int i = top; i >= 0 ; i--) {
            result += stack[i].toString()+(i != 0 ? "\n" : "");
        }
        System.out.println("Stack------------");
        System.out.println(result);
        System.out.println("-----------------");
    }

    public void displayOne(int index){
        System.out.println("[[[ "+stack[index].toString()+" ]]]");
    }

    public void displayPeek(){
        System.out.println("[[Peek]][[[ "+peek().toString()+" ]]]");
    }
    
}
