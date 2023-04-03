package task2;
import java.util.ArrayList;
import java.util.*;

public class Controller {
    public static void main(String[] args) {
       //arrayList of 5 authors
        ArrayList<Author> authors = new ArrayList<>();
        Author a1 = new Author("Henry", "Miller", "Tropic of Cancer");
        Author a2 = new Author("Nalo", "Hopkinson", "Brown Girl in the Ring");
        Author a3 = new Author("Frank", "Miller", "300");
        Author a4 = new Author("Deborah", "Hopkinson", "Sky Boys");
        Author a5 = new Author("George R. R.", "Martin", "Song of Ice and Fire"); //john elden ring
        authors.add(a1);
        authors.add(a2);
        authors.add(a3);
        authors.add(a4);
        authors.add(a5);

        // unsorted display
        for(Author aa: authors){
            System.out.println(aa);
        }
        //call Collection.sort method
        Collections.sort(authors);
        //sorted List 
        System.out.println("\n\n** After sorting ** ");
        for(Author aa: authors){
            System.out.println(aa);
        }

    }
}
