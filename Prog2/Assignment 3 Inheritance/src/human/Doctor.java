package human;

import java.util.Date;

public class Doctor extends SalariedEmployee{

    private String specialty; //"Pediatrician",  "Obstetrician",  "General  Practitioner",
    private double visitFee;

    public Doctor() {
        super();
        specialty = "";
    }

    public Doctor(String name, Date hireDate, double salary,String specialty, double visitFee) {
        super(name, hireDate,salary);
        setSpecialty(specialty);
        setVisitFee(visitFee);
    }
    public Doctor(Doctor otherDoctor) {
        super(otherDoctor);
        setSpecialty(otherDoctor.getSpecialty());
        setVisitFee(otherDoctor.getVisitFee());
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getVisitFee() {
        return visitFee;
    }

    public void setVisitFee(double visitFee) {
        this.visitFee = visitFee;
    }

    public String toString() {
        return super.toString() + "\n" + "The speciality is " + getSpecialty() + " and visit fee is $" + getVisitFee();
    }
    public boolean equals() {
        return true; //fix later
    }
}

