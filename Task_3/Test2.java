public class Test2
{
    public static void main(String[] args)
    {
        MovableCircle c1 = new MovableCircle(15,10,5,3,10);
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);
        c1.moveDown();
        System.out.println(c1);
        c1.moveLeft();
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);
        MovableRectangle r1=new MovableRectangle(15,20,14,3,5,6);
        System.out.println(r1);
        r1.moveUp();
        System.out.println(r1);
        r1.moveDown();
        System.out.println(r1);
        r1.moveLeft();
        System.out.println(r1);
        r1.moveRight();
        System.out.println(r1);
    }
}
