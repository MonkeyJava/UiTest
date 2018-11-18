package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UI extends JFrame {
    private int x;
    private int y;
    private String result;
    private String[] arr = {"0","1","2","3","4"};
    private String[] arr2 = {"0","1","2","3","4"};
    String[][] res = {  {"1","2","3","4","5"},
                        {"1","2","3","4","5"},
                        {"1","2","3","4","5"},
                        {"1","2","3","4","5"},
                        {"1","2","3","4","5"}};

    private JLabel label = new JLabel("Программа расчета влажности");
    private JLabel label2 = new JLabel("<html>Показания<br>влажного термометра</html>");
    private JLabel label3 = new JLabel("<html>Разница показаний <br>сухого и влажного термометра</html>");
    private JLabel label4 = new JLabel("1234");
    private JButton button = new JButton("OK");
    private JComboBox comboBox = new JComboBox(arr);
    private JComboBox comboBox2 = new JComboBox(arr2);
    private GridBagLayout gbl = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();


    UI(){
        setBounds(550, 200, 500, 200);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program");
        setLayout(gbl);
       // label2.setText("<html>Показания<br>влажного термометра</html>");
        /*
        * Расположение label, label2, label3
        *
        */
        c.anchor = GridBagConstraints.NORTH;
        c.fill   = GridBagConstraints.NONE;
        c.gridheight = 1;
        c.gridwidth  = GridBagConstraints.REMAINDER;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 0, 0);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0.0;
        c.weighty = 0.0;
        gbl.setConstraints(label, c);
        add(label);


        c.anchor = GridBagConstraints.NORTH;
        c.fill   = GridBagConstraints.NONE;
        c.gridheight = 1;
        c.gridwidth  = GridBagConstraints.WEST;
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(0, 20, 80, 0);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0.0;
        c.weighty = 0.0;
        gbl.setConstraints(label2, c);
        add(label2);

        c.anchor = GridBagConstraints.NORTH;
        c.fill   = GridBagConstraints.NONE;
        c.gridheight = 1;
        c.gridwidth  = GridBagConstraints.WEST;
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridy = GridBagConstraints.RELATIVE;
        c.insets = new Insets(0, 40, 0, 0);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0.0;
        c.weighty = 0.0;
        gbl.setConstraints(label3, c);
        add(label3);

        c.anchor = GridBagConstraints.NORTH;
        c.fill   = GridBagConstraints.NONE;
        c.gridheight = 1;
        c.gridwidth  = GridBagConstraints.REMAINDER;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(0, 0, 0, 0);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0.0;
        c.weighty = 0.0;
        gbl.setConstraints(label4, c);
        add(label4);
        /*
        * Расположение comboBox и comboBox2
        *
        */



        c.anchor = GridBagConstraints.WEST;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(0, 40, 0,0);
        gbl.setConstraints(comboBox, c);
        add(comboBox);
        c.anchor = GridBagConstraints.WEST;
        c.gridx = 20;
        c.gridy = 1;
        c.insets = new Insets(0, 100, 0,0);
        gbl.setConstraints(comboBox2, c);
        add(comboBox2);
        /*
        * Расположение button
        * */
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(0, 0, 0,0);
        gbl.setConstraints(button, c);
        add(button);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 x = comboBox.getSelectedIndex();

            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                y = comboBox2.getSelectedIndex();

            }
        };

        ActionListener actionListenerButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 result = res[x][y];
               // System.out.printf("i am button %d \n", result);
                label4.setText(String.valueOf(result));
                System.out.println(res[x][y]);
            }
        };

        comboBox.addActionListener(actionListener);
        comboBox2.addActionListener(actionListener2);
        button.addActionListener(actionListenerButton);

    }

}
