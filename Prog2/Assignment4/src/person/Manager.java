package person;

public class Manager extends Employee{
    public Manager(String id, String name, String department, double salary, String designation) {
        super(id, name, department, salary, designation);
    }
    public double addBonus() {
        return salary + 300;
    }

}
