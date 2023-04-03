//=============================================================================
// PROGRAMMER:  Lorenzo Zaidowicz
// PANTHER ID:  6350603
//
// CLASS:           COP2210
// SECTION:         UO2 1128
// SEMESTER:        Fall 2022
// CLASSTIME:       6:20PM-9:20
//
// Project:         Project 1
// DUE:             Oct 30
//
// CERTIFICATION:   I understand FIU’s academic policies, and I certify that this work is my
//                                 own and that none of it is the work of any other person.
//=============================================================================

package app;

import food.Apple;
import food.Sandwich;
import machine.Register;
import transactions.Payment;

public class Controller {
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("COP 2210 - Project 1 Output");
        System.out.println("Lorenzo Zaidowicz");
        System.out.println("6350603");
        System.out.println("U02 1228");
        System.out.println("===============================================");
        System.out.println("\n");

        // create a Register varaible named register with
        // 15 dollars
        // 20 quarters
        // 10 dimes
        // 20 nickels
        // 50 pennies
        // YOUR CODE HERE
        Register register = new Register(15,20,10,20,50);
        // check register cash as a "Manager"
        // call the cashInfo method on the register object with input "Manager"
        // YOUR CODE HERE
        register.cashInfo("Manager");
        // check register cash as a "Staff"
        // call the cashInfo method on the register object with input "Staff"
        // YOUR CODE HERE
        register.cashInfo("Staff");
        // create an Apple variable named grannySmith with
        // type = "Granny Smith"
        // weight = 1.51
        // pricePreUnitWeight = 140
        // YOUR CODE HERE
        Apple grannySmith = new Apple("Granny Smith", 1.51, 140);
        // call displayInfo() on the grannySmith object
        // YOUR CODE HERE
        grannySmith.displayInfo();
        // create an Payment variable named applePayment1 with
        // 10 dollars
        // 0 quarters
        // 0 dimes
        // 0 nickels
        // 47 pennies
        // YOUR CODE HERE
        Payment applePayment1 = new Payment(10, 0, 0, 0, 47);

        // call displayInfo() on the applePayment1 object
        // YOUR CODE HERE
        applePayment1.displayInfo();
        // call the buyApple method on the register object with
        // inputs grannySmith, applePayment1
        // YOUR CODE HERE
        register.buyApple(grannySmith, applePayment1);
        // check register cash as a "Manager"
        // call the cashInfo method on the register object with input "Manager"
        // YOUR CODE HERE
        register.cashInfo("Manager");

        // create an Apple variable named macintosh with
        // type = "Macintosh"
        // weight = 1.70
        // pricePreUnitWeight = 150
        // YOUR CODE HERE
        Apple macintosh = new Apple("Macintosh", 1.70, 150);

        // call displayInfo() on the macintosh object
        // YOUR CODE HERE
        macintosh.displayInfo();

        // create a Payment variable named applePayment2 with
        // 0 dollars
        // 2 quarters
        // 0 dimes
        // 0 nickels
        // 0 pennies
        // YOUR CODE HERE
        Payment applePayment2 = new Payment(0,2,0,0,0);
        // call displayInfo() on the applePayment2 object
        // YOUR CODE HERE
        applePayment2.displayInfo();
        // call the buyApple method on the register object with
        // inputs macintosh, applePayment2
        // YOUR CODE HERE
        register.buyApple(macintosh, applePayment2);
        // check register cash as a "Manager"
        // call the cashInfo method on the register object with input "Manager"
        // YOUR CODE HERE
        register.cashInfo("Manager");
        // create an Sandwich variable named sandwich with
        // meat = true
        // cheese = true
        // veggies = true
        // YOUR CODE HERE
        Sandwich sandwich = new Sandwich(true,true,true);
        // call displayInfo() on the sandwich object
        // YOUR CODE HERE
        sandwich.displayInfo();
        // create an Payment variable named sandwichPayment1 with
        // 5 dollars
        // 2 quarters
        // 1 dimes
        // 1 nickels
        // 2 pennies
        // YOUR CODE HERE
        Payment sandwichPayment1 = new Payment(5,2,1,1,2);
        // call displayInfo() on the sandwichPayment1 object
        // YOUR CODE HERE
        sandwichPayment1.displayInfo();
        // call the buySandwich method on the register object with
        // inputs sandwich, sandwichPayment1
        // YOUR CODE HERE
        register.buySandwich(sandwich, sandwichPayment1);
        // check register cash as a "Manager"
        // call the cashInfo method on the register object with input "Manager"
        // YOUR CODE HERE
        register.cashInfo("Manager");

        // create booleans
        boolean meat = true;
        boolean cheese = false;
        boolean veggies = true;

        System.out.println("");

        // Create all type sandwichs combinations
        // then buy each sandwich by creating a payment with
        // 10 dollars
        // 0 quarters
        // 0 dimes
        // 0 nickels
        // 0 pennies
        // YOU MUST USE A FOR LOOP AND IF ELSE STATMENTS
        // YOUR CODE HERE
        for (int i = 1 ; i <=8 ; i++){
            if (i<=4){
                meat = true;
            }else {
                meat = false;
            }
            //cheese part
            if (i % 2 == 1 ){
                if (cheese == false){
                    cheese = true;
                } else if (cheese == true) {
                    cheese = false;
                }
            } else if (i % 2 == 0){
                if (cheese == false){
                    cheese = false;
                } else if (cheese == true) {
                    cheese = true;
                }
            }


            if (i % 2 == 0){
                veggies = false;
            }else {
                veggies = true;
            }

            Sandwich s = new Sandwich(meat, cheese, veggies);
            s.displayInfo();
            Payment p = new Payment(10,0,0,0,0);
            p.displayInfo();
            register.buySandwich(s,p);
            register.cashInfo("Manager");

        }//end for loop
    }//end main
}//end class

