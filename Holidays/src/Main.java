import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static class Holiday
    {
        private String name;
        private int day;
        private String month;

        public Holiday(String _name, int _day, String _month)
        {
            name = _name;
            day = _day;
            month = _month;
        }
        public Boolean isSameMonth(Holiday holiday)
        {
            if (holiday.month == this.month)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static Double avgDate(ArrayList<Holiday> holidays)
    {
        int total = 0;
        int length = holidays.size();
        for(int i = 0; i<length; i++)
        {
            total += holidays.get(i).day;
        }

        return Double.valueOf(total/length);
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Holiday indDay = new Holiday("Independence Day", 4, "July");
        Holiday chrDay = new Holiday("Christmas", 25, "December");

        if (indDay.isSameMonth(chrDay))
        {
            System.out.println("Same month!");
        }
        else
        {
            System.out.println("Different month!");
        }

        ArrayList<Holiday> holidays = new ArrayList<Holiday>[indDay, chrDay];

        System.out.println("Average Date is " + avgDate(holidays));
    }
}