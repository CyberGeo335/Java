import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
ТЗ:
Написать программу, выводящую фамилию разработчика, дату и
время получения задания, а также дату и время сдачи задания. Для
получения последней даты и времени использовать класс Date из пакета
java.util.* (Объявление Dated=newDate() или метод
System.currentTimeMillis().
 */

public class Case1
{
    public static void main(String[] args)
    {
        Date StartCase = new Date();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя разработчика: ");
        String developerName = sc.nextLine();
        SimpleDateFormat DateFormate = new SimpleDateFormat("E, dd.MM.yyyy 'в' hh:mm:ss a zzz");
        System.out.println("Разработчик " + developerName + " получил задание в " + DateFormate.format(StartCase));

        Calendar DeadLine = Calendar.getInstance();
        int year = 2023;
        DeadLine.set(DeadLine.YEAR, 2023);
        DeadLine.set(DeadLine.MONTH, DeadLine.JANUARY);
        DeadLine.set(DeadLine.DAY_OF_MONTH, 15);
        System.out.println("DeadLine работы: " + DateFormate.format(DeadLine.getTime()));
    }
}

