package app;
import toolkit.ArrayProcessor;
import vehicle.Car;

public class Controller {

    public static void main(String[] args){

        yourInfoHeader();

        for (int i = 0; i < 5; i++) {

            int array[] = ArrayProcessor.createArrayWithInts(10, -100, 1000);
            ArrayProcessor.displayElementsOfIntArray(array);
            ArrayProcessor.averageOfIntArray(array);

        }

        Car[] cars;
        cars = new Car[14]; //allocate 14 slots for object

       for (int index = 0; index <14; index++){

           cars[index] = new Car();
           cars[index].displayInfo();
       }

        ArrayProcessor.findCarWithBestMPG(cars);
        ArrayProcessor.findCarWithWorstMPG(cars);
        ArrayProcessor.averageOfCarPrices(cars);

        System.out.println("");
        System.out.println("=======================================");
        System.out.println("2d Arrays");
        System.out.println("=======================================");


        int[][] arrayWithinArrayOfInts = {{1}, {1,2}, {1,2,3}, {1,2,3,4}};
        double sum = 0;


        for (int i = 0; i < arrayWithinArrayOfInts.length; i++) {
            sum += arrayWithinArrayOfInts[i].length; //update sum
            System.out.print("{");

            for (int u = 0; u < arrayWithinArrayOfInts[i].length; u++){ //Matrix [i][u]
                if (arrayWithinArrayOfInts[i][u] < arrayWithinArrayOfInts[i].length) {
                    System.out.print(arrayWithinArrayOfInts[i][u] + ", ");
                }else {
                    System.out.print(arrayWithinArrayOfInts[i][u]);
                }


            }
            System.out.print("} ");
            double average = sum/ arrayWithinArrayOfInts[i][i];
            System.out.printf("\t\tAverage of Array Entry: %.1f\n", average);

        }

        System.out.println("===================================");
        System.out.println("ArrayProcessor Events");
        System.out.println("===================================");
        System.out.println("ArrayProcessor Events: " + ArrayProcessor.getEventsProcessed());














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
        System.out.println("Assigments: " + "LAB 8");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();
    }//end yourInfoHeader
}

