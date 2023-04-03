public class Arrays {
    //positive negative values

    public void rearrange(int[] arr) {
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int i =0, j = 0;
        for(int k=0;k< arr.length;k++) {
            if (arr[k] > 0){
                pos[i]=arr[k];
                i++;
            }
            if (arr[k]<0){
                neg[j] = arr[k];
                j++;
            }
        }

        i = j = 0;
        while(neg[i] < 0){
            arr[j] = neg[i];
            j++;
            i++;
        }
        i=0;
        while(pos[i] >0){
            arr[j] = pos[i];
            j++;
            i++;
        }
    }

    public static void main(String[] args) {
        int [] x = {5,-3,6,-1,-8,9,4};
        Arrays pn = new Arrays();
        for (int i =0;i<x.length;i++){
            System.out.print(x[i] + " ");
            pn.rearrange(x);
            System.out.println("After Re-arranging the elements:");
            for (int k: x) {
                System.out.print(i + " ");

            }
        }
    }
}
