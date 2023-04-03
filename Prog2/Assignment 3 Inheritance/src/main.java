import human.*;
import java.util.Date;

public class main {
    public static void main(String[] args){

        //the doctor class which is derived from the subclass SalariedEmployee which extends the class Employee which extends the Person main class
        Doctor doc1 = new Doctor("Bob", new Date(1969,12,31,19,00,12),39000,"Pediatrics", 10.5);
            System.out.println(doc1.toString());
        Doctor doc2 = new Doctor("Susan", new Date(1969,12,31,19,04,14),450000,"Surgeon", 150.5);
            System.out.println(doc2.toString());
        Doctor doc3 = new Doctor("Lilly", new Date(1969,12,31,19,04,14),290000,"Kidney",95.5);
            System.out.println(doc3.toString()+"\n");

        //Patient class extends person
        System.out.println("*Patient's Information*");
        Patient pat1 = new Patient("Fred", doc1);
            System.out.println(pat1.toString());
        Patient pat2 = new Patient("Sally", doc2);
            System.out.println(pat2.toString());
        Patient pat3 = new Patient("John", doc3);
            System.out.println(pat3.toString()+"\n");

        System.out.println("Billing's Information*");
        //had to manually insert amountDue because last entry was incorrect and not enough detail was given
        Billing bil1 = new Billing(doc1,pat1,21);
            System.out.println(bil1.toString());
        Billing bill2 = new Billing(doc2,pat2,150.5);
            System.out.println(bill2.toString());
        Billing bill3 = new Billing(doc3,pat3,170);
            System.out.println(bill3.toString()+"\n");


        //unnecessary array
         double[] arr = {bil1.getAmountDue(),bill2.getAmountDue(), bill3.getAmountDue()};
         double total = 0;
        for (double i: arr) {
            total += i;
        }
        System.out.println("The total income from billing records is: $"+total);



    }
}
