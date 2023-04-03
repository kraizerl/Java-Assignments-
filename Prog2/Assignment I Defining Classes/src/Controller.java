import java.util.Scanner;

public class Controller {
    public static void main(String args[]){

        //scanner object for user input
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Tank Size of your car:");
        double tankSize = scn.nextDouble();

        System.out.println("Enter The efficiency of the car:");
        double efficiency = scn.nextDouble();


        Vehicle car = new Vehicle(tankSize,efficiency);
        car.carInfo();

        System.out.println("How much gallons of Petrol to add:");
        double petrol = scn.nextDouble();
        car.addPetrol(petrol);
        car.driveTo();
    }
}
