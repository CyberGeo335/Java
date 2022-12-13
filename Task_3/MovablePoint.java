public class MovablePoint
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint()
    {

    }
    public MovablePoint(int X, int Y, int Xspeed, int Yspeed)
    {
        this.x=X;
        this.y=Y;
        this.xSpeed=Xspeed;
        this.ySpeed=Yspeed;
    }
    public String toString()
    {
        return "x:"+this.x+", y:"+y+", xSpeed:"+xSpeed+", ySpeed"+ySpeed;
    }
    public void moveRight()
    {
        x=x+xSpeed;
    }
    public void moveLeft()
    {
        x=x-xSpeed;
    }
    public void moveUp()
    {
        y=y+ySpeed;
    }
    public void moveDown()
    {
        y=y-ySpeed;
    }
}
