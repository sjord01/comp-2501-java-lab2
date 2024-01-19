/**
 * A Calendar program that contains and prints out
 * months, days, and years from 1910 to 2025;
 * assumption is that each month will have 30 days
 *
 * @author vandy, marius, sam ordonez
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Calendar
{
    private final ArrayList<Integer>      years;
    private final String[]                months;
    private final ArrayList<Integer>      days;
    private final Map<Integer, Date>      dates;

    /**
     * The method creates a Date object for every date from January 1, 1910 to December 30, 2025;
     * Assumption is that each month has 30 days
     * Each Date object is stored in a HashMap 'dates' instance variable
     * January 1, 1910 has key 1, January 2, 1910 has key 2..., all the way up to December 30, 2025 which has key 41760
     *
     */
    public Calendar()
    {
        years = new ArrayList<>();                  //Array (1910 -2025)
        for (int i = 1910; i <= 2025; i++)
        {
            years.add(i);
        }

        months = new String[]{  "January", "February", "March",
                                "April", "May", "June", "July",
                                "August", "September", "October",
                                "November", "December"};     // months - string list

        days = new ArrayList<>();           // key Int, v -> Date
        for (int i = 1; i <= 30; i++)                   //years 1-30 int
        {
            days.add(i);
        }

        dates = new HashMap<>();
        int key = 1;                                    //the key, 1 - 41760 in this example

        for (int year : years)                          //years, 1910 - 2025 in this example
        {
            for (String month : months)                 //months, January - December in this example
            {
                final Iterator<Integer> it;
                it = days.iterator();                   //days, 1 - 30 in this example

                while (it.hasNext())                    //does the 'days' Arraylist, contain a next key?
                {
                    int day = it.next();                        //1 will be 2.. and so on           //day 2
                    Date date = new Date(year, month, day);     //create a new Object expression of Date        //January 1, 1910
                    dates.put(key, date);                       //add keys and value to the 'dates' Hashmap
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