import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonPlus = new JButton(" Add them up");
    JButton buttonMinus = new JButton(" Subtract them up");
    JButton buttonMultiplication = new JButton(" Multiply them up");
    JButton buttonDivision = new JButton(" Divide them up");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Calculator(){
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(250,250);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(buttonPlus);
        add(buttonMinus);
        add(buttonMultiplication);
        add(buttonDivision);
        buttonPlus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMultiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonDivision.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[]args){
        new Calculator();
    }
}
