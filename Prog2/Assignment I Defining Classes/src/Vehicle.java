public class Vehicle {
    private double tankSize;
    private double efficiency;
    private double fuelInTank = 0;

    public Vehicle(double tankSize,double efficiency) {
        this.tankSize = tankSize;
        this.efficiency = efficiency;
    }

    public double getTankSize() {
        return tankSize;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }
    public double availableTankCapacity() {
        return getTankSize() - getFuelInTank();
    }
    //mutator method
    public void addPetrol(double petrolAmount){
        System.out.println("Adding " + petrolAmount + " gallons fuel to the tank.");
        if (petrolAmount <= availableTankCapacity()){
            fuelInTank += petrolAmount;
            System.out.println("Fuel in tank = " + getFuelInTank() + "gallons");
        }else {
            System.out.println("Error: Invalid amount");
        }
    }
    public double driveTo(){

        double distance = getFuelInTank() * getEfficiency();

            System.out.println("You can travel " + distance + " miles with available fuel");

        return distance;
    }

    public void carInfo() {
        System.out.println("Fuel In tank = "+getFuelInTank()
                + "\nTotal Capacity of Tank = " + getTankSize()
        +"\nFuel Efficiency = " + getEfficiency() +
                "\nAvailable Capacity of Tank = " + availableTankCapacity()
        );
    }
}
