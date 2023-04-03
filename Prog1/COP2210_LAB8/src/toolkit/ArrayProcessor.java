package toolkit;
import vehicle.Car;

public class ArrayProcessor {

    private static int eventsProcessed = 0;

    public static int getEventsProcessed(){
        eventsProcessed++;
        return eventsProcessed;
    }


    public static int[] createArrayWithInts(int sizeOfArray, int min, int max){

        eventsProcessed++;

        // creates an int array of a specified size and the entries of the array are integers within the range min and max.
        int [] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++){

            int rndNum = (int) (Math.random()* (max - min + 1)) + min;
            array[i] = rndNum;

        }

        return array;
    }

    public static double averageOfIntArray(int[] array){

        eventsProcessed++;

        double sum = 0;

        for (int j : array) {
            sum += j;
        }
        double average = sum/array.length;

        System.out.printf("Array Average: %s \n", average );
        System.out.println();

        return average;


    }

    public static void displayElementsOfIntArray(int[] array){
        eventsProcessed++;

        System.out.println("==============================");
        System.out.println("displayElementsOfIntArray");
        System.out.println("==============================");

        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    public static void findCarWithBestMPG(vehicle.Car[] cars){
        eventsProcessed++;
        System.out.println("========================================");
        System.out.println("findCarsWithBestMPG");
        System.out.println("========================================");

        Car bestMPG = cars[0];


        for (int i = 0; i < cars.length; i++){
            if (cars[i].getMpg() > bestMPG.getMpg() )
                bestMPG = cars[i];
        }
        bestMPG.displayInfo();

    }
    public static void findCarWithWorstMPG(vehicle.Car[] cars){

        eventsProcessed++;
        System.out.println("========================================");
        System.out.println("findCarsWithWorstMPG");
        System.out.println("========================================");

        Car worstMPG = cars[0];


        for (int i = 0; i < cars.length; i++){
            if (cars[i].getMpg() < worstMPG.getMpg() )
                worstMPG = cars[i];
        }
        worstMPG.displayInfo();

    }
    public static double averageOfCarPrices(Car[] cars){
        eventsProcessed++;

        double sum = 0;

        for (int i=0; i<cars.length; i++) {
            sum += cars[i].getPrice();
        }

        double average = sum/cars.length;

        System.out.printf("\nCar Average Price: $%.2f \n", average );

        return average;
    }

}


