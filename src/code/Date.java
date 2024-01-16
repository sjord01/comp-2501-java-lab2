public class Date {
    private final int year;
    private final String month;
    private final int day;

    public Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDate() {
        return month + " " + day + ", " + year;
    }
}