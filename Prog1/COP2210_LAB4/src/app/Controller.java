package app;

import vehicle.Car;

public class Controller {

    public static void main (String[] args){

        System.out.println("Lab4");
        yourInfoHeader();


        Car c1 = new Car(); //instance of Car
        c1.displayInfo();
        c1.classDisplayInfo();

        Car c2 = new Car("White",4);
        c2.displayInfo();

        Car c3 = new Car("Black",2);
        c3.displayInfo();

        Car c4 = new Car("Blue",4,38500,10432);
        c4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Working with instance method");
        System.out.println("----------------------------");

        c4.setColor("Green");
        c4.setNumberOfDoors(4);
        c4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Working with public instance method");
        System.out.println("----------------------------");
        System.out.println();

        c2.displayInfo();
        c2.doYouLikeIt = "No"; // changing public variable of instance c2
        c2.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Working with build-in string method");
        System.out.println("----------------------------");
        System.out.println();

        System.out.printf("\nColor of instance c1:\t\t\t\t\t\t%s",c1.getColor());
        System.out.printf("\nLength of Color of instance c1:\t\t\t\t%d\n",c1.getColor().length());

        System.out.println("CarID of instance c2:                       "+c2.getCarId());
        System.out.printf("Index of 'd' of c2's CarID:\t\t\t\t\t%d\n",c2.getCarId().indexOf("d"));

        System.out.println("CarID of instance c2:                       "+c2.getCarId());
        System.out.printf("Index of the first 'o' of c2's CarID:\t\t%d\n",c2.getCarId().indexOf("o")); //default index = 1

        System.out.println("CarID of instance c2:                       "+c2.getCarId());
        System.out.printf("Index of the second 'o' of c2's CarID:\t\t%d\n",c2.getCarId().indexOf("o",6));

    }















    //------------------------------------------------
    //beginning of yourInfoReader() method

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
        System.out.println("Assigments: " + "LAB 4");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();

    }//end yourInfoHeader

}