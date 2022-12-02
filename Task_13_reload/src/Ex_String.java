import java.util.Scanner;
// 5
public class Ex_String
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String value;
        value = scan.nextLine();
        System.out.println("Позиция подстроки: " + value.indexOf("I like Java!!!"));
        System.out.println("Строка, которую ввел пользователь: " + value);
        System.out.println("Строка в верхнем регистре: " + value.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + value.toLowerCase());
        if (value.contains("Java"))
        {
            System.out.println("Строка, которую ввел пользователь, содержит Java");
        }
        else
        {
            System.out.println("Строка, которую ввел пользователь, не содержит Java");
        }
        if (value.contains("Java"))
        {
            int position = value.indexOf("Java");
            System.out.println("Новая строка: " + value.substring(0, position) + value.substring(position + 4));
        }
        else
        {
            System.out.println("Строка, которую ввел пользователь, не прошла отбор");
        }
        if (value.endsWith("!!!"))
        {
            System.out.println("Строка, которую ввел пользователь, заканчивается на !!!");
        }
        else
        {
            System.out.println("Строка, которую ввел пользователь, не заканчивается на !!!");
        }
        System.out.println("Последний символ: " + value.charAt(value.length() - 1));
        System.out.println("Получившаяся строка: " + value.replace('a', 'o'));
        if (value.startsWith("!!!"))
        {
            System.out.println("Строка, которую ввел пользователь, начинается с !!!");
        }
        else
        {
            System.out.println("Строка, которую ввел пользователь, не начинается с !!!");
        }
    }
}
