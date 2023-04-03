package buildingunit;

public class Room {
    private String type;
    private String color;
    private double lenght;
    private double width;
    private double temperature;

    public Room(String type, String color, double lenght, double width, double temperature){
        this.type = type;
        this.color = color;
        this.lenght = lenght;
        this.width = width;
        this.temperature = temperature;
    }

    //getter and setters

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getLenght(){
        return lenght;
    }
    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    private double squareFeet;
    public double getSquareFeet(){
        return squareFeet;
    }
    public void roomStats(String tabs){
        System.out.println(tabs +"==================================");
        System.out.println(tabs + "Room Stats: " + type);
        System.out.println(tabs +"==================================");
        System.out.println(tabs + "Type: \t\t\t " + type);
        System.out.println(tabs + "Colors: \t\t " + color);

        System.out.printf("%sTemperature: \t %.2f",tabs,temperature);
        System.out.printf("\n%sLength: \t\t %.2f",tabs,lenght);
        System.out.printf("\n%sWidth: \t\t\t %.2f",tabs,width);
        System.out.printf("\n%sSquare feet: \t %.2f",tabs, calculateSquareFeet());
        System.out.println();

    }

        private double calculateSquareFeet(){
            double squareFeet = getWidth() * getLenght();
            return squareFeet;
        }

}//end rom
