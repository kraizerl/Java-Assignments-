package vehicle;
import java.util.Random;

public class Car {

    private final static String VIN = "VIN-";
    private static int carID = 1000;
    private static String[] colors = {"White", "Red","Blue", "Green", "Black"};
    private static int minMPG = 10;
    private static int maxMPG = 50;
    private static int minPrice = 25000;
    private static int maxPrice = 65000;

    private String vin;
    private String color;
    private double mpg;
    private double price;

    public Car(){

        carID++;
        int rndNum = new Random().nextInt(0,4);
        color = colors[rndNum];
        mpg = (Math.random()* (maxMPG - minMPG + 1)) + minMPG;
        price = (int) (Math.random()* (maxPrice - minPrice + 1)) + minPrice;
        vin = VIN + carID;


    }

    public static String[] getColors(){
        return colors;
    }
    public static int getMinMPG(){
        return minMPG;
    }
    public static int getMaxMPG(){
        return maxMPG;
    }
    public static int getMinPrice(){
        return minPrice;
    }
    public static int getMaxPrice(){
        return maxPrice;
    }
    public String getVin(){
        return VIN;
    }
    public String getColor(){
        return color;
    }
    public double getMpg(){
        return mpg;
    }
    public double getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMpg(double mpg){
        this.mpg = mpg;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void displayInfo(){

        System.out.printf("VIN: %-10.10s ", vin);
        System.out.printf("Color: %-6.6s ", color);
        System.out.printf("Price: %-15.2f",price);
        System.out.printf("MPG: %.2f",mpg);
        System.out.println();
    }

}
