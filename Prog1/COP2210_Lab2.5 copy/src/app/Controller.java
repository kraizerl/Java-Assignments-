package app;

public class Controller {


    public static void main(String[] args){

        yourInfoHeader();
    }



    //----------------------------------------------------
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
        System.out.println("Assigments: " + "LAB 3");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();

    }//end yourInfoHeader

    //----------------------------------------------------
    // beginning of printStepHeader(int stepNumber) method

    public static void printStepHeader(int stepNumber){

        System.out.println();
        System.out.println();
        System.out.println("================================");
        System.out.println("Step: " + stepNumber);
        System.out.println("================================");

    }//end printStep Header

    //----------------------------------------------------

}// end Controller
