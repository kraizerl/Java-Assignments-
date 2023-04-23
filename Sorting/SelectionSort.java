package Sorting;

public class SelectionSort{
            // speed n best case, n^2 normal


        public int SelectionSort(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int min = 1;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] < arr[min]){
                        min = j;
                    }
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
            return arr;
        }

        


}