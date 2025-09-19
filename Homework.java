import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Homework {
    public static void main(String[] args) {



        Date now = new Date();
        System.out.println("Текущая дата и время: " + now);

        // Дата 1 января 2000 года (миллисекунды от 1970)
        Date y2000 = new Date(946684800000L);
        System.out.println("Дата 1 января 2000 года: " + y2000);



        Calendar cal = Calendar.getInstance();
        System.out.println("Год: " + cal.get(Calendar.YEAR));
        System.out.println("Месяц: " + (cal.get(Calendar.MONTH) + 1)); 
        System.out.println("День месяца: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("День недели: " + cal.get(Calendar.DAY_OF_WEEK));


        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Дата +10 дней: " + cal.getTime());


        Calendar birthday = Calendar.getInstance();
        birthday.set(2010, Calendar.AUGUST, 15); // пример: 15 августа 2010
        System.out.println("День недели моего дня рождения: " + birthday.get(Calendar.DAY_OF_WEEK));



        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата (LocalDate): " + today);


        System.out.println("Номер дня в году: " + today.getDayOfYear());


        LocalDate plus100 = today.plusDays(100);
        System.out.println("Дата через 100 дней: " + plus100);
        System.out.println("День недели через 100 дней: " + plus100.getDayOfWeek());


        LocalDate end2025 = LocalDate.of(2025, 12, 31);
        System.out.println("31 декабря 2025 года: " + end2025);
        System.out.println("День недели: " + end2025.getDayOfWeek());
        System.out.println("Номер дня в году: " + end2025.getDayOfYear());
    }
}