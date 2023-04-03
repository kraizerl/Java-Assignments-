package human;
import java.util.Date;

public class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee() {
        super();
        salary = 0.0;
    }
    public SalariedEmployee(String name, Date hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }
    public SalariedEmployee(SalariedEmployee otherEmployee) {
        super(otherEmployee);
        setSalary(otherEmployee.getSalary());
    }
    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Salary cannot be a negative value");
            System.exit(0);
        }
    }
    public double getSalary() {
        return salary;
    }
    public double getPay() {
        return getSalary()/12;
    }
    public String toString() {
        return super.toString() + " at salary $" + getSalary();
    }
    public boolean equals(SalariedEmployee otherEmployee) {
        return (super.equals(otherEmployee) && getSalary() ==
                otherEmployee.getSalary());
    }
}
