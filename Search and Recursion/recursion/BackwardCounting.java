import java.util.Scanner;

public class BackwardCounting{
        public static void backwardCounting(int n){
            if (n>0) {
                System.out.println(n + " ");
                n--;
                backwardCounting(n);
            }
        }
        public static void fowardCounting(int n,int i){
           
            if (i<=0) {
                System.out.println(i + " ");
                i++;
                fowardCounting(n,i);
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter 2 positive int");
            int num = scan.nextInt();
            int i = scan.nextInt();
            fowardCounting(num,i);
            
            scan.close();

        }
 }