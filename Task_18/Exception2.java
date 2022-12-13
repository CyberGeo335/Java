import java.util.Scanner;

public class Exception2
{
    public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        /*catch (Exception ignored){
            System.out.println("Mistake");
            //При добавлении общего catch Exception, остальные catch не нужны и они не будут никогда отрабатывать
        }*/
        catch ( NumberFormatException ignored) {
            System.out.println("It's not integer");
        }
        catch (ArithmeticException ignored) {
            System.out.println("Attempted division by zero");
        }
        finally {
            System.out.println("Finally");
            //При добавлении блока finally, он всегда будет отрабатываться: будет и при исключении, и без них.
        }
    }

    public static void main(String [] args){
        Exception2 a = new Exception2();
        a.exceptionDemo();
    }
}
