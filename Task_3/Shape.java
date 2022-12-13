abstract public class Shape
{
    protected String Color;
    protected boolean Filled;
    public void Shape()
    {

    }
    public void Shape(String color, boolean filled)
    {
        this.Filled=filled;
        this.Color=color;
    }
    public String getColor()
    {
        return Color;
    }
    public void setColor(String color)
    {
        this.Color=color;
    }
    public boolean isFilled()
    {
        return Filled;
    }
    public void setFilled(boolean filled)
    {
        this.Filled=filled;
    }
    public double getArea()
    {
        return 0;
    }
    public double getPerimeter()
    {
        return 0;
    }
    public String toString()
    {
        return "Color: "+ this.Color+", isFilled: "+Filled;
    }

}
