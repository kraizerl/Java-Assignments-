package airplane;
import java.util.Scanner;

public class Seats {
    //method that prints array
    public static void printArray(String[][] arr) {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                System.out.printf("%-2s",arr[row][col]);
            }
            System.out.println();
        }
    }
    //method that assigns you the seats in the airplane
    public static String[][] airplaneSeats(String[][] arr) {
        for(int row=0; row<arr.length; row++) {

            arr[row][0] = Integer.toString(row+1);
            arr[row][1] = "A";
            arr[row][2] = "B";
            arr[row][3] = "C";
            arr[row][4] = "D";
        }
        return arr;
    }
    public static void selectSeat(String[][] arr){
        System.out.println("You will be selecting seats for this airplane");
        Seats.printArray(arr);
        System.out.println("You will input the seat selection using the row number and then the seat letter (ex - 3B)" +
                "\nPlease enter the seat number or Q to quit");


        for (int i = 0; i <=28;i++){ //Works
            Scanner scn = new Scanner(System.in);
            String seat = scn.next();


            if (seat.equals("Q")) {
                System.out.println("Exiting the program.");
                System.exit(0);
            }
            char input1 = seat.charAt(0);
            char input2 = seat.charAt(1);
            //convert to int
            int intValue1 = input1 - '0';
            //convert to string
            String valueAsString = String.valueOf(input2);


            if (valueAsString == "A"){
                input2 = 1;
            } else if (valueAsString == "B") {
                input2 = 2;
            } else if (valueAsString == "C") {
                input2 = 3;
            } else if (valueAsString == "D") {
                input2 = 4;
            }
            int intValue2 = input2 - 64; //works

            if (arr[intValue1-1][intValue2] == "X"){
                System.out.println("Error: This seat is unavailable");
            }else {
                arr[intValue1-1][intValue2] = "X";
                printArray(arr);
            }
            System.out.println("You will be selecting seats for this airplane");
        }
    }

}
