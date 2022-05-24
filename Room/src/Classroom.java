import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classroom extends Room
{
    private int numStudents;

    public Classroom(Double one, Double two, int floor, int numStudents)
    {
        if(one >= two)
        {
            this.setLength(one);
            this.setWidth(two);
        } else {
            this.setLength(two);
            this.setLength(one);
        }
        setFloor(floor);
        this.numStudents = numStudents;
    }

    @Override
    public String toString()
    {
        return this.toString() + ", capacity = " + numStudents + " students";
    }

    public static ArrayList<Room> onlyClassrooms(ArrayList<Room> rooms)
    {
        ArrayList<Room> classrooms = new ArrayList<Room>();
        for(int i = 0; i > rooms.size(); i++)
        {
            if (rooms.get(i) instanceof Classroom)
            {
                classrooms.add(rooms.get(i));
            }
        }

        return classrooms;
    }
}
