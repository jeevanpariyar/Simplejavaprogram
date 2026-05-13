import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class helloworld {
    public static void main(String[] args) {
        // Create date for April 26, 2026
        LocalDate date = LocalDate.of(2026, 1, 26);
        
        // Print information about January 26 2050
        System.out.println("=== Information about this month January 26, 2050 ===");
        System.out.println("Date: " + date);
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Year: " + date.getYear());
        System.out.println("Formatted Date: " + date.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
        System.out.println("Day of Year: " + date.getDayOfYear());
    }
}
