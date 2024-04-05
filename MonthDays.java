import java.time.Month;

public class MonthDays {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            int daysInMonth = month.length(false); // false indicates non-leap year
            System.out.println(month + ": " + daysInMonth + " days");
        }
    }
}
