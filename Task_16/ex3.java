import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ex3 extends JFrame {
    JLabel serviceLabel, nameLabel, passwordLabel;
    JTextArea serviceText, nameText, passwordText;
    ex3()
    {
        setSize(500, 400);
        setLayout(null);
        setTitle("Практика 16.3");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        serviceLabel = new JLabel("Service:");
        nameLabel = new JLabel("User name:");
        passwordLabel = new JLabel("Password:");
        serviceLabel.setBounds(50, 20, 100, 20);
        nameLabel.setBounds(50, 50, 100, 20);
        passwordLabel.setBounds(50, 80, 100, 20);
        serviceText = new JTextArea();
        nameText = new JTextArea();
        passwordText = new JTextArea();
        serviceText.setBounds(120, 20, 300, 20);
        nameText.setBounds(120, 50, 300, 20);
        passwordText.setBounds(120, 80, 300, 20);
        serviceText.setBorder(border);
        nameText.setBorder(border);
        passwordText.setBorder(border);
        add(serviceText);
        add(serviceLabel);
        add(nameLabel);
        add(nameText);
        add(passwordLabel);
        add(passwordText);
        addComponentListener(new ComponentAdapter()
        {
            @Override
            public void componentResized(ComponentEvent e) {
                titleAlign();
            }
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void titleAlign()
    {
        Font font = getFont();
        String currentTitle = getTitle().trim();
        FontMetrics fm = getFontMetrics(font);
        int frameWidth = getWidth();
        int titleWidth = fm.stringWidth(currentTitle);
        int spaceWidth = fm.stringWidth(" ");
        int centerPos = (frameWidth / 2) - (titleWidth / 2);
        int spaceCount = centerPos / spaceWidth;
        String pad = "";
        pad = String.format("%" + (spaceCount - 14) + "s", pad);
        setTitle(pad + currentTitle);
    }

    public static void main(String [] args) {
        new ex3();
    }
}
