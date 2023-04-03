package task2;

class Author implements Comparable<Author>{
    private String firstName;
    private String lastName;
    private String bookTitle;


    public Author(String firstName,String lastName, String bookTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookTitle = bookTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }


// comparable interface

  public int compareTo(Author o) {
       if(this.lastName.compareTo(o.lastName) != 0)
            return this.lastName.compareTo(o.lastName);
       else if (this.firstName.compareTo(o.firstName) != 0) {
           return this.firstName.compareTo(o.firstName);
       } else{
            return 0;
       }
    }


    @Override
    public String toString() {
        return firstName + ", " + lastName + "; " + bookTitle;
    }
}





