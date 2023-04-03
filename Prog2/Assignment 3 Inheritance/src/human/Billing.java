package human;

public class Billing {
    double amountDue;
    Doctor doctor;
    Patient patient;

    public Billing(){
        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        amountDue = 0;
    }
    //manual amountDue because of instructions
    public Billing(Doctor doctor,Patient patient, double amountDue){
        this.doctor = doctor;
        this.patient = patient;
        this.amountDue = amountDue;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getDoctor() {
        return doctor.getName();
    }

    public String getPatient() {
        return patient.getName();
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String toString() {
        return "Patient: " + getPatient()+
                "\nDoctor: " + getDoctor()+
                "Amount due: $" + amountDue;
    }
    public boolean equals() {
        return true; //fix later
    }
}
