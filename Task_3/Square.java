public class Square extends Rectangle
{
    protected double Side;
    public Square()
    {

    }
    public Square(double side)
    {
        this.Side=side;
        this.Width=this.Length=side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.Length=side;
        this.Color=color;
        this.Filled=filled;
        this.Width=this.Length=side;
    }
    public double getSide()
    {
        return Side;
    }
    public void setSide(double side)
    {
        this.Side=side;
    }

    @Override
    public void setWidth(double side)
    {
        this.Width=side;
    }

    @Override
    public void setLength(double side)
    {
        this.Length=side;
    }

    @Override
    public String toString()
    {
        return "Color: "+ this.Color+", isFilled: "+this.Filled+", Side:"+this.Side;
    }
}
