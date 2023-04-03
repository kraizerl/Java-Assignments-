package airplane;
public class Controller {
    public static void main(String[] args){

        String[][] airplane = new String[7][5];
        //new 2d Array that has 7 rows and 5 col
        Seats.airplaneSeats(airplane);
        //method that assigns seats for the array

        Seats.selectSeat(airplane);
        //method that gets user input to select seat or quit program
        //Use uppercase only
    }
}
//lorenzo zaidowicz