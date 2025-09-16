package Date;
import java.util.Date;

public class MainDate {
    public static <Calendar> void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long msec = date.getTime();

        System.out.println(msec);

        String[] months =
                {"Yanvar", "Fevral", "Mart", "Aprel",
                        "May", "Iyun", "Iyul", "August",
                        "September", "Oktaybr", "Noyabr", "Dekabr"};


        Calendar calendar = Calendar.getInstance();

//        System.out.println("current month: " + months[calendar.get(Calendar.MONTH)]);
//        System.out.println("date: " + calendar.get(Calendar.DATE));
        int current_date = calendar.get(Calendar.DATE);
        String current_month = months[calendar.get(Calendar.MONTH)];

        System.out.println("date: " + " " + current_month + " " + current_date);


    }
}



