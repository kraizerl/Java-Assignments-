package things;
import living.Person;
import things.*;

import java.util.ArrayList;
import java.util.Objects;

public class BookBag {
    private Person owner;
    private ArrayList items;

    public BookBag(Person owner){
        items = new ArrayList<>();
        this.owner = owner;
    }

    public Person getOwner(){
        return owner;
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }
    public ArrayList getItems(){
        return items;
    }
    public void listItems(){

    }

    public void displayItems(){
        for (Object item: items){
            if (item instanceof Phone){
                ((Phone) item).displayInfo();
            } else if (item instanceof PencilBag) {

            } else if (item instanceof Book) {
                ((Book) item).displayInfo();
            } else if (item instanceof Pen) {
                ((Pen) item).displayInfo();
            } else if (item instanceof PencilBag) {
                for(Object pen : ((PencilBag)item).getPens() ){
                    ((Pen) pen).displayInfo();
                }
            }
        }
    }
}
