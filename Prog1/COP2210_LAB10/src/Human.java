public class Human {
    private int age;
    private Car car;

    public Human(String age) {//change to string for data.
        this.age = Integer.parseInt(age);
    }
    public Human(Car car, String age) { //change string
        this.car =car;
        this.age = Integer.parseInt(age);
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
       this.car = car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo(){
        if (car == null) {
            System.out.printf("Type->Human-> Age: %d\n", getAge());
        }else {
            System.out.printf("Type->Human-> Age: %d\n\t\t", getAge());
            car.displayInfo();
        }
    }
}
