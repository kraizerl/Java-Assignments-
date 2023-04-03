package human;
import java.util.Date;


public class Person { // this is the parent class
        protected String name;
        public Person() {
           this("null");
        }
        public Person(String name) {
            this.name = name;
        }
        public Person(Person object){
            this.name = object.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String toString() {
            return "Person{name='" + name + "'}";
        }


        public boolean equals(Person other) {
            return (getName().equals(other.getName()));
        }

}
