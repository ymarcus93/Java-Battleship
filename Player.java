public class Player
{
    // These are the lengths of all of the ships.
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private static final int NUM_OF_SHIPS = 5;
    
    public Ship[] ships;
    public Grid playerGrid;
    public Grid oppGrid;
    
    public Player()
    {
        if (NUM_OF_SHIPS != 5) // Num of ships must be 5
        {
            throw new IllegalArgumentException("ERROR! Num of ships must be 5");
        }
        
        ships = new Ship[NUM_OF_SHIPS];
        for (int i = 0; i < NUM_OF_SHIPS; i++)
        {
            Ship tempShip = new Ship(SHIP_LENGTHS[i]);
            ships[i] = tempShip;
        }
        
        playerGrid = new Grid();
        oppGrid = new Grid();
    }
    
    public void addShips()
    {
        for (Ship s: ships)
        {
            playerGrid.addShip(s);
        }
    }
    
    public int numOfShipsLeft()
    {
        int counter = 5;
        for (Ship s: ships)
        {
            if (s.isLocationSet() && s.isDirectionSet())
                counter--;
        }
        
        return counter;
        
    }
    
    public void chooseShipLocation(Ship s, int row, int col, int direction)
    {
        s.setLocation(row, col);
        s.setDirection(direction);
        playerGrid.addShip(s);
    }
}