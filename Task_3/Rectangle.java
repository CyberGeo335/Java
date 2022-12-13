public class Rectangle extends Shape
{
    protected double Width;
    protected double Length;
    public Rectangle()
    {

    }
    public Rectangle(double width, double length)
    {
        this.Width=width;
        this.Length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.Width=width;
        this.Length=length;
        this.Color=color;
        this.Filled=filled;
    }

    public double getWidth()
    {
        return Width;
    }

    public void setWidth(double width)
    {
        this.Width = width;
    }

    public double getLength()
    {
        return Length;
    }

    public void setLength(double length)
    {
        this.Length = length;
    }

    @Override
    public double getArea()
    {
        return Width*Length;
    }

    @Override
    public double getPerimeter()
    {
        return (Width+Length)*2;
    }

    @Override
    public String toString()
    {
        return "Color: "+ this.Color+", isFilled: "+this.Filled+", Width:"+this.Width+", Length:"+this.Length+", Area:"+this.getArea()+", Perimeter:"+this.getPerimeter();
    }
}
