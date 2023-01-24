/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package project3;

public class App {

    public static void main(String[] args) {

        try {
            
            ListQueue<String> list = new ListQueue<>();
            list.add("item00");
            list.add("item01");
            list.add("item02");
            list.remove();
            list.add("item03");
            list.add("item04");
            list.add("item05");
            list.remove();
            list.add("item06");
            list.displayAll();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }

    
}