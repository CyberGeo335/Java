import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2 extends JFrame {
    ex2(){
        setSize(500, 200);
        setLayout(null);
        String [] colours = {"Синий", "Красный", "Черный"};
        String [] fonts = {"Times New Roman", "MS Sans Serif", "Courier New", "Comic Sans"};
        JTextArea text = new JTextArea();
        text.setBounds(200, 60, 150, 50);
        JComboBox<String> menuColours = new JComboBox<>(colours);
        JComboBox<String> menuFonts = new JComboBox<>(fonts);
        menuColours.setBounds(20, 50, 140, 20);
        menuFonts.setBounds(20, 100, 140, 20);
        menuColours.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuColours.getSelectedItem() == "Синий")
                    text.setForeground(Color.BLUE);
                else if (menuColours.getSelectedItem() == "Красный")
                    text.setForeground(Color.RED);
                else text.setForeground(Color.BLACK);
            }
        });

        menuFonts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuFonts.getSelectedItem() == fonts[0])
                    text.setFont(new Font(fonts[0], Font.PLAIN, 14));
                else if (menuFonts.getSelectedItem() == fonts[1])
                    text.setFont(new Font(fonts[1], Font.PLAIN, 14));
                else if (menuFonts.getSelectedItem() == fonts[2])
                    text.setFont(new Font(fonts[2], Font.PLAIN, 19));
                else if (menuFonts.getSelectedItem() == fonts[3])
                    text.setFont(new Font(fonts[3], Font.PLAIN, 30));
            }
        });

        add(menuColours);
        add(menuFonts);
        add(text);
        setVisible(true);
    }

    public static void main(String [] args){
        new ex2();
    }
}
