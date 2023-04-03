package machine;

import food.Apple;
import food.Sandwich;
import transactions.Payment;

public class Register {

    //----------------------------------------------------------
    // Class variables
    // Check UML Diagram
    //----------------------------------------------------------
    private static int registerCounter = 0;
    private static final  String REGISTERCODE =  "US-FL-032020-";
    private static final double DOLLARVALUE = 1.00;
    private static final double QUATERVALUE = 0.25;
    private static final double DIMEVALUE = 0.10;
    private static final double NICKELVALUE = 0.05;
    private static final double PENNYVALUE = 0.01;
    //---------------------------------------------------------- 
    // Instant variables 
    // Check UML Diagram 
    //---------------------------------------------------------- 
    // YOUR CODE HERE 
    private String registerID;
    private int numberOfOneDollarBills;
    private int numberOfQuarters;
    private int numberOfDimes;
    private int numberOfNickels;
    private int numberOfPennies;
    private double currentTotal;
    //---------------------------------------------------------- 
    // Constructor 
    //---------------------------------------------------------- 

    public Register(int numberOfOneDollarBills,
                    int numberOfQuarters,
                    int numberOfDimes,
                    int numberOfNickels,
                    int numberOfPennies) {

        // increment registerCounter by one
        // YOUR CODE HERE
        registerCounter++;
        // set registerID to REGISTERCODE + registerCounter 
        // YOUR CODE HERE 
        registerID = REGISTERCODE + registerCounter;

        currentTotal = 0.0;

        // set the constructor inputs values to the register instant variables
        // hint code:
        // this.numberOfOneDollarBills = numberOfOneDollarBills;
        // YOUR CODE HERE
        this.numberOfOneDollarBills = numberOfOneDollarBills;
        this.numberOfQuarters = numberOfQuarters;
        this.numberOfDimes = numberOfDimes;
        this.numberOfNickels = numberOfNickels;
        this.numberOfPennies = numberOfPennies;

    }

    //---------------------------------------------------------- 
    // Utility methods 
    // Check UML Diagram 
    //---------------------------------------------------------- 

    private double cashValue(){

        double total = numberOfOneDollarBills * DOLLARVALUE +
                numberOfQuarters * QUATERVALUE +
                numberOfDimes * DIMEVALUE +
                numberOfNickels * NICKELVALUE +
                numberOfPennies * PENNYVALUE;

        return total;

    }

    public void cashInfo(String personal){

        // if the personal is a Manager 
        // then output the cashValue of the register 
        // hint code: 
        /* 
        System.out.println("=========================================="); 
           System.out.println("Register Cash Info"); 
           System.out.println("=========================================="); 
           System.out.println("Access Level:\t\t Valid"); 
           System.out.printf("Cash in the Register:\t $%-15.2f\n", cashValue()); 
           System.out.printf("Dollars:\t\t %-15d\n", numberOfOneDollarBills); 
           System.out.printf("Quarters:\t\t %-15d\n", numberOfQuarters); 
        ..... 
        */

        // else the personal is not a Manager the denied access 
        // hint code: 
        /* 
        System.out.println("=========================================="); 
           System.out.println("Register Cash Info"); 
           System.out.println("=========================================="); 
           System.out.println("Access Level:\t\t Not Valid by " + personal); 
           System.out.println(""); 
        */
        // hint use an if else statement
        // YOUR CODE HERE
        if (personal == "Manager"){
            System.out.println("==========================================");
            System.out.println("Register Cash Info");
            System.out.println("==========================================");
            System.out.println("Access Level:\t\t\t\t Valid");
            System.out.printf("Cash in the Register:\t\t $%-15.2f\n", cashValue());
            System.out.printf("Dollars:\t\t\t\t\t %-15d\n", numberOfOneDollarBills);
            System.out.printf("Quarters:\t\t\t\t\t %-15d\n", numberOfQuarters);
            System.out.printf("Dimes:\t\t\t\t\t\t %-15d\n", numberOfDimes);
            System.out.printf("Nickels:\t\t\t\t\t %-15d\n", numberOfNickels);
            System.out.printf("Pennies:\t\t\t\t\t %-15d\n", numberOfPennies);




        } else {
            System.out.println("==========================================");
            System.out.println("Register Cash Info");
            System.out.println("==========================================");
            System.out.println("Access Level:\t\t\t\t Not Valid by " + personal);
            System.out.println("");
        }
}

    public void buyApple(Apple apple, Payment payment){
        System.out.println("==========================================");
        System.out.println("Register Buy Apple");
        System.out.println("==========================================");
        System.out.printf("Apple Price:\t\t\t\t $%-15.2f\n" , apple.price() );
        System.out.printf("Payment:\t\t\t\t\t $%-15.2f\n" , payment.paymentValue() );

        // check if you have enough payment to buy the apple
        // if your payment is less the apple price calculate the amount short
        // and output to the console
        // Sorry but you do not have enough money to buy the Apple
        // hint code:
        /* 
            System.out.printf("You need:\t\t $%-15.2f\n",shortAmount ); 
            System.out.println(""); 
            System.out.println("Sorry but you do not have enough money to buy the Apple"); 
            System.out.println("=========================================="); 
            System.out.println("\n"); 
 */
        // else you have enough payment then give change to buyer
        // hence call the giveChange method with the apple price and payment
        // hint: use an if else statement
        // YOUR CODE HERE
        if(payment.paymentValue() < apple.price()){
            System.out.printf("You need:\t\t\t\t\t $%-15.2f\n", apple.price() - payment.paymentValue());
            System.out.println("");
            System.out.println("Sorry but you do not have enough money to buy the Apple");
            System.out.println("==========================================");
            System.out.println("\n");
        }else {
            giveChange(apple.price(),payment);
        }

    }//end buyApple() 


    public void buySandwich(Sandwich sandwich, Payment payment){
        System.out.println("==========================================");
        System.out.println("Register Buy Sandwich");
        System.out.println("==========================================");
        System.out.printf("Sandwicz Price:\t\t\t\t $%-15.2f\n" , sandwich.getPrice() );
        System.out.printf("Payment:\t\t\t\t\t $%-15.2f\n" , payment.paymentValue() );

        // check if you have enough payment to buy the sandwich 
        // if your payment is less the sandwich price calculate the amount short
        // and output to the console
        // Sorry but you do not have enough money to buy the Sandwich
        // hint code:
        /* 
   System.out.printf("Sandwich Price:\t\t $%-15.2f\n" , sandwich.getPrice() ); 
          System.out.printf("Payment:\t\t $%-15.2f\n" , payment.paymentValue() ); 
          ...  
            System.out.println(""); 
            System.out.println("Sorry but you do not have enough money to buy the Sandwich"); 
            System.out.println("=========================================="); 
            System.out.println("\n"); 
*/
        // else you have enough payment then give change to buyer
        // hence call the giveChange method with the sandwich price and payment
        // hint: use an if else statement
        // YOUR CODE HERE
        if (payment.paymentValue() < sandwich.getPrice()){
            System.out.println("");
            System.out.printf("Sandwich Price:\t\t\t\t $%-15.2f\n" , sandwich.getPrice() );
            System.out.printf("Payment:\t\t\t\t\t $%-15.2f\n" , payment.paymentValue() );
            System.out.printf("Amount Short:\t\t\t\t $%-15.2f\n" , sandwich.getPrice() - payment.paymentValue() );
            System.out.println("");
            System.out.println("Sorry but you do not have enough money to buy the Sandwich");
            System.out.println("==========================================");
            System.out.println("\n");
        }else{
            giveChange(sandwich.getPrice(), payment);
        }

    }//end buySandwich()
    private void giveChange(double price, Payment payment){

        // add payment to register
        // hint code:
        //  numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
        // YOUR CODE HERE
        numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
        numberOfQuarters += payment.getNumberOfQuarters();
        numberOfDimes += payment.getNumberOfDimes();
        numberOfNickels += payment.getNumberOfNickels();
        numberOfPennies += payment.getNumberOfPennies();


        // calculate needed change
        // YOUR CODE HERE
        double neededChange = payment.paymentValue() - price;
        // rounded to whole number so you can use the % operator for the change
        // example 9.65 becomes 965
        int neededChangeWhole = (int)Math.round(neededChange * 100);


        System.out.printf("Change:\t\t\t\t\t\t $%-15.2f\n", neededChange);

        int changeDollars = neededChangeWhole / 100;
        neededChangeWhole = neededChangeWhole - 100 * changeDollars;


        int changeQuarters = neededChangeWhole / 25;
        neededChangeWhole = neededChangeWhole - 25 * changeQuarters;

        int changeDimes = neededChangeWhole / 10;
        neededChangeWhole = neededChangeWhole - 10 * changeDimes;

        int changeNickels = neededChangeWhole / 5;
        neededChangeWhole = neededChangeWhole - 5 * changeNickels;

        int changePennies = neededChangeWhole ;
        neededChangeWhole = neededChangeWhole - changePennies;

        numberOfOneDollarBills -= changeDollars;
        numberOfQuarters -= changeQuarters;
        numberOfDimes -= changeDimes;
        numberOfNickels -= changeNickels;
        numberOfPennies -= changePennies;

        System.out.printf("Dollars:\t\t\t\t\t %-15d\n", changeDollars);
        System.out.printf("Quarters:\t\t\t\t\t %-15d\n", changeQuarters);
        System.out.printf("Dimes:\t\t\t\t\t\t %-15d\n", changeDimes);
        System.out.printf("Nickels:\t\t\t\t\t %-15d\n", changeNickels);
        System.out.printf("Pennies:\t\t\t\t\t %-15d\n", changePennies);

    }

}//end class