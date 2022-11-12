import java.util.Random;

public class Circle extends Shape
{
    private int axisFirst, axisSecond;

    public Circle()
    {
        super();
        Random rand = new Random();
        axisFirst = rand.nextInt(50) + 10;
        axisSecond = rand.nextInt(50) + 10;
    }

    public int getAxisFirst()
    {
        return axisFirst;
    }

    public int getAxisSecond()
    {
        return axisSecond;
    }
}
