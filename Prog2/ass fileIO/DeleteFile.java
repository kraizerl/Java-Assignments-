import java.util.Scanner;
import java.io.File;

public class DeleteFile{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file or folder name:");
        String name =keyboard.nextLine();

        File file = new File(name);

        System.out.println("Are you sure you want to delete " + name);
        System.out.println("Enter yes or no");

        if (keyboard.next().toUpperCase().equals("YES")) {
            file.delete();
            System.out.println("done");
        }else{
            System.out.println("You are save");
        }
    }
}