
/**
 * The class Flight represents a flight
 *
 * @author (Lauren Dermer)
 * @version (25/11/2017)
 */
public class Flight
{
    final int MAX_CAPACITY=250; // Final max passengers on flight
    
    // instance variables
    private String _origin; // City origin from which the flight departures
    private String _destination; // City of flight destination
    private Time1 _departure; // Time of when the flight departures
    private int _fllightDuration; // Time of flight duration in minutes
    private int _noOfPassengers; // Number of passangers in flight
    private boolean _isFull; // True or false if the flight is full
    private int _price; // Price of flight ticket per person
    
    /**
     * Constructor for objects of class Flight
     */
    
    public Flight()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
