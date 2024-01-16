/**
 * Records the year, month, and day when a student was born; date of birth
 *
 * @author vindy, marius, sam ordonez
 * @version 1.0
 */

public class Date
{
    private final int year;
    private final int month;
    private final int day;

    /**
     * @param year the year a student was born
     * @param month the month a student was born
     * @param day the day a student was born
     */
    public Date(final int year,
                final int month,
                final int day)
    {
        this.year   = year;
        this.month  = month;
        this.day    = day;
    }

    /**
     * Get the year, month, and day of birth of a student
     * @return the year, month, and day of birth of a student in YYYY-MM-DD format
     */
    public String getYyMmDd()
    {
        return year + "-" + month + "-" + day;
    }

    //Accessors

    /**
     * Get the year of birth of a student
     * @return the year of birth of a student
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Access the month of birth of a student
     * @return the month of birth of a student
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Access the day of birth of a student
     * @return the day of birth of a student
     */
    public int getDay()
    {
        return day;
    }
}