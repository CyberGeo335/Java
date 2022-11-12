import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphicCalculator extends JFrame implements ActionListener {
    static JFrame frame;
    static JTextField result;
    static String a ="", b = "", operation = "";
    public static void main(String[] args)
    {
        GraphicCalculator listen = new GraphicCalculator();

        frame = new JFrame("電卓");

        result =new JTextField(16);
        result.setEditable(false);

        ArrayList<JButton> ButtonNum = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            JButton jTmpButton = new JButton(Integer.toString(i));
            jTmpButton.addActionListener(listen);
            ButtonNum.add(jTmpButton);
        }

        List<String> operations = Arrays.asList("+", "-", "/", "*", "c", "=");

        JPanel ButtonOperations = new JPanel();

        ButtonNum.forEach(ButtonOperations::add);
        operations.forEach(it ->
        {
            JButton jTmpButton = new JButton(it);
            jTmpButton.addActionListener(listen);
            ButtonOperations.add(jTmpButton);
        });

        GridLayout NumsAndOperations = new GridLayout(4, 4);
        ButtonOperations.setLayout(NumsAndOperations);

        JPanel mainPanel = new JPanel();
        mainPanel.add(result);
        mainPanel.add(ButtonOperations);

        frame.add(mainPanel);
        frame.setSize(1080, 720);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e.getActionCommand());

        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
        {
            if(operation.equals(""))
            {
                a = a + s;
            }
            else
            {
                b = b + s;
            }
            result.setText(a + operation + b);
        }
        else if (s.charAt(0) == 'c')
        {
            a = operation = b = "";
            result.setText(a + operation + b);
        }
        else if (s.charAt(0) == '=')
        {
            int res = switch (operation)
                    {
                        case "+" -> Integer.parseInt(a) + Integer.parseInt(b);
                        case "-" -> Integer.parseInt(a) - Integer.parseInt(b);
                        case "/" -> Integer.parseInt(a) / Integer.parseInt(b);
                        default -> Integer.parseInt(a) * Integer.parseInt(b);
                    };
                    a = String.valueOf(res);
                    result.setText(a);
                    operation = b = "";
        }
        else
        {
            if(operation.equals(""))
            {
                operation = s;
            }
            result.setText(a + operation + b);
        }
    }
}
