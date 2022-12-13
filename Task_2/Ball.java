import java.lang.*;
public class Ball
{
    private double x=0.0;
    private double y=0.0;
    public Ball(double a, double b)
    {
        x=a;
        y=b;
    }
    public Ball()
    {

    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setX(double a)
    {
        this.x=a;
    }
    public void setY(double b)
    {
        this.y=b;
    }
    public void setXY(double a, double b)
    {
        this.x=a;
        this.y=b;
    }
    public void move(double xDisp, double yDisp)
    {
        x+=xDisp;
        y+=yDisp;
    }
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }

}
