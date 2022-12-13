import java.lang.*;
public class BallTest
{
    public static void main(String[] args)
    {
        Ball b1=new Ball(15,"Green");
        Ball b2=new Ball("Red");
        Ball b3=new Ball(15);
        Ball b4=new Ball();
        b2.setAge(5);
        b4.setColor("Pink");
        System.out.println(b3);
        b1.DethYearBall();
        b2.DethYearBall();
        b3.DethYearBall();
        b4.DethYearBall();
    }
}
