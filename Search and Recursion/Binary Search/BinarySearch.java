public class BinarySearch {
    
    //Sorted List Only!!  logn time   
        //find midpoint index   
            //if midpoint index is the value return 
            //else if midpoint < value 
            //else if midpoint > value
    
    public static int binarySearchR(int[] arr, int value, int start, int end){
        if (start > end) {
            return -1;            
        }
        else{
            int mid = (start+end)/2;
            if (value == arr[mid]) {
                return mid;
            }
            else if(value < arr[mid]){
                return binarySearchR(arr, value, start, mid-1);
            }
            else{
                return binarySearchR(arr, value, mid+1, end);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,22,33,44,55,66,77,88,99,123,432,543,654,677,958,1111,2312,5467,9053,15213};

        int index = binarySearchR(nums, 99, 0, nums.length-1);

        if(index == -1){
            System.out.println("Value not found.");
        }
        else{
            System.out.println("Value found at index " + index);
        }
    }    
}
