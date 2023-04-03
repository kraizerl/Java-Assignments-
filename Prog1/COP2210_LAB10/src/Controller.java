import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Controller {

    public static void main(String[] args) throws Exception {

        yourInfoHeader();

        System.out.println();
        System.out.println("===================================");
        System.out.println("Data.txt output");
        System.out.println("===================================");
        System.out.println();

        try {
            String fileLocation = "./Data/data.txt";

            BufferedReader br = new BufferedReader(new FileReader("./Data/data.txt"));
            String line;

            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
            }//endwihle
        } catch (IOException e) {

            e.printStackTrace();
        }

        //Step4 IIIIIIIIIIIIIIIII

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Human> human = new ArrayList<>();
        ArrayList<Fruit> fruits = new ArrayList<>();
        ArrayList<Bowl> bowls = new ArrayList<>();


        try {

            BufferedReader br = new BufferedReader(new FileReader("./data/data.txt"));

            String line;
            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {
                //parse CARS from data.txt, create new CAr intstance, then add instance to car ARRAYLIS
                String[] token = strCurrentLine.split(",");
                if (token[0].equals("Car")) {
                    Car car = new Car(token[1], token[2], token[3]);
                    cars.add(car);
                } else if (token[0].equals("Human")) { //step 6
                    Human Human ;
                    if(token.length > 2) {
                        Car humanCar = new Car(token[4], token[5], token[6]);
                        Human Humans = new Human(humanCar, token[1]);
                        human.add(Humans);
                    }else {
                        Human humans = new Human(token[1]);
                        human.add(humans);
                    }
                }else if(token[0].equals("Fruit")){
                    fruits.add(new Fruit(token[1],token[2]));

                }else if(token[0].equals("Bowl")){//step10
                    ArrayList<Fruit> frt = new ArrayList<>();

                    if (token.length <= 3) {
                        bowls.add(new Bowl(frt, token[1], token[2]));
                    }else{
                        String [] fruitTokens = new String[token.length - 3];
                        for (int i=4; i< token.length ; i++) {
                            fruitTokens[i - 4] = token[i];
                        }
                        for (int i = 0; i <= fruitTokens.length; i += 3){
                            String type;
                            String weight = "";

                            if (i % 3 == 0 && (i + 2) < fruitTokens.length) {
                                type = fruitTokens[i + 1];
                                weight = fruitTokens[i + 2];

                                frt.add(new Fruit(type,weight));
                            }


                        }
                        bowls.add(new Bowl(frt ,token[1], token[2]));
                            }
                        }



            }
            //step 5
        } catch (IOException e) {

            e.printStackTrace();
       }

        System.out.println();
        System.out.println("===========================");
        System.out.println("Car List");
        System.out.println("===========================");

        for (Car Car: cars) {
            Car.displayInfo();
        }//step8
        System.out.println();
        System.out.println("===========================");
        System.out.println("Human List");
        System.out.println("===========================");
        for(Human Human: human){
            Human.displayInfo();

        }//step9
        System.out.println();
        System.out.println("===========================");
        System.out.println("Fruit List");
        System.out.println("===========================");
        for(Fruit Fruit: fruits) {
            Fruit.displayInfo();
        }
        System.out.println();
        System.out.println("===========================");
        System.out.println("Bowl List");
        System.out.println("===========================");
        for (Bowl Bowl: bowls) {
            Bowl.displayInfo();
        }
        findYoungestHumanWithoutCar(human);//step13
        findOldestHumanWithCar(human);//step15
        bowlWithMostFruitWeight(bowls);

        }


    public static Human findYoungestHumanWithoutCar(ArrayList<Human> humans) {
        Human youngest = null; //big step12

        System.out.println();
        System.out.println("==================================");
        System.out.println("Youngest Human without Car");
        System.out.println("==================================");
        System.out.println();

        for (Human h: humans){
            if (h.getCar() == null){
                if (youngest == null){
                    youngest = h;
                }else{
                    if (youngest.getAge() > h.getAge()){
                        youngest = h;
                    }
                }
            }
        }
        youngest.displayInfo();
        return youngest;
    }
    public static Human findOldestHumanWithCar(ArrayList<Human> humans) {
        Human oldest = null;

        System.out.println();
        System.out.println("==================================");
        System.out.println("Oldest Human with Car");
        System.out.println("==================================");
        System.out.println();

        for (Human h: humans){
            if (h.getCar() != null){
                if (oldest == null){
                    oldest = h;
                }else{
                    if (oldest.getAge() < h.getAge()){
                        oldest = h;
                    }
                }
            }
        }
        oldest.displayInfo();
        return oldest;
    }
    public static Bowl bowlWithMostFruitWeight (ArrayList<Bowl> bowls){//last sto
        Bowl mostFruit = bowls.get(0);
        System.out.println();
        System.out.println("==================================");
        System.out.println("Bowl with the most fruit by weight");
        System.out.println("==================================");
        System.out.println();

        for(Bowl bowl: bowls){
            if(bowl.getFruits().size() > 0){
                double totalWeightHeaviest = 0;
                for(Fruit fruit: mostFruit.getFruits()){
                    totalWeightHeaviest += fruit.getWeight();
                }

                double totalWeightOfCurrent = 0;
                for(Fruit fruit: bowl.getFruits()){
                    totalWeightOfCurrent += fruit.getWeight();
                }
                if(totalWeightHeaviest < totalWeightOfCurrent){
                    mostFruit = bowl;
                }
            }
        }
        mostFruit.displayInfo();
        return mostFruit;
    }

    public static void yourInfoHeader() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("PROGRAMMER: " + "ZAIDOWICZ LORENZO");
        System.out.println("PANTHER ID: " + "6350603");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U02");
        System.out.println("SEMESTER: \t " + "FALL");
        System.out.println("CLASSTIME \t " + "6:20-9:20");
        System.out.println();
        System.out.println("Assigments: " + "LAB 10");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other.");
        System.out.println("===================================");
        System.out.println();
    }//end yourInfoHeader
}
/*if (token.length <= 3){ //step 10.2
                        bowls.add(new Bowl(frt, token[1],token[2] ));
                    }else{
                        String[] fruitTokens = new String[token.length -3];
                        for (int i = 4; i<token.length; i++){
                            fruitTokens[i-4] = token[1];
                        }
                        for (int i = 0; i<= fruitTokens.length; i+=3){
                            String type ;
                            String weight ;

                            if (i%3 == 0 && (i + 2) < fruitTokens.length){
                                type = fruitTokens[i+1];
                                weight = fruitTokens[i+2];


                                frt.add(new Fruit(type,weight));
                            }

                        }
                    }*/