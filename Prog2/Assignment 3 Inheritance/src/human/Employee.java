package human;
import java.util.Date;

public class Employee extends Person{   //child class
    private Date hireDate;

    public Employee(){
       super();
       hireDate = new Date();
    }
    public Employee(String name, Date hireDate) {
        setName(name);
        setHireDate(hireDate);
    }
    public Employee(Employee otherEmployee) {
        if(otherEmployee == null) {
            System.out.println("Error creating Employee");
            System.exit(0);
        }
        this.name = otherEmployee.name;
        this.hireDate = otherEmployee.hireDate;
    }
    public void setName(String name) {
        if(name == null) {
            System.out.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }
    public void setHireDate(Date hireDate) {
        if(hireDate == null) {
            System.out.println("Invalid hiring date");
            System.exit(0);
        }
        this.hireDate = hireDate;
    }
    public String getName() {
        return name;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public String toString() {
        return "The doctor " + getName() + " was hired on " + getHireDate();
    }
    public boolean equals(Employee otherEmployee) {
        return (getName().equals(otherEmployee.getName()) &&
                getHireDate().equals(otherEmployee.getHireDate()));
    }
}
