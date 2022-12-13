public class Ball
{
    private int age;
    private String color;

    public Ball( int a, String g)
    {
        age=a;
        color=g;
    }
    public Ball(int a)
    {
        age=a;
        color="grey";
    }
    public Ball(String g)
    {
        age=0;
        color=g;
    }
    public Ball()
    {
        age=0;
        color="Grey";
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getColor(String color)
    {
        return color;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return this.color+", age "+this.age;
    }
    public void DethYearBall()
    {
        System.out.println("This ball will death in "+age*8+" years");
    }
}
