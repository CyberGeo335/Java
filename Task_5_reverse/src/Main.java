import java.util.Scanner;

// 10: разворот числа
// 11:
// 12: Вывести нечетные числа последовательности
// 13: Вывести члены последовательности с нечетными номерами
// 14: Цифры числа слева направо
// 15: Цифры числа справа налево
public class Main
{
    public static int Reverse(int n, int i)
    {
        if (n == 0)
        {
            return i;
        }
        else
        {
            return Reverse(n / 10, i * 10 + n % 10);
        }
    }
    public static String  FromLeftToRight(int q) {
        if (q < 10)
        {
            return Integer.toString(q);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return FromLeftToRight(q / 10) + " " + q % 10;
        }
    }
    public static int  FromRightToLeft(int z) {
        if (z < 10)
        {
            return z;
        }// Шаг рекурсии / рекурсивное условие
        else {
            System.out.print(z % 10 + " ");
            return FromRightToLeft(z / 10);
        }
    }
    public static void Progression12()
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if (v > 0) {
            if (v % 2 == 1)
            {
                System.out.println(v);
                Progression12();
            }
            else
            {
                Progression12();
            }
        }
    }
    public static void Recursion13()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Базовый случай
        if (x > 0)
        {
            int m = sc.nextInt();
            System.out.println(x);
            if (m > 0) {

                Recursion13();
            }
        }
    }
    public static int NumOfOnes()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1)
        {
            int m = sc.nextInt();
            if (m == 1)
            {
                return (NumOfOnes() + n + m);
            } else {
                int k = sc.nextInt();
                // Базовый случай
                if (k == 1) {
                    // Шаг рекурсии / рекурсивное условие
                    return (NumOfOnes() + n + m + k);
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = sc.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return NumOfOnes() + n + m;
            } else {
                return n + m;
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Вариант 10:");
     //   System.out.println(Reverse(158, 0));
        System.out.println("Вариант 11:");
        //System.out.println(NumOfOnes());
        System.out.println("Вариант 12:");
       // Progression12();
        System.out.println("Вариант 13:");
       // Recursion13();
        System.out.println("Вариант 14:");
        System.out.println(FromLeftToRight(153));
        System.out.println("Вариант 15:");
        System.out.println(FromRightToLeft(153));


    }
}