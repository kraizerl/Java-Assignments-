package app;

public class Controller {

    public static void main(String[] args){
        yourInfoHeader();

        int x = 10;
        double y = 20.3;
        double z = x + y;

        System.out.println("The Value of x = " + x);
        System.out.println("The Value of y = " + y);
        System.out.println("The Value of z = " + z);

        System.out.println("\n");

        String name = "John Doe";
        double hourlyWage = 35.50;
        double hoursWorked = 38.25;

        System.out.printf("name: \t\t\t %-20s \n", name);
        System.out.printf("hourlyWage: \t %-20s \n", hourlyWage);
        System.out.printf("hoursWorked: \t %-20s \n", hoursWorked);

        System.out.println("\n");

        System.out.printf("name: %-20s \n", name);
        System.out.printf("name: %-8s hourlyWage: %.4f \n", name,hourlyWage);
        System.out.printf("name: %-10s \t hourlyWage: %.4f \t hoursWorked: %.3f \n", name,hourlyWage,hoursWorked);


        double weekPay = hoursWorked * hourlyWage;

        System.out.println("\n");
        System.out.printf("name: %s \n", name);
        System.out.printf("hoursWorked: %-1s \n", hoursWorked);
        System.out.printf("hourlyWage: %-2s\n", hourlyWage);
        System.out.printf("Employee: %-8s -> Weekly Pay is: $%.2f", name, weekPay);





    }//end main
    //----------------------------------------------------
    //beginning of yourInfoReader() method

    public static void yourInfoHeader(){

        System.out.println("===================================");
        System.out.println("PROGRAMMER: " + "ZAIDOWICZ LORENZO");
        System.out.println("PANTHER ID: " + "6350603");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("SEMESTER: \t " + "FALL");
        System.out.println("CLASSTIME \t " + "6:20-9:20");
        System.out.println();
        System.out.println("Assigments: " + "LAB 1.5");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understandand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();

    }//end yourInfoHeader

}//end of class
