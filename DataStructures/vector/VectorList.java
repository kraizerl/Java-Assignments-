import java.util.*;

public class VectorList {
    //class that uses array
   // vector grows by 50% when new element is added
   //   Syncronized 

   public static void main(String[] args) {
    String word = "LOPEOFKSACX";
   
   
    Vector v = new Vector<>();    //<> specify data type
        for(int k = 0;k<word.length(); k++){
            v.add(word.charAt(k));
        }
    }
}
