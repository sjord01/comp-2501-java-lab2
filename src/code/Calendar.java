/**
 * A Calendar program that contains and prints out
 * months, days, and years from 1910 to 2025;
 * assumption is that each month will have 30 days
 *
 * @author vindy, marius, sam ordonez
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Calendar {
    private final ArrayList<Integer>      years;
    private final String[]                months;
    private final ArrayList<Integer>      days;
    private final HashMap<Integer, Date>  dates;

    /**
     * The method creates a Date object for every date from January 1, 1910 to December 30, 2025;
     * Assumption is that each month has 30 days
     * Each Date object is stored in a HashMap 'dates' instance variable
     * January 1 1910 has key 1, January 2 1910 has key 2..., all the way up to December 30 2025 which has key 41760
     *
     */
    public Calendar()
    {
        years = new ArrayList<>();
        for (int i = 1910; i <= 2025; i++)
        {
            years.add(i);
        }

        months = new String[]{  "January", "February", "March",
                                "April", "May", "June", "July",
                                "August", "September", "October",
                                "November", "December"};

        days = new ArrayList<>();
        for (int i = 1; i <= 30; i++)
        {
            days.add(i);
        }

        dates = new HashMap<>();
        int key = 1;

        for (int year : years)
        {
            for (String month : months)
            {
                final Iterator<Integer> it;
                it = days.iterator();

                while (it.hasNext())
                {
                    int day = it.next();
                    Date date = new Date(year, month, day);
                    dates.put(key, date);
                    key++;
                }
            }
        }
    }

    /**
     * Prints out dates from January 1, 1910 to December 30, 2025;
     * Assumption is that each month has 30 days
     */
    public void printCalendar()
    {
        for (int key : dates.keySet())
        {
            Date date = dates.get(key);
            System.out.println(key + ": " + date.getDate());
        }
    }
}