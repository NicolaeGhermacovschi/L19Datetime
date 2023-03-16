import java.time.*;

public class Date {
    public Date() {
    }
    public LocalDate method1(){
        LocalDate dateTime = LocalDate.of(2024, Month.JANUARY,2);
        return dateTime;
    }

    public LocalTime method2(){
        LocalTime timeHours = LocalTime.of(13,20);
        return timeHours;
    }
    public LocalDateTime method3(){
       LocalDateTime ld = LocalDateTime.of(method1(), method2());
        return ld;
    }
    public ZonedDateTime method4(){
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime zd = ZonedDateTime.of(method3(), zone );
        return zd;
    }
    public LocalDateTime method5(){
        LocalDate date = method1();
        LocalTime time = method2();
        time = time.plusMinutes(1);
        time = time.plusHours(1);
        date = date.plusDays(1);
        date = date.plusYears(1);

        LocalDateTime dateTime1 = LocalDateTime.of(date, time);


        return dateTime1;

    }



}
