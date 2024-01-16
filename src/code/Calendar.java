import java.util.ArrayList;
import java.util.HashMap;

public class Calendar
{
    private final ArrayList<Integer>        years;
    private final String[]                  months;
    private final ArrayList<Integer>        days;
    private final HashMap<Integer, Date>    dates;

    public Calendar()
    {
        years   = new ArrayList<>();
        months  = new String[]{"January", "February", "March",
                                "April", "May", "June",
                                "July", "August", "September",
                                "October", "November", "December"};
        days    = new ArrayList<>();
        dates   = new HashMap<>();

        // Initialize years ArrayList from 1910 to 2025
        for (int i = 1910; i <= 2025; i++)
        {
            years.add(i);
        }

        // Initialize days ArrayList from 1 to 30
        for (int i = 1; i <= 30; i++)
        {
            days.add(i);
        }

        // Populate the dates HashMap using nested loops
        int key = 1;
        for (int year : years) {
            for (String month : months) {
                for (int day : days) {
                    dates.put(key, new Date(year, getMonthIndex(month) + 1, day));
                    key++;
                }
            }
        }
    }

    private int getMonthIndex(String month) {
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(month)) {
                return i;
            }
        }
        return -1; // Month not found
    }

    public void printCalendar()
    {
        for (int key : dates.keySet()) {
            System.out.println(key + ": " + dates.get(key).getYyMmDd());
        }
    }
}
