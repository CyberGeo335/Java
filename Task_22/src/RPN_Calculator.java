import java.util.Stack;

public class RPN_Calculator
{
    public static String ExpressionToRPN(String Expression)
    {
        String current = "";
        Stack<Character> stack = new Stack<>();

        int priority;
        for(int i = 0; i < Expression.length(); i++)
        {
            priority = GetPriority(Expression.charAt(i));
            if (priority == 0)
            {
                current += Expression.charAt(i);
            }
            if (priority == 1)
            {
                stack.push(Expression.charAt(i));
            }
            if (priority > 1)
            {
                current += ' ';
                while (!stack.empty())
                {
                    if(GetPriority(stack.peek()) >= priority)
                    {
                        current += stack.pop();
                    }
                    else
                    {
                        break;
                    }
                }
                stack.push(Expression.charAt(i));
            }
            if (priority == -1)
            {
                current += ' ';
                while (GetPriority(stack.peek()) != 1)
                {
                    current += stack.pop();
                }
                stack.pop();
            }
        }
        while (!stack.empty())
        {
            current += stack.pop();
        }
        return current;
    }

    public static double RPNtoAnswer(String rpn)
    {
        String operand = new String();
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < rpn.length(); i++)
        {
            if (GetPriority(rpn.charAt(i)) == ' ')
            {
                continue;
            }
            if (GetPriority(rpn.charAt(i)) == 0)
            {
                while (rpn.charAt(i) != ' ' && GetPriority(rpn.charAt(i)) == 0)
                {
                    operand+=rpn.charAt(i++);
                }
                if (i == rpn.length())
                {
                    break;
                }
                stack.push(Double.parseDouble(operand));
                operand = new String();
            }
             if(GetPriority(rpn.charAt(i)) > 1)
             {
                 double a = stack.pop();
                 double b = stack.pop();
                 if (rpn.charAt(i) == '+')
                 {
                     stack.push(b + a);
                 }
                 if (rpn.charAt(i) == '-')
                 {
                     stack.push(b + a);
                 }
                 if (rpn.charAt(i) == '*')
                 {
                     stack.push(b * a);
                 }
                 if (rpn.charAt(i) == '/')
                 {
                     stack.push(b / a);
                 }
             }
        }
        return stack.pop();
    }
    private static int GetPriority(char token)
    {
        if (token == '*' || token == '/')
        {
            return 3;
        }
        else if (token == '+' || token == '-')
        {
            return 2;
        }
        else if (token == '(')
        {
            return 1;
        }
        else if (token == ')')
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
