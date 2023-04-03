import java.util.Scanner;
import java.io.File;

public class FileChecking {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file or folder name:");
        String name =keyboard.nextLine();

        File file = new File(name);

        if (file.isFile()) {
            System.out.println("Its a file");
            System.out.println(file.getAbsolutePath());
        } else if (file.isDirectory()){
            System.out.println("Its a directoy");
            System.out.println(file.getAbsolutePath());
        } else{
            System.out.println("Invalid path");
        }


    }
}
