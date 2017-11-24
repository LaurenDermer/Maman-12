
/**
 * Time2 - Represents the minutes been since midnight until time of object. 
 *
 * @author (Lauren Dermer)
 * @version (25/11/2017)
 */
public class Time2
{
    //Instance variable declaration

    private int _minFromMid; // Represents minutes from midnight

    public Time2( int h, int m) // Constructor to check if inputs are legal, if not reset them to 0
    {
        if (h<0 || h>23)
            h=0;
        else
            _minFromMid=(h*60);

        if (m<0 || m>59)
            m=0;
        else
            _minFromMid+=m;
    }

    public Time2(Time2 other)
    {
        _minFromMid=other.getHour()+other.getMinute();
    }

    public int getHour() // Return hours from midnight
    {
        return _minFromMid/60;
    }

    public int getMinute()
    {
        return _minFromMid%60;
    }

    public void setHour(int num) // Change from 'hour' to 'num'
    {
        if (num>=0 && num<=23) // Condition for 'num' to be a real hour value
            _minFromMid=(num*60);
    }

    public void setMinute(int num) // Change from 'minute' to 'num'
    {
        if (num>=0 && num<=59) // Condition for 'num' to be a real minute value
            _minFromMid+=num;
    }

    public int minFromMidnight() // Returns how many minutes been after midnight
    {
        return ((_minFromMid/60) + _minFromMid%60);
    }

    public boolean equals (Time2 other) // Check if 'other' is equal to current time
    {
        return ((_minFromMid/60) == other.getHour() && (_minFromMid%60) == other.getMinute());
    }

    public boolean before(Time2 other) // Check if the time is prior a specific time
    {
        return (this.minFromMidnight() < other.minFromMidnight());
    }

    public boolean after(Time2 other) // Check if time is after a specific time
    {
        return (minFromMidnight() > other.minFromMidnight());
    }

    public int difference (Time2 other) // Check minute difference between the 2 times
    {
        return (this.minFromMidnight() - other.minFromMidnight());
    }

    public String toString() // Returns object's content of hour and minute as String: hh:mm
    {
        String str = new String();

        if ((_minFromMid/60)<10) // Check if hour is a 1 digit value and add the '0' charachter if needed
            str+= "0";

        str+=(_minFromMid/60) + ":"; // Add the hour and the ':' charachter to the string output

        if ((_minFromMid%60)<10) // Check if minute is a 1 digit value and add the '0' charachter if needed
            str += "0";
        str += (_minFromMid%60); // Add the minute to the string output

        return str;
    }
}
