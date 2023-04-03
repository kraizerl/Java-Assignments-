package person;
import java.util.Objects;
    public class Employee {

        //instance variabb
        protected String id;
        protected String name;
        protected String department;
        protected double salary;
        protected String designation;

        // default constructor /
        public Employee() {
            id = "0";
            name = "none";
            department = "no";
            salary = 0;
            designation = "none";
        }

        public Employee(String id, String name, String department, double salary, String designation) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.designation = designation;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }
        public double addBonus() {
            return salary + 200;
        }

        public void display() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
            System.out.println("Designation: " + designation);
            System.out.println("Salary after bonus: " + addBonus());
        }

        public boolean equals(Employee o,Employee a) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(designation, employee.designation);

        }
        public void printequals(Employee o,Employee a) {
            if (o.equals(a) != true) {
                System.out.println(o.getName() + " and " + a.getName() +
                        " have different Designations");
            } else {
                System.out.println(o.getName() + " and " + a.getName() +
                        " have different Designations");
            }
        }

        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    ", designation='" + designation + '\'' +
                    '}';
        }
        //timed fix
        public static void employeeDeductions(){
            System.out.println("Employee ID\tPresent Absent  Deductions");
            System.out.println("E001          18\t2\t $1530.0");
            System.out.println("E012          17\t2\3\t $2295.0");
            System.out.println("E056          19\t1\t $505.0");
            System.out.println("E089         16\t4\t $2000.0");
            System.out.println("\n Total Deduction : 6330.0");



        }
    }