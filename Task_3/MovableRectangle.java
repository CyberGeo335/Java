public class MovableRectangle extends MovablePoint
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int X1, int Y1,int X2, int Y2, int Xspeed, int Yspeed)
    {
        this.topLeft=new MovablePoint(X1,Y1,Xspeed,Yspeed);
        this.bottomRight=new MovablePoint(X2,Y2,Xspeed,Yspeed);
    }
    public String toString()
    {
        return "topLeft:"+this.topLeft+", bottomRight:"+this.bottomRight;
    }

    @Override
    public void moveUp()
    {
        this.topLeft=new MovablePoint(topLeft.x, topLeft.y+ topLeft.ySpeed, topLeft.xSpeed, topLeft.ySpeed);
        this.bottomRight=new MovablePoint(bottomRight.x, bottomRight.y+ bottomRight.ySpeed, bottomRight.xSpeed, bottomRight.ySpeed);
    }

    @Override
    public void moveDown()
    {
        this.topLeft=new MovablePoint(topLeft.x, topLeft.y- topLeft.ySpeed, topLeft.xSpeed, topLeft.ySpeed);
        this.bottomRight=new MovablePoint(bottomRight.x, bottomRight.y- bottomRight.ySpeed, bottomRight.xSpeed, bottomRight.ySpeed);
    }

    @Override
    public void moveRight()
    {
        this.topLeft=new MovablePoint(topLeft.x+ topLeft.xSpeed, topLeft.y, topLeft.xSpeed, topLeft.ySpeed);
        this.bottomRight=new MovablePoint(bottomRight.x+ bottomRight.xSpeed, bottomRight.y, bottomRight.xSpeed, bottomRight.ySpeed);
    }

    @Override
    public void moveLeft()
    {
        this.topLeft=new MovablePoint(topLeft.x- topLeft.xSpeed, topLeft.y, topLeft.xSpeed, topLeft.ySpeed);
        this.bottomRight=new MovablePoint(bottomRight.x- bottomRight.xSpeed, bottomRight.y, bottomRight.xSpeed, bottomRight.ySpeed);
    }
}
