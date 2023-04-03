package things;

import java.util.Random;

public class Phone {
    private String number;
    private double price;

    public Phone(String number){
        price = Math.random() * ( 1450 - 150); //double //use nextInt nextDouble
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.printf("\nType->Phone->\t%s\t\tPrice:%.2f",getNumber(),getPrice());
    }

}
