public class MovableCircle extends MovablePoint
{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int X, int Y, int Xspeed, int Yspeed, int Radius)
    {
        this.center = new MovablePoint(X,Y,Xspeed,Yspeed);
        this.radius=Radius;
    }
    public String toString()
    {
        return "center:"+this.center;
    }

    @Override
    public void moveUp()
    {
        center= new MovablePoint(center.x, center.y+center.ySpeed,center.xSpeed, center.ySpeed);
    }

    @Override
    public void moveDown()
    {
        center=new MovablePoint(center.x, center.y-center.ySpeed,center.xSpeed, center.ySpeed);
    }

    @Override
    public void moveLeft()
    {
        center=new MovablePoint(center.x-center.xSpeed, center.y,center.xSpeed, center.ySpeed);
    }

    @Override
    public void moveRight()
    {
        center=new MovablePoint(center.x+center.xSpeed, center.y,center.xSpeed, center.ySpeed);
    }
}
