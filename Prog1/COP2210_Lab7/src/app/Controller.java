package app;

public class Controller {
    public static void main(String[] args){

        yourInfoHeader();
        // for(int i = 1; i<=10; i++){
        // Thread.sleep(1) waits 1 sec before repeating
        // }
        PrintHeader.printStepHeader(1);
        for(int i = -10; i<=10; i++){
            System.out.println("The value of i is: " + i);
        }

        PrintHeader.printStepHeader(2);
        for (int k = 0; k<=8; k += 2){
            System.out.println("The value of k is: " + k);
        }

        PrintHeader.printStepHeader(3);
        for (int l = 10; l>=0; l--){
            System.out.println("The value of l is: " + l);
        }

        PrintHeader.printStepHeader(4);
        for (int i = 0; i<=20; i++){
            if (i % 2 == 0){
                System.out.println("The value of i is: " + i + "\t even");
            }else {
                System.out.println("The value of i is: " + i + "\t odd");
            }
        }

        PrintHeader.printStepHeader(5);
        for (int i = 0; i<=20; i++){
            if (i % 2 == 0 && i <= 9){
                System.out.println("The value of i is: " + i + "\t\t even");
            } else if (i % 2 == 1 && i <=9) {
                System.out.println("The value of i is: " + i + "\t\t odd");
            } else if (i % 2 == 0) {
                System.out.println("The value of i is: " + i + "\t even");
            } else {
                System.out.println("The value of i is: " + i + "\t odd");
            }
        }

        PrintHeader.printStepHeader(6);
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 15; col++) {
                System.out.print("X" + "\t");
            }//end for col

            System.out.println();
        }//end for row

        PrintHeader.printStepHeader(7);
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++){
                if (row % 2 == 0){
                    System.out.print("O \t");
                }
                else if (col % 2 == 0){
                    System.out.print("O \t");
                }else {
                    System.out.print("X \t");
                }
            }

            System.out.println();
        }

        PrintHeader.printStepHeader(8);
        for (int row = 1; row <=10; row++){
            for (int col = 1; col<=10; col++){
                if (row == col){
                    System.out.print("X \t");
                } else {
                    System.out.print("O \t");
                }
            }

            System.out.println();
        }

        PrintHeader.printStepHeader(9);
        for (int row = 1; row<=10; row++){
            for (int col = 1; col<=10; col++){
                if (row == col || col == 11-row){      //...........
                    System.out.print("X \t");
                } else {
                    System.out.print("O \t");
                }
            }
            System.out.println();
        }

        PrintHeader.printStepHeader(10);
        for (int row = 1; row<=10; row++) {
            for (int col = 1; col <= 10; col++) {
                   if (row >= 3 && row <=8 && col >= 5){
                       System.out.print("X \t");
                   }else{
                       System.out.print("O \t");
                   }
            }
            System.out.println();
        }

        PrintHeader.printStepHeader(11);
        for (int row = 1; row<=10; row++){
            for (int col = 1; col<=10; col++){
                if (row % 2 == 1 || col % 3 == 0){
                    System.out.print("X \t");
                }else {
                    System.out.print("O \t");
                }
            }//end nested for
            System.out.println();
        }







    }
    public static void yourInfoHeader() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("PROGRAMMER: " + "ZAIDOWICZ LORENZO");
        System.out.println("PANTHER ID: " + "6350603");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("SEMESTER: \t " + "FALL");
        System.out.println("CLASSTIME \t " + "6:20-9:20");
        System.out.println();
        System.out.println("Assigments: " + "LAB 7");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();
    }//end yourInfoHeader
}

/** import java.util.Scanner;   Saving with interest example

public class SavingsInterestCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double initialSavings;  // User-entered initial savings
        double interestRate;    // Interest rate
        double currSavings;     // Current savings with interest
        int i;                  // Loop variable

        System.out.print("Enter initial savings: ");
        initialSavings = scnr.nextDouble();

        System.out.print("Enter interest rate: ");
        interestRate = scnr.nextDouble();

        System.out.println("\nAnnual savings for 10 years: ");

        currSavings = initialSavings;
        for (i = 0; i < 10; ++i) {
            System.out.println("$" + currSavings);
            currSavings = currSavings + (currSavings * interestRate);
        }
    }
} import java.util.Scanner;    MAX SEEN IN A LISt

 // Outputs max of list of integers
 // First value indicates list size
 // Ex: 4 -1 9 0 3  yields 9

 public class ListMax {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int maxSoFar = 0;
        int currValue;
        int numValues;
        int i;

        numValues = scnr.nextInt();

        for (i = 0; i < numValues; ++i) {
            currValue = scnr.nextInt();

          if (i == 0) { // First iteration
            maxSoFar = currValue;
            }
            else if (currValue > maxSoFar) {
                maxSoFar = currValue;
            }
          }

        if (numValues > 0) {
            System.out.println("Max: " + maxSoFar);
        }
    }
 } */