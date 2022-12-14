package Exercise3;

public class MVCPatternDemo
{
    public static void main(String [] args)
    {
        Arbuzi m = new Arbuzi();
        ArbuziView v = new ArbuziView();
        ArbuziController c = new ArbuziController(m, v);
        c.initController();
    }
}
