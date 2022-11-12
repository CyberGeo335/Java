import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTest
{
    public static void main(String[] args)
    {
        Date now = new Date();
        System.out.println("toString(): " + now);
        // dow mon dd hh:mm:ss zzz yyyy
        /* SimpleDateFormat может использоваться для
        управления форматом отображения даты/времени:
         E (день недели): 3E or fewer (в текстовом формате
        xxx), >3E (в полном текстовом формате)
        M (месяц): M (in number), MM ( в числовом виде,
        впереди ноль)
        3M: (в текстовом формате xxx), >3M: (в полном
        текстовом формате)*/
        // h (часы): h, hh (with leading zero)
        // m (минуты)
        // s (секунды)
        // a (AM/PM)
        // H (часы 0 до 23)
        // z (временная зона)
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1: " + dateFormatter.format(now));
        dateFormatter = new SimpleDateFormat("E, yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2: " + dateFormatter.format(now));
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3: " + dateFormatter.format(now));
    }
}
