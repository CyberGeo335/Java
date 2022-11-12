import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Case3
{
    Date date;
    String name;
    Case3(String name, Date date)
    {
        this.name = name;
        this.date = date;
    }

    public String toString(int choice)
    {
        String[] patterns = {	"yyyy.MM.dd",
                "dd.MM.yy GGG",
                "EEE, d MMM yyyy"
        };
        return "Имя студента: " + name + "\nДата рождения: " + new SimpleDateFormat(patterns[choice - 1]).format(date);
    }


    public static void main(String [] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = scan.next();
        System.out.print("Введите дату (в таком формате 2017-9-11 (год, месяц, день)): ");
        String stringDate = scan.next();
        Date personDate = new SimpleDateFormat("y-M-d").parse(stringDate);
        System.out.println(personDate);
        Case3 ans = new Case3(name, personDate);
        System.out.println("1) год (4 знака).месяц (2 знака).день (2 знака)");
        System.out.println("2) день (2 знака), месяц (2 знака), год (2 знака)");
        System.out.println("3) сокр. день недели, день, месяц (название), год (4 знака)");
        System.out.println("Введите цифру формата: ");
        int choice = scan.nextInt();
        System.out.print(ans.toString(choice));


    }
}