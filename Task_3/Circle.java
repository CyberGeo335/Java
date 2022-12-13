import java.math.*;
public class Circle extends Shape
{
    protected double Radius;
    public Circle()
    {

    }
    public Circle(double radius)
    {
        this.Radius=radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.Radius=radius;
        this.Color=color;
        this.Filled=filled;
    }
    public double getRadius()
    {
        return Radius;
    }
    public void setRadius(double radius)
    {
        this.Radius=radius;
    }
    public double getArea()
    {
        return Math.PI*Radius*Radius;
    }
    public double getPerimeter()
    {
        return Math.PI*2*Radius;
    }
    public String toString()
    {
        return "Color: "+ this.Color+", isFilled: "+Filled+", Radius:"+this.Radius+", Area:"+this.getArea()+", Perimeter:"+this.getPerimeter();
    }

}
