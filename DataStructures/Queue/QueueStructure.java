import java.util.ArrayDeque;
// Queue has to emplement all of Collection since its a interface or use ArrayDeque
// Two ended data structure, first in first out

public class QueueStructure{

    public static void main(String[] args) {
        
        

        ArrayDeque<Object> aq = new ArrayDeque<>();
        aq.offer("HI");
        aq.offer("$"+1000);

        System.out.println(aq);
        System.out.println(aq.pop());
        System.out.println(aq);
            
    }
}