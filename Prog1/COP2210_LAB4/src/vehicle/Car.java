package vehicle;

import java.util.Random;

public class Car {
    private static int vehicleCounter = 2000;
    private static final String CAR_FACTORY_ID = "Norwood";

    private String carId;
    private String color;
    private String factory;
    private int numberOfDoors;
    private double price;
    private int mileage;
    public String doYouLikeIt;

    public Car() {

        carId = "VIN-" + CAR_FACTORY_ID+"-"+vehicleCounter;
        vehicleCounter++;

        factory = CAR_FACTORY_ID;
        numberOfDoors = 2;
        color = "Red";
        mileage = 0;

        Random rndGen = new Random();
        price = rndGen.nextInt(45000-35000+1)+35000;
        //price = rndGen.nextInt(35000,45000);

        doYouLikeIt = "Yes";

    }

    public Car(String color, int numberOfDoors){
        this();
        this.color =color;
        this.numberOfDoors=numberOfDoors;
    }

    public Car(String color, int numberOfDoors, double price, int mileage){
        this(color, numberOfDoors);
        this.price=price;
        this.mileage=mileage;
    }
    public static int getVehicleCounter(){  //getter
        return vehicleCounter;
    }
    public void setVehicleCounter(int vehicleCounter){   //setter
        this.vehicleCounter=vehicleCounter;
    }
    public String getCarId(){
        return carId;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getFactory(){
        return factory;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
    public double getPrice(){
        return price;
    }
    public String getDoYouLikeIt(){
        return doYouLikeIt;
    }
    public static void classDisplayInfo(){

        System.out.println("-----------------------");
        System.out.println("Car Class Info");
        System.out.println("-----------------------");
        System.out.println("vehicleCounter: \t\t\t\t"+vehicleCounter);
        System.out.println("CAR_FACTORY_ID: \t\t\t"+CAR_FACTORY_ID);
    }
    public void displayInfo(){
        System.out.println("-----------------------");
        System.out.println("Car Info");
        System.out.println("-----------------------");
        System.out.println("CarId: \t\t\t\t"+carId);
        System.out.println("Factory: \t\t\t"+factory);
        System.out.println("Number of Doors: \t"+numberOfDoors);
        System.out.println("Color: \t\t\t\t"+color);
        System.out.println("Mileage: \t\t\t"+mileage);
        System.out.println("Price: \t\t\t\t$"+price);
        System.out.println("Do you like it: \t"+doYouLikeIt);


    }

}
