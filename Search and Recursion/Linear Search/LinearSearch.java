public class LinearSearch{

    public static int iterativeLinearSearch(int[] arr, int value) {
        if (arr.length <= 0) {
            return -1;
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1;
        }
    }



    public static void main(String[] args) {
        int[] arr = {132,22,12,11,2,1,4,5,6,7,55,66,23};

        int result = iterativeLinearSearch(arr, 636);
        System.out.println(result);
    }
}