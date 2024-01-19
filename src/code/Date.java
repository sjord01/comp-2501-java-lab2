/**
 * A Date program that tells the month, day, and year of a specific date
 *
 * @author vandy, marius, sam ordonez
 * @version 1.0
 */
public class Date
{
    private final int       year;
    private final String    month;
    private final int       day;

    /**
     * @param year      The year of a specific date in YYYY format
     * @param month     The month of a specific date in String format (e.g. "January", "February",...)
     * @param day       The day of a specific date in D or DD format
     */
    public Date(final int       year,
                final String    month,
                final int       day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Accessors

    /**
     * Access the specific month-day-year combination of a specific date
     * @return  the specific month-day-year combination of a specific date
     *          where the format is month(String), day(int), and year (int)
     *          e.g. January 1, 1910
     */
    public String getDate()
    {
        return month + " " + day + ", " + year;
    }


    /**
     * Access the year of a specific date in YYYY format
     * @return the year of a specific date in YYYY format
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Access the month of a specific date in String format
     * @return the month of a specific date in String format
     */
    public String getMonth()
    {
        return month;
    }

    /**
     * Access the day of a specific date in D or DD (int) format
     * @return the day of a specific date in D or DD (int) format
     */
    public int getDay()
    {
        return day;
    }
}