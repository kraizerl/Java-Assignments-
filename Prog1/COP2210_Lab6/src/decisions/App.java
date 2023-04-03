package decisions;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        yourInfoHeader();

        //Step 2: Simple if else
        System.out.println("");
        System.out.println("-------------------");
        System.out.println(" Step: 2");
        System.out.println("-------------------");
        System.out.println("");

        if (4<5){
            System.out.println("Four is less than Five");
        } else{
            System.out.println("Four is not less than Five");
        }// end if-else

        System.out.println("");
        System.out.println("-------------------");
        System.out.println(" Step: 3");
        System.out.println("-------------------");
        System.out.println("");

        int cookTime = 8;

        if(cookTime ==10){
            System.out.println("Cook time is 10 minutes");
        }else if(cookTime == 9){
            System.out.println("Cook time is 9 minutes");
        } else if (cookTime == 8) {
            System.out.println("Cook time is 8 minutes");
        } else if (cookTime == 7) {
            System.out.println("Cook time is 7 minutes");
        }else{
            System.out.println("Cook time is under 7 minutes");
        }//end if

        System.out.println("");
        System.out.println("-------------------");
        System.out.println(" Step: 4");
        System.out.println("-------------------");
        System.out.println("");

        // reads the input the user in
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the option number for the class you are in:");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - COP2210");
            System.out.println("2 - COP3337");
            System.out.println("-------------------------------------------------");
            System.out.println("Please enter a value: ");

            int userInput = sc.nextInt();

            if(userInput == 1){
                System.out.println("\nYou are in COP2210");
            }else if(userInput == 2){
                System.out.println("\nYou are in the COP3337");
            }else{
                System.out.println("\nYou enterd wrong optuin");
            }

            //Step 5

        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Step: 5");
        System.out.println("-----------------------");
        System.out.println("");

        String stateName1 = "Florida";
        String stateName2 = "Colorado";

        //simple if
        if(stateName1.equals("Florida")){
            System.out.println("You are in Florida");
        }

        System.out.println("");

        if(stateName1.equals(stateName2)){
            System.out.println("two states do not have the same name1");
        }

        System.out.println("");

        if(stateName1.equals("Florida") && stateName2.equals("Colorado")){
            System.out.println("StateName1 is Florida");
            System.out.println("StateName2 is Colorado");
        } else{
            System.out.println("You have the wrong state names");
        }

        //Step 6

        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Step: 6");
        System.out.println("-----------------------");
        System.out.println("");

        System.out.print("Enter your Name:");

        //user input variable
        String readingUserStringInput = sc.next();

        System.out.println("Your name is: " + readingUserStringInput);

        //Step 7: fix errors
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Step: 7");
        System.out.println("-----------------------");
        System.out.println("");

        System.out.print("Enter a number between 0 - 100: ");

        Scanner userInputReader = new Scanner(System.in);

        int someInput = userInputReader.nextInt();

        if(someInput == 50){
            System.out.println("Input equal 50");
        } else if(someInput <=49){
            System.out.println("Input less than 50");
        } else if(someInput <=75){
            System.out.println("Input less than or equal 75");
        } else if(someInput <=100){
            System.out.println("Input less than or equal 100");
        } else{
            System.out.println("Input outside range");
        }

        String str1 = "Hello";
        String str2 = "Bye";

        if(str1.equals(str2)){
            System.out.println("String text of str1 and str2 are the same");
        }

        //Step 8: if-else diagram
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Step: 8");
        System.out.println("-----------------------");
        System.out.println("");

        System.out.print("Enter the engine fuel-mixture value: ");

        Scanner aScanner = new Scanner(System.in);

        double mixture = aScanner.nextFloat();

        if (mixture >= 23.5) {
            System.out.println("Decrease Fuel Mixture by 0.30");
        } else if (mixture >= 23.0) {
            System.out.println("Decrease Fuel Mixture by 0.10");
        } else if (mixture >=22.5) {
            System.out.println("Decrease Fuel Mixture by 0.05");
        } else if (mixture >=21.0) {
            System.out.println("Decrease Fuel Mixture is Ok");
        } else if (mixture >=20.0){
            System.out.println("Increase Fuel Mixture by 0.10");
        } else {
            System.out.println("Sensor needs to be checked");
        }

        //Step 9: nested if else diagram code
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Step: 9");
        System.out.println("-----------------------");
        System.out.println("");

        Scanner anotherScanner = new Scanner(System.in);

        System.out.print("Enter the gear your in: ");
        int gear = anotherScanner.nextInt();

        System.out.print("\nEnter the rpm of the engine:");
        int rpm = anotherScanner.nextInt();

        System.out.print("\nAre the brakes on (y/n): ");
        String brakes = anotherScanner.next();

        System.out.println("Gear = "+ gear);
        System.out.println("RPM = "+ rpm);
        System.out.println("Brakes = "+ brakes);

        if (gear == 6 && rpm >= 12000){
            if (brakes.equals("y")){
                System.out.println("Please get off the brake, they are getting hot.");
            }else {
                System.out.println("You are moving.");
            }
        }else{
            if (brakes.equals("y")){
                System.out.println("Please get off the brake");
            }else {
                System.out.println("Ok");
            }
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
        System.out.println("Assigments: " + "LAB 6");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();
    }//end yourInfoHeader
}
