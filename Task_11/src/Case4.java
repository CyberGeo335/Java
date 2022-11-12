import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Case4
{


    public static void main(String [] args) throws ParseException
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите дату (в таком формате 05-09-2018 13:01): ");
        String stringDate = scan.nextLine();
        Date personDate = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(stringDate);
        System.out.print(personDate);


    }
}
