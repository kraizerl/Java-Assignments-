import person.*;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args){

        Manager Mark = new Manager("E001", "Mark", "HR", 15000,"Manager");
        Mark.display();
        Manager Peter = new Manager("E012","Peter","R&D",15000,"Manager");
        Peter.display();
        Clerk Samual = new Clerk("E056", "Samual", "Accounts",10000,"Clerk");
        Samual.display();
        System.out.println();

        Samual.printequals(Samual,Peter);

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of days E01 is present out of 20:");
        int e01present = scn.nextInt();
        System.out.println("Enter the number of days E012 is present out of 20:");
        int e012present = scn.nextInt();
        System.out.println("Enter the number of days E056 is present out of 20:");
        int e056present = scn.nextInt();

        Employee.employeeDeductions();




    }
}
