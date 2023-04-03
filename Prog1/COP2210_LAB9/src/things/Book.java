package things;

public class Book {
    private String subject;
    private double price;

    public Book(String subject, double price){
        this.price = price;
        this.subject = subject;
    }
    public String getSubject(){

        return subject;
    }
    public double getPrice(){

        return price;
    }
    public void displayInfo(){
        System.out.printf("\nType->Book->\tSubject:%-10.10s\tPrice:%.2f",getSubject(),getPrice());
    }
}
