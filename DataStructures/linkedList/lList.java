import java.util.LinkedList;
import java.util.Random;

public class lList{
    public static void main(String[] args) {
        // difference between linkedList and ArrayList
        //Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, 
        //so no bit shifting is required in memory.

        LinkedList<Integer> list = new LinkedList();
        
        int i=0;
        while ( i<10) {
            list.add(1 + (int)(Math.random() * 1000));
            i++;
        }

        //list.removeLast() , removeFirst()
        list.sort(null);
        System.out.println(list);
    }
}