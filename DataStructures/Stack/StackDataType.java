package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDataType {
    // basically pringles can, add and remove from top
    //    -peek(shows whats on top of stack), - push(adds new item to stack), -pop(remove item)
    public static void main(String[] args) {
        Stack stack = new Stack();

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        
        for(int k = 0;k<word.length(); k++){
            stack.add(word.charAt(k));
        }

        System.out.println("Reverse of " + word + " is: ");

        while(!stack.empty()){
            System.out.print(stack.pop());
        }
        
    }
}
