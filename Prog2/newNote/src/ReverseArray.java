public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int[] temp = new int [arr.length];
        for (int i = 0; i<arr.length; i++){
            temp[i] = arr[arr.length-1-i];
        }
        return temp;
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int [] x = new int[10];

        for (int i = 0; i<x.length; i++) {
            x[i] = (int) (Math.random() * 1000 ); //math.random
        }
        printArray(x);

        int[] y = reverseArray(x);
        printArray(y);

    }
}
