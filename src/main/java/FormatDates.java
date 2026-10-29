import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//04/22/2026
//2026-04-22
//Wednesday, April 22, 2026
//Wednesday, Apr 22, 2026 10:02
public class FormatDates {
    public static void main(String[] args) {

            LocalDateTime today = LocalDateTime.now();


            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = today.format(fmt);
            System.out.println("Today is: " + formattedDate);
             System.out.println(today.format(fmt2));

        System.out.println(today.getDayOfWeek()+", "+today.getMonth()+" "+today.getDayOfMonth()+", "+today.getYear());
        System.out.println(today.getDayOfWeek()+", "+today.getMonth()+" "+today.getDayOfMonth()+", "+today.getYear()+" "+today.getHour()+":"+today.getMinute());
    }
}
