// 50 + 25 = 75
public class Ex_Shirt
{
    final private String article, fullName, color, size;

    public Ex_Shirt(String values)
    {
        String[] s = values.split(",");
        article = s[0];
        fullName = s[1];
        color = s[2];
        size = s[3];
    }

    @Override
    public String toString()
    {
        return "Shirt:" +
                "\n\tarticle='" + article +
                "\n\tfullName='" + fullName +
                "\n\tcolor='" + color +
                "\n\tsize='" + size;
    }

    public static void main(String [] args)
    {
        String[] values = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        Ex_Shirt[] ans = new Ex_Shirt[values.length];
        for (int i = 0; i < ans.length; i++)
        {
            ans[i] = new Ex_Shirt(values[i]);
            System.out.println(ans[i]);
        }
    }
}
