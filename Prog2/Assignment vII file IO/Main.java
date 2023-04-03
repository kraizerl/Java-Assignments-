import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {   //reused code for 
            System.out.println("Enter the file name:");
            String fileName = keyboard.nextLine();

            File file = new File(fileName);

            if(!file.exists()) {            //in case file doesnt exist the program closes/ could ask to input again but 
                System.out.println("This file doesnt exist");
                System.exit(0);
            } 

            int num = 1;
            File tempFile;
            String tempFileName;
            do {            // temp file with a unique num at the end
                tempFileName = "Temp" + num + ".txt";
                tempFile = new File(tempFileName);
                num++;
            } while (tempFile.exists());

            // write the contents of the input file to the temporary file in a different line
            try (Scanner fileScanner = new Scanner(file);
                PrintWriter writer = new PrintWriter(tempFile)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] sentences = line.split("\\.");
                    for (String sentence : sentences) {
                        writer.println(sentence.trim());
                    }       
                }
                }catch (Exception e) {
                    e.printStackTrace();
                }

                keyboard.close();
                FileInputStream input=null;
                Scanner scanFile=null;
                PrintWriter writeFile=null;
                // need to read contents of tempFile
                try {
                    FileInputStream tempInput = new FileInputStream(tempFile);
                    scanFile =new Scanner(tempInput);
                    FileOutputStream sourceOutput = new FileOutputStream(file);
                    writeFile = new PrintWriter(sourceOutput);
                while(scanFile.hasNextLine()){
                    writeFile.println(scanFile.nextLine());
                }} catch (FileNotFoundException e) {
                    System.out.println("File cannot open");
                }

                scanFile.close();
                writeFile.close();              //flush() writes the content of the buffer to the destination and makes the buffer empty for further data to store but it does not closes the stream permanently. That means you can still write some more data to the stream. But close() closes the stream permanently.
                tempFile.delete();
                System.out.println("Done!");
                }
            }    
    }




/*Task:
Write a program that edits a text file to display each complete sentence with a period at the end in a
separate line. Your program should work as follows: Ask the user to input file name containing
sentences separated with a period (sentences may be in single line as a paragraph contains multiple
sentences). Create a temporary file, copy from the source file to a temporary file and perform the
required operation (write all sentences at a different line without a period). Copy the contents of the
temporary file back into the source file. Use a method (or methods) in the class File to remove the
temporary file.

You will also want to use the class File for other things in your program. The temporary file should
have a name that is different from all existing files so that the existing files are not affected (except for
the file being edited). Your program will ask the user for the name of the file to be edited. However,
it will not ask the user for the name of the temporary file but will instead generate the name within
the program. You can generate the name any way that is clear and efficient. One possible way to
generate the temporary file is to start with an unlikely name, such as "Temp1", and to append a digit,
such as '1', until a name is found that does not name an existing file. */