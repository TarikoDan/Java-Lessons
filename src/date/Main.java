package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = new GregorianCalendar(2000, 11, 4);
        Date birthDay = calendar.getTime();
        System.out.println(birthDay);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        System.out.println(dateFormat.format(birthDay));
        System.out.println(dayFormat.format(birthDay));

        System.out.println("Enter your Birthday in YYYY/MM/DD format: ");
        String yourDay = new Scanner(System.in).nextLine();
        System.out.println("String from Console: " + yourDay);
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date parseDate = formater.parse(yourDay);
            System.out.println(parseDate);
            System.out.println("Formated Date: " + dateFormat.format(parseDate));
            System.out.println(dayFormat.format(parseDate) + " - is the day of your birth");
        } catch (ParseException e) {
            System.out.println("Bad Date format");
            e.printStackTrace();
        }
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Please enter your date of birth(MM/dd): ");
//        String stringdate = scan.next();

        int mm = Integer.parseInt(yourDay.split("/") [1]);
        int dd = Integer.parseInt(yourDay.split("/") [2]);

        YourSign yourSign = new YourSign();
        ZodiacSigns sign = yourSign.getSign(mm, dd);
        System.out.println("Your Zodiac sign is: " + sign);

        /* ****************************************************** */

        LocalDate now = LocalDate.now();
        LocalDate date01 = LocalDate.of(2000, 1, 1);
        System.out.println(date01);
        System.out.println(date01.getDayOfWeek());
        LocalDate parse = LocalDate.parse("2015-01-01");
        System.out.println(parse);
        LocalDate parse1 = LocalDate.parse("2015/01/01", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(parse1);

    }

}
