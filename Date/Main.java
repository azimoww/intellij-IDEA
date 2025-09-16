package Date;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Текущая дата и время: " + date);


        long msec = date.getTime();
        System.out.println("Миллисекунды с 01.01.1970: " + msec);


        String[] months = {
                "Yanvar", "Fevral", "Mart", "Aprel",
                "May", "Iyun", "Iyul", "Avqust",
                "Sentyabr", "Oktyabr", "Noyabr", "Dekabr"
        };

        Calendar calendar = Calendar.getInstance();


        int current_date = calendar.get(Calendar.DATE);
        int current_month = calendar.get(Calendar.MONTH);
        int current_year = calendar.get(Calendar.YEAR);


        System.out.println("Date: " + current_date + " " + months[current_month] + " " + current_year);


        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] weekDays = {
                "Bazar", "Bazar ertəsi", "Çərşənbə axşamı",
                "Çərşənbə", "Cümə axşamı", "Cümə", "Şənbə"
        };
        System.out.println("Day of week: " + weekDays[dayOfWeek - 1]);
    }
}