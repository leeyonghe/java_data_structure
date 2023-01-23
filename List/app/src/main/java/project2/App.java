/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package project2;

public class App {

    public static void main(String[] args) {

        try {
            DList<String> list = new DList<String>();
            list.insertAfter("item00", null);
            list.insertAfter("item01", list.getItem(0));
            list.insertAfter("item04", list.getItem(1));            
            list.insertBefore("item05", list.getItem(2));
            list.insertAfter("item03", list.getItem(3));
            list.insertAfter("item02", list.getItem(4));
            list.insertAfter("item06", list.getItem(5));
            list.insertBefore("item07", list.getItem(3));
            list.displayAll();
            list.deleteNode(list.getItem(2));
            list.deleteNode(list.getItem(5));
            list.displayAll();
        } catch (NoResultException e) {            
            e.printStackTrace();
        }

    }

}
