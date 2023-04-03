import java.util.Scanner;

public class Controller {
    public static void main(String[] args){
        double avr;
        int n;
        Scanner scn1;
        boolean done = false;

        while (! done) { //done will be false as long as the code has exceptions
            try {
                scn1 = new Scanner(System.in);
                System.out.println("How many numbers you want to enter:");
                n = scn1.nextInt();
                if (n < 0) {
                   throw new IllegalArgumentException("Input must be a non-negative number.");
               }

               int [] nums = new int[n];
               int a=1;
               for(int i: nums){
                   System.out.println("Enter number " + a++);
                   nums[i] = scn1.nextInt();
                   if (nums[i] < 0) {
                       throw new IllegalArgumentException("Input must be a non-negative number.");
                   }
               }

                done = true;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Input must be a int.");
            }
        }



    }
}
