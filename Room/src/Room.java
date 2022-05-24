public class Room
{
    // Variables
    private double width;
    private double length;
    private int floor;

    // Getters
    public Double GetWidth()
    {
        return this.width;
    }
    public Double GetLength()
    {
        return this.length;
    }
    public int GetFloor()
    {
        return this.floor;
    }

    // Setters
    public void SetWidth (double width)
    {
        if (width > 0)
        {
            this.width = width;
        }

    }
    public void SetLength (double length)
    {
        if (length > 0)
        {
            this.length = length;
        }
    }
    public void SetFloor (int floor)
    {
        this.floor = floor;
    }

    // Constructor
    public Room()
    {
        width = 10;
        length = 12.5;
        floor = 1;
    }

    public Room(Double one, Double two, int floor)
    {
        SetFloor(floor);

        if (one >= two)
        {
            SetLength(one);
            SetWidth(two);
        } else{
            SetLength(two);
            SetWidth(one);
        }
    }
}
