import java.util.Scanner;
import java.io.File;
import java.io.FilenameFilter;

public class ListOfFiles {    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file or folder name:");
        String name =keyboard.nextLine();

        File file = new File(name);

        if (file.isDirectory()) {
            //String[] list = file.list();
            
            String[] list = file.list(new FilenameFilter() {    //FileNameFilter

                @Override
                public boolean accept(File dir, String name) {
                        if (name.toLowerCase().endsWith(".xml")) {
                            return true;
                        }
                    
                    return false;
                } });       

            for(String i:list){
                System.out.println(i);
            }
        }else{
            System.out.println("Its not a vaalid folder name");
        }


    }
}