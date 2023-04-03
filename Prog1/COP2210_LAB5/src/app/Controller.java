package app;

import building.House;
import buildingunit.Room;
import cooling.AC;
import static cooling.AC.acStats;

public class Controller {

    public static void main(String[] args) {

        acStats();

        Room kitchen = new Room("Kitchen", "White", 15.5,10,78);
        kitchen.roomStats("");

        Room livingRoom = new Room("Living Room", "Tan", 25, 20.7, 76.5);
        Room bathroom = new Room("Bathroom","White",15,10,74.3);
        Room bedroom = new Room("Bedroom","Blue",8,8,78);

        livingRoom.roomStats("");
        bathroom.roomStats("");
        bedroom.roomStats("");

        House myHouse = new House(kitchen,livingRoom,bathroom,bedroom);
        myHouse.displayInfo();

        System.out.println("--------------------------------------------");
        System.out.println("What is the house's total square feet; " + myHouse.getHouseSquareFeet());
        System.out.println("--------------------------------------------");
        System.out.println();

        AC.acStats();

        System.out.println("--------------------------------------------");
        System.out.println("Call by Value ");
        System.out.println("--------------------------------------------");
        System.out.println();

        AC.changeTemperatureDown(livingRoom.getTemperature(),5);
        livingRoom.roomStats("");

        AC.changeTemperatureDown(myHouse.getKitchen().getTemperature(),3);
        myHouse.getKitchen().roomStats("");

        AC.acStats();

        System.out.println("--------------------------------------------");
        System.out.println("Call by Reference ");
        System.out.println("--------------------------------------------");
        System.out.println();

        AC.changeTemperatureDown(livingRoom, 5);
        livingRoom.roomStats("");

        AC.changeTemperatureDown(myHouse.getKitchen(), 3);
        myHouse.getKitchen().roomStats("");

        AC.acStats();


    }//end main
}//end Controller
