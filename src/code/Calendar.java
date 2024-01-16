import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Calendar {
    private ArrayList<Integer> years;
    private String[] months;
    private ArrayList<Integer> days;
    private HashMap<Integer, Date> dates;

    public Calendar() {
        years = new ArrayList<>();
        for (int i = 1910; i <= 2025; i++) {
            years.add(i);
        }

        months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        days = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            days.add(i);
        }

        dates = new HashMap<>();
        int key = 1;
        for (int year : years) {
            for (String month : months) {
                Iterator<Integer> iterator = days.iterator();
                while (iterator.hasNext()) {
                    int day = iterator.next();
                    Date date = new Date(year, month, day);
                    dates.put(key, date);
                    key++;
                }
            }
        }
    }

    public void printCalendar() {
        for (int key : dates.keySet()) {
            Date date = dates.get(key);
            System.out.println(key + ": " + date.getDate());
        }
    }
}