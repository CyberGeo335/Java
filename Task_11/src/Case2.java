import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.lang.String;

/*
ТЗ:
Приложение, сравнивающее текущую дату и дату, введенную
пользователем c текущим системным временем
 */

public class Case2
{
    public static void main(String[] args)
    {
        Date Time = new Date();
        SimpleDateFormat DateFormate = new SimpleDateFormat("E, dd.MM.yyyy");
        System.out.println("Системное время:");
        System.out.println(DateFormate.format(Time));

        String CurrentTime = DateFormate.format(Time);

        Scanner sc = new Scanner(System.in);
        System.out.println("dayofmonth:");
        int dayofmonth = sc.nextInt();
        System.out.println("month:");
        int month = sc.nextInt();
        System.out.println("year:");
        int year = sc.nextInt();

        Calendar EnterTime = Calendar.getInstance();

        EnterTime.set(EnterTime.DAY_OF_MONTH, dayofmonth);
        EnterTime.set(EnterTime.MONTH, month-1);
        EnterTime.set(EnterTime.YEAR, year);
        System.out.println("Ваше время: ");
        System.out.println( DateFormate.format(EnterTime.getTime()));
        String StrEnterTime = DateFormate.format(EnterTime.getTime());

        if (CurrentTime.equals(StrEnterTime))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Faulse");
        }
    }
}
