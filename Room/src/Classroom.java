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
}
