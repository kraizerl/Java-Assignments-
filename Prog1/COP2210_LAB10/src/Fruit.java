import jdk.internal.math.FloatingDecimal;


public class Fruit {
    private String type;
    private double weight;


    public Fruit(String type, String weight) {   //change weight to string

        this.type = type;
        this.weight = Double.parseDouble(weight);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void displayInfo(){
        System.out.printf("Type->Fruit-> Type: %-9s \tWeight:%.1f\n",type,weight);
    }

}
