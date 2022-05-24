public class Room implements Comparable<Room>
{
    // Variables
    private double width;
    private double length;
    private int floor;

    // Getters
    public Double getWidth()
    {
        return this.width;
    }
    public Double getLength()
    {
        return this.length;
    }
    public int getFloor()
    {
        return this.floor;
    }

    // Setters
    public void setWidth(double width)
    {
        if (width > 0)
        {
            this.width = width;
        }

    }
    public void setLength(double length)
    {
        if (length > 0)
        {
            this.length = length;
        }
    }
    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    // Constructors
    public Room()
    {
        width = 10;
        length = 12.5;
        floor = 1;
    }

    public Room(Double one, Double two, int floor)
    {
        setFloor(floor);

        if (one >= two)
        {
            setLength(one);
            setWidth(two);
        } else{
            setLength(two);
            setWidth(one);
        }
    }

    // Overrides
    @Override
    public String toString()
    {
        return getLength() + " x " + getWidth() + " on floor " + getFloor();
    }

    @Override // I'm stuck here
    public int compareTo(Room o)
    {
        return 0;
    }
}
