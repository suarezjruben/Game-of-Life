package Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jframe_test extends JFrame {

    private JPanel panel;
    private JButton[] button;

    public jframe_test(){
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(20,20));
        button = new JButton[20*20];
        for(int i = 0; i < 20*20; i++){
            button[i] = new JButton(Integer.toString(i+1));
            button[i].setBackground(Color.black);
            panel.add(button[i]);
            button[i].addActionListener(actionListener);
        }
        add(panel);

    }
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = e.getActionCommand();
            System.out.println(e.getActionCommand());
        }
    };
}
