public class Location
{
    // Global Vars
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    // Instance Variables
    private boolean hasShip;
    private int status;
    private int lengthOfShip;
    private int directionOfShip;
    
    // Location constructor. 
    public Location()
    {
        // Set initial values
        status = 0;
        hasShip = false;
        lengthOfShip = -1;
        directionOfShip = -1;
    }

    // Was this Location a hit?
    public boolean checkHit()
    {
        if (status == HIT)
            return true;
        else
            return false;
    }

    // Was this location a miss?
    public boolean checkMiss()
    {
        if (status == MISSED)
            return true;
        else
            return false;
    }

    // Was this location unguessed?
    public boolean isUnguessed()
    {
        if (status == UNGUESSED)
            return true;
        else
            return false;
    }

    // Mark this location a hit.
    public void markHit()
    {
        setStatus(HIT);
    }

    // Mark this location a miss.
    public void markMiss()
    {
        setStatus(MISSED);
    }

    // Return whether or not this location has a ship.
    public boolean hasShip()
    {
        return hasShip;
    }

    // Set the value of whether this location has a ship.
    public void setShip(boolean val)
    {
        this.hasShip = val;
    }

    // Set the status of this Location.
    public void setStatus(int status)
    {
        this.status = status;
    }

    // Get the status of this Location.
    public int getStatus()
    {
        return status;
    }
    
    public int getLengthOfShip()
    {
        return lengthOfShip; 
    }
    
    public void setLengthOfShip(int val)
    {
        lengthOfShip = val;
    }
    
    public int getDirectionOfShip()
    {
        return directionOfShip; 
    }
    
    public void setDirectionOfShip(int val)
    {
        directionOfShip = val;
    }
}