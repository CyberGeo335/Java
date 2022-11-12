public class Main
{
    public static void main(String[] args)
    {
        System.out.println(RPN_Calculator.ExpressionToRPN("2+2*2"));
        System.out.println(RPN_Calculator.RPNtoAnswer(RPN_Calculator.ExpressionToRPN("2+2*2")));
    }
}