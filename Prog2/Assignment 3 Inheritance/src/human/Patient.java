package human;

public class Patient extends Person{
    private Doctor physician;

    public Patient(){
        super();
        physician = new Doctor();
    }
    public Patient(String name, Doctor physician){
        super(name);
        this.physician = physician;
    }

    public Doctor getPhysician() {
        return physician;
    }

    public void setPhysician(Doctor physician) {
        this.physician = physician;
    }
    public String toString() {
        return "The name is: " + getName() +
                " Primary doctor is: " + physician.getName();
    }
    public boolean equals() {
        return true; //fix later
    }
}
