public class Flight {
    private int flightNum;
    private String source;
    private String destination;
    private int numAvailableSeats;

    public Flight() {
        flightNum = 0;
        source = "none";
        destination = "none";
        numAvailableSeats = 0;
    }

    public Flight(int flightNum, String source, String destination, int numAvailableSeats) {
        this.flightNum = flightNum;
        this.source = source;
        this.destination = destination;
        this.numAvailableSeats = numAvailableSeats;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumAvailableSeats() {
        return numAvailableSeats;
    }

    public void setNumAvailableSeats(int numAvailableSeats) {
        this.numAvailableSeats = numAvailableSeats;
    }
    public void reserve(int numAvailableSeats){
        //check there is enough seats
    }
    public void cancel (int numAvailableSeats){
        //cancel reserve
    }
    public String toString(){
        return "k";
    }
}
