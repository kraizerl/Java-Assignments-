package person;

public class Clerk extends Employee{
    public Clerk(String id, String name, String department, double salary, String designation) {
        super(id, name, department, salary, designation);
    }
    public double addBonus() {
        return salary + 100;
    }


}
