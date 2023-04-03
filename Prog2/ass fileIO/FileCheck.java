import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCheck{

     public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
        boolean done = false;
        
        if(file.exists()) {
            System.out.println("This file exists, enter new text or leave it empty to terminate:");
            
        } else {
           try{ 
                file.createNewFile();
                System.out.println("New file created UUUU, enter new text or leave it empty to terminate:");
           } catch(Exception e){
                e.printStackTrace();
           }
        }
        
        try {
            if(file.canWrite()){
                file.setWritable(true);
                PrintWriter writer = new PrintWriter(new FileOutputStream(file, true));
                while(!done){
                    String input = keyboard.nextLine();
                    if(!input.isEmpty()){
                        writer.println(input);
                    } else {
                        done = true;
                    }
                }
                System.out.println("Done");
                writer.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
} 