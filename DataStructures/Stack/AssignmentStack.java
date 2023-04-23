package Stack;
import java.util.*;


public class AssignmentStack {


// Given an expression string, write a program to examine whether the pairs and the orders of parenthesis  {, }, (, ), [, ] are correct in expression.
// For example, if the input: expression is entered by user is [()]{}{[()()]()},then the output should print “Balanced”.
// If the input: expression entered by user is [(]), then the output is “Not Balanced”

// Hint: Traverse the input string and use stack to push if you encounter an opening parenthesis and pop if you encounter a closing parenthesis of the same type.
   
   

    public static boolean balanceCheck(String input){
        Stack<Character> stack = new Stack<Character>();    
       
        // Traverse the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                //opening parenthesis = push
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // closing parenthesis, check if the stack is empty
                if (stack.isEmpty()) {
                    return false; // Return false if true
                }

                // pop the top element from the stack
                char top = stack.pop();


                // Check if the popped opening parenthesis matches the current closing parenthesis
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false; // Return false if there is a mismatch
                }
            }
        }

        return stack.isEmpty(); // Return true if stack is empty, false else
    }
   
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the parentheses expression:");

        try {    
            String expression = scan.nextLine();
            
            if(balanceCheck(expression) == true){
                System.out.println("Balance");
            }
            else{
                System.out.println("NOT Balance");
            }

        } catch (Exception e) {
                e.getMessage();
        }

        scan.close();
        
    }
}