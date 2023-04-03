package living;
import things.*;

public class Person {
    private String firstName;
    private String lastName;
    private BookBag bookBag = null;

    public Person(String firstName, String lastName){

    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public BookBag getBookBag(){
        return bookBag;
    }
    public void setBookBag(BookBag bookBag){
        this.bookBag = bookBag;
    }

    public double totalPriceOfPossesions(){
        double totalPrice = 0;

        for (Object BookBag :bookBag.getItems()) {
            if (BookBag instanceof Phone){
                totalPrice += ((Phone) BookBag).getPrice();
            }else if(BookBag instanceof Book){
                totalPrice += ((Book) BookBag).getPrice();
            } else if (BookBag instanceof PencilBag) {
                for (Object pens: ((PencilBag) BookBag).getPens()) {
                    totalPrice +=  ((Pen)pens).getPrice();
                }

            }
        }

        System.out.printf("\nTotal:  $%.2f",totalPrice);
        return totalPrice;
    }






}
