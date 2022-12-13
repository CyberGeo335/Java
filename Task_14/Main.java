import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {

        // TASK 2
        /*
        Написать регулярное выражение, определяющее является ли данная
        строка строкой "abcdefghijklmnopqrstuv18340" или нет.

         */
        Scanner sc2 = new Scanner(System.in);
        String word2 = sc2.nextLine();
        String regex2="^abcdefghijklmnopqrstuv18340$";
        Pattern patern2=Pattern.compile(regex2);
        Matcher matcher2=patern2.matcher(word2);
        if (matcher2.find())
        {
            System.out.println(word2.substring(matcher2.start(), matcher2.end()));
        }
        else
        {
            System.out.println("no matches found");
        }
        // TASK 3
        /*
        Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
        a) пример правильных выражений: 25.98 USD.
        b) пример неправильных выражений: 44 ERR, 0.004 EU.
         */
        Scanner sc3 = new Scanner(System.in);
        String word3 = sc3.nextLine();
        String regex3="((\\d{1,}\\.\\d{2})|\\d{1,}){1}\\s{1}(USD|RUB|EU){1}";
        Pattern patern3=Pattern.compile(regex3);
        Matcher matcher3=patern3.matcher(word3);
        boolean is=false;
        while (matcher3.find())
        {
            System.out.println(word3.substring(matcher3.start(), matcher3.end()));
            is=true;
        }
        if(!is)
        {
            System.out.println("no matches found");
        }
        //TASK 4
        /*
        Дан текст, необходимо проверить есть ли в тексте цифры, за
        которыми не стоит знак «+».
        a) пример правильных выражений:(1 + 8) – 9 / 4
        b) пример неправильных выражений: 6 / 5 – 2 * 9
         */
        Scanner sc4 = new Scanner(System.in);
        String word4 = sc4.nextLine();
        String regex4="\\d{1,}\\+";
        Pattern patern4=Pattern.compile(regex4);
        Matcher matcher4=patern4.matcher(word4);
        is=false;
        while (matcher4.find())
        {
            System.out.println(word4.substring(matcher4.start(), matcher4.end()));
            is=true;
        }
        if(!is)
        {
            System.out.println("no matches found");
        }
        // TASK 6
        /*
        Написать регулярное выражение, определяющее является ли данная
        строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999
        года.
        a) пример правильных выражений: 29/02/2000, 30/04/2003,
        01/01/2003.
        b) пример неправильных выражений: 29/02/2001, 30-04-2003,
        1/1/1899.
         */
        Scanner sc6 = new Scanner(System.in);
        String word6 = sc6.nextLine();
        String regex6="^[\\S]{1,}\\@{1}([A-Za-z]{1,}\\.{1}[A-Za-z]{1,}|localhost)$";
        Pattern patern6=Pattern.compile(regex6);
        Matcher matcher6=patern6.matcher(word6);
        is=false;
        while (matcher6.find())
        {
            System.out.println(word6.substring(matcher6.start(), matcher6.end()));
            is=true;
        }
        if(!is)
        {
            System.out.println("no matches found");
        }
        //task 7
        Scanner sc7 = new Scanner(System.in);
        String word7 = sc7.nextLine();
        String regex7="^[A-Z]{1,}?([a-z]{1,}?([0-9]{1,}?([A-Za-z0-9\\_]{5,}))|[0-9]{1,}([a-z]{1,}?([A-Za-z0-9\\_]{5,})))|[a-z]{1,}?([A-Z]{1,}?([0-9]{1,}?([A-Za-z0-9\\_]{5,}))[0-9]{1,}?([A-Z]{1,}?([A-Za-z0-9\\_]{5,})))|[0-9]{1,}?([A-Z]{1,}?([a-z]{1,}?([A-Za-z0-9\\_]{5,}))[a-z]{1,}?([A-Z]{1,}?([A-Za-z0-9\\_]{5,})))$";
        Pattern patern7=Pattern.compile(regex7);
        Matcher matcher7=patern7.matcher(word7);
        is=false;
        while (matcher7.find())
        {
            System.out.println(word7.substring(matcher7.start(), matcher7.end()));
            is=true;
        }
        if(!is)
        {
            System.out.println("no matches found");
        }
    }
}
/*
^[A-Z]{1,}?
(
    [a-z]{1,}?
    (
        [0-9]{1,}?
        (
            [A-Za-z0-9\_]{5,}
        )
    )
    |[0-9]{1,}?
    (
        [a-z]{1,}?
        (
            [A-Za-z0-9\_]{5,}
        )
    )
)
|[a-z]{1,}?
(
    [A-Z]{1,}?
    (
        [0-9]{1,}?
        (
            [A-Za-z0-9\_]{5,}
        )
    )
    [0-9]{1,}?
    (
        [A-Z]{1,)?
        (
            [A-Za-z0-9\_]{5,}
        )
    )
)
|[0-9]{1,}?
(
    [A-Z]{1,}?
    (
        [a-z]{1,}?
        (
            [A-Za-z0-9\_]{5,}
        )
    )
    [a-z]{1,}?
    (
        [A-Z]{1,)?
        (
            [A-Za-z0-9\_]{5,}
        )
    )
)$
 */