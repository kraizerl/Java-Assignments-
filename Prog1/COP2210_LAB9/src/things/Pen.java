package things;

public class Pen {

    private String color;
    private double price;

    public Pen(String color, double price){
        this.color = color;
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.printf("\nType->Pen->\t\tColor:%s\t\t\tPrice:%.2f",getColor(),getPrice());
    }
}
