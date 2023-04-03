package app;

import living.Person;
import things.*;

import java.util.Random;


public class Controller {
    public static void main (String[] args){
        yourInfoHeader();

        //ArrayList grow in size [container] , no primitive types,
        //ArrayList<String> names = new ArrayList<>(); type String
        //ArrayList bookBag = new ArrayList<>(); type Object
        //bag.get(0).call, its a phone object but the text editor thinks it an object type
        // use ((Phone)bag.get(0)).call();
        // if (bag.get(0) instanceOf "Phone"){
        //      (Phone)bage.get(0).call();
        //
        // Arraylist<String> for(int i = 0; i<names.size(); i++)
        // command N , generate code function

        Random rndGen = new Random();
        Person person = new Person("Mike","Johnson");
        BookBag bookBag = new BookBag(person);
        person.setBookBag(bookBag);

        Phone newPhone =new Phone("(342)-221-24444");
        newPhone.displayInfo();


        for (int i = 1; i<=4; i++){
            int areaCode = rndGen.nextInt(100, 999);
            int threeDigit = rndGen.nextInt(100, 999);
            int fourDigit = rndGen.nextInt(1000,9999);
            String phoneNumber = "("+areaCode+")-"+threeDigit+"-"+fourDigit;
            Phone Phone0 = new Phone(phoneNumber);
            //Phone0.displayInfo();
            //bookBag.add(Phone0);
            bookBag.getItems().add(Phone0);
        }


        String [] subjects = {"Math","Chemistry","Economics","CS","Physics","History"};

        for (int i = 1; i<=4; i++){
            int rndI = rndGen.nextInt(0,5);
            double price = rndGen.nextDouble(50,200);
            Book books = new Book(subjects[rndI], price);
            bookBag.getItems().add(books);
        }


        //11
        PencilBag pencilBag = new PencilBag();
        bookBag.getItems().add(pencilBag);
        String [] colors = {"Red","Black","Green","Blue"};

        for (int i = 1; i <=5; i++){
            bookBag.getItems().add(pencilBag);
            int rndI = rndGen.nextInt(0,4);
            double rndP = rndGen.nextDouble(1,4);
            Pen pens = new Pen(colors[rndI], rndP);
            bookBag.getItems().add(pens);
        }

        bookBag.displayItems();
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Total Price of Possessions");
        System.out.println("------------------------------");
        person.totalPriceOfPossesions();











    }
    public static void yourInfoHeader() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("PROGRAMMER: " + "ZAIDOWICZ LORENZO");
        System.out.println("PANTHER ID: " + "6350603");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("SEMESTER: \t " + "FALL");
        System.out.println("CLASSTIME \t " + "6:20-9:20");
        System.out.println();
        System.out.println("Assigments: " + "LAB 8");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();
    }//end yourInfoHeader
}
