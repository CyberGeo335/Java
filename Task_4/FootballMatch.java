

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

class FootballMatch extends JFrame
{


    JButton AC = new JButton("AC Milan");
    JButton Real = new JButton("Real Madrid");
    JLabel Res = new JLabel("Result: 0 X 0");
    JLabel Last = new JLabel("Last Scorer: N/A");
    JLabel Winner = new JLabel("Winner: DRAW");
    public int AC_int = 0;
    public int Real_int = 0;
    Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
    public class TestActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            AC_int++;
            Res.setText("Result: "+AC_int+" X "+Real_int);
            Last.setText("Last Scorer: AC Milan");
            Winner.setText("Winner: "+((AC_int>Real_int)?"AC Milan":((AC_int==Real_int)?"DRAW":"Real Madrid")));
        }
    }
    public class TestActionListener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Real_int++;
            Res.setText("Result: "+AC_int+" X "+Real_int);
            Last.setText("Last Scorer: Real Madrid");
            Winner.setText("Winner: "+((AC_int>Real_int)?"AC Milan":((AC_int==Real_int)?"DRAW":"Real Madrid")));
        }
    }
    public FootballMatch()
    {
        super("results of match");
        setLayout(null);
        setSize(1980,1080);
        AC.setBounds(50,80,400,60);
        ActionListener actionListener = new TestActionListener();
        AC.addActionListener(actionListener);
        add(AC);
        Real.setBounds(460,80,400,60);
        ActionListener actionListener1 = new TestActionListener1();
        Real.addActionListener(actionListener1);
        add(Real);
        Res.setBounds(50,30,810,50);
        Res.setBorder(border);
        Res.setFont(new Font("Serif", Font.PLAIN, 18));
        Res.setHorizontalAlignment(JLabel.CENTER);
        add(Res);
        Last.setBounds(50,150,400,50);
        Last.setBorder(border);
        Last.setFont(new Font("Serif", Font.PLAIN, 18));
        Last.setHorizontalAlignment(JLabel.CENTER);
        add(Last);
        Winner.setBounds(460,150,400,50);
        Winner.setBorder(border);
        Winner.setFont(new Font("Serif", Font.PLAIN, 18));
        Winner.setHorizontalAlignment(JLabel.CENTER);
        add(Winner);

    }
    public static void main(String[]args)
    {
        new FootballMatch().setVisible(true);
    }
}
// спартак чемпион XD