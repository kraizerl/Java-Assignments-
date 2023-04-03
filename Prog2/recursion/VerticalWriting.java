import java.util.Scanner;

public class VerticalWriting {
    public static void VerticalWriting(int num) {
        if (num<10) {
            System.out.println(num);
        }
        else{
            VerticalWriting(num/10);
            System.out.println(num%10);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive int");
        int num = scan.nextInt();
        VerticalWriting(num);
        
        scan.close();
    }
}
