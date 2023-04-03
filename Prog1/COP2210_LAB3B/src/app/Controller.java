package app;

import java.lang.reflect.Method;

public class Controller {


    public static void main(String[] args){
        yourInfoHeader();
        printStepHeader();
        printSingleInt(10);

        int value1 = 5;
        double value2 = 59.5;
        multipleNumbersIntAndDouble(value1,value2);

        System.out.println("");
        int temperature =200;
        double resultsFromAdding= addTwoNumbers(45.2,temperature);
        System.out.printf("The value resultFromAdding: %.1f\n",resultsFromAdding);

        calculateAreaOfTriangleWithOutput(36.3,18.2);

        double base = 17.16332;
        double height = 20.172391;
        double width = 20.51723;

        System.out.printf("Triangle info->\t\tbase:%.3f\t\theight:%.5f\t\tarea:%.3f\n",base,height,
                calculateAreaOfTriangle(base,height));
        System.out.printf("Rectangle info->\theight:%.4f\twidth:%.1f\t\t\tarea:%.5f\n",height,width,
                calculateAreaOfRectangle(height,width));

        Helper.displayInfo();

        double result=calculateAreaOfRectangle(9.4,17.2)+calculateAreaOfTriangle(21.5,10.3)
                +calculateAreaOfCircle(9.3);
        System.out.printf("Value of result:\t\t\t%.6f\n",result);

        Helper.complexArea();

        int circleMultiplier=4;
        int rectangleMultiplier=12;
        int triangleMultiplier=5;
        double results = circleMultiplier*calculateAreaOfCircle(10.7)+rectangleMultiplier*calculateAreaOfRectangle(14.2,20.7)
                +triangleMultiplier*calculateAreaOfTriangle(33.2,16.2);
        System.out.printf("Result:\t\t\t\t\t%.3f\n",results);
        System.out.println("circleMultiplier:       "+circleMultiplier);
        System.out.println("rectangleMultiplier:    "+rectangleMultiplier);
        System.out.println("triangleMultiplier:     "+triangleMultiplier);
    }
    public static void printSingleInt(int numberToPrint) {

        System.out.printf("Running printSingleInt -> %d \n", numberToPrint);

    }
    public static void multipleNumbersIntAndDouble(int firstNumber, double secondNumber){

        double result = firstNumber*secondNumber;
        System.out.printf("Running multipleNumbersIntAndDouble -> %d,%f\n",firstNumber,secondNumber);
        System.out.printf("\tfirstNumber:\t\t%d\n",firstNumber);
        System.out.printf("\tsecondNumber:\t\t%.1f\n",secondNumber);
        System.out.printf("\tresult:\t\t\t\t%.1f\n",result);

    }
    public static double addTwoNumbers(double aNumber,int otherNumber){

        double result = aNumber+otherNumber;
        System.out.printf("Running addTwoNumbers -> %.1f\n",result);
        return result;
    }

    public static void displaySingleResult(double methodResult,String methodName){
        System.out.println("==============================");
        System.out.println(methodName);
        System.out.println("==============================");
        System.out.printf("Value:\t%.4f\n",methodResult);
    }

    public static void calculateAreaOfTriangleWithOutput(double base,double height){
        double areaOfTriangle=(base*height/2);
        displaySingleResult(areaOfTriangle,"calculateAreaOfTriangleWithOutput");
    };
    public static double calculateAreaOfTriangle(double base,double height){
        double areaOfTriangle=(base*height/2);
        return areaOfTriangle;
    }
    public static double calculateAreaOfRectangle(double height,double width){
        double areaOfRecatangle=height*width;
        return areaOfRecatangle;
    }
    public static double calculateAreaOfCircle(double radius){
        double areaOfCircle=Math.PI*Math.pow(radius,2);  //PI*r^2
        return areaOfCircle;
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

    public static void printStepHeader(){

        System.out.println();
        System.out.println();
        System.out.println("================================");
        System.out.println("COP2210 LAB 3");
        System.out.println("================================");

    }//end printStep Header

    //----------------------------------------------------

}// end Controller
