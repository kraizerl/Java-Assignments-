import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args){

        int[] z = {8,2,7,3,10,5,2};
        for (int k = 0; k<z.length; k++){
            if (k +2 < z.length){
                z[k+2] = z[k];
            }
        }
        for (int k = 0; k<z.length;k++){
            System.out.print(z[k] + "\t");
        }
        System.out.println();System.out.println();

        // code to find out how many elements are in array = arr.length
        // code to find out how many elements are in arraylist = arr<>.size()

        for (int row = 1; row <=3;row++){
            System.out.print(row+")\t");
            for (int col = 1; col <=8;col++){
                System.out.print(col+"\t");
            }
            System.out.println();
        }

        int[] data = {29, 32, 8, 9, 7, 11, 4, 19, 38, 21, 11, 23, 45, 28, 13, 10, 29, 41, 35, 3, 17};
        System.out.println(numberOfElementsGreaterThan(data, 30));
        int trv =numberOfElementsGreaterThan(data,23);

        // Q.11.2
        Random rndGen = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<10; i++){
            numbers.add(rndGen.nextInt(1001));
        }
        valuesGreaterThanAverage(numbers);

        int[] y = {10,50,70,100};
        for(int k = 1; k < y.length; k++){
            System.out.print(y[k] - y[k-1] + " ");
        }

        //Q.17
        System.out.println(totalValue(numbers));

        //Q.22
        String[ ] computers = {"Apple", "Dell", "HP", "Microsoft"};
        int m;
        double n;
        Scanner input = new Scanner(System.in);
        for (int i = 4; i < computers.length; i++)
        {
            m = 0;
            for (int j = 1; j <= 3; j++)
            {
                System.out.println("Enter " + computers[i] + " amount # " + j + ": ");
                m += input.nextInt();
                input.nextLine();
            }
            n = (double) m / 5;
            System.out.println(computers[i] + " " + n);
        }









    }
    public static int numberOfElementsGreaterThan(int[] nums, int numbersToCompare){
        int numsGreater = 0;
        for (int n: nums){
            if (n>numbersToCompare){
                numsGreater++;
            }
        }
        return numsGreater;
    }

    public static void valuesGreaterThanAverage(ArrayList<Integer> values) {
        int sum = 0;
        for(int a: values){
            sum += a;
        }
        double average = (double)sum/(double)values.size();
        System.out.print("Numbers Greater than Average: ");
        for (int n: values){
            if (n > average){
                System.out.print(n + "\t");
            }
        }
        System.out.println();
        System.out.println("Average: "+average);

    }
    public static int totalValue(ArrayList<Integer> values){
        int total = 0;
        for(int t: values){
            total += t;
        }
        System.out.println(total);
        return total;
    }

}

