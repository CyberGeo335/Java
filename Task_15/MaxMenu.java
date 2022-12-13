import javax.swing.*;
import java.awt.*;

public class MaxMenu extends JFrame
{
    MaxMenu()
    {
        String [] strFiles = {"Сохранить", "Выйти", "Правка"};
        String [] strEdit = {"Копировать", "Вырезать", "Вставить"};
        String [] strHelp = {"Справка"};
        setLayout(new GridLayout(1, 2, 20 , 30));
        setSize(500, 200);
        JMenu file = createJMenu(strFiles, "File");
        JMenu edit = createJMenu(strEdit, "Edit");
        JMenu help = createJMenu(strHelp, "Help");
        JMenuBar fullMenu = new JMenuBar();
        fullMenu.add(file);
        fullMenu.add(edit);
        fullMenu.add(help);
        setJMenuBar(fullMenu);
        JButton button1 = new JButton("Боньк !!!");
        JButton button2 = new JButton("Боньк !!!");
        button1.setBounds(20, 20, 25, 15);
        button2.setBounds(20, 20, 25, 15);
        JTextArea text = new JTextArea("This is the area you can write text");
        text.setBounds(50, 50, 50, 100);
        add(button1);
        add(button2);
        add(text);
        setVisible(true);
    }

    private JMenu createJMenu(String [] items, String name)
    {
        JMenu ans = new JMenu(name);
        for (String item : items) ans.add(new JMenuItem(item));
        return ans;
    }

    public static void main(String [] args){
        new MaxMenu();
    }
}
