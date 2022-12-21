package ru.mirea.task15;

import javax.swing.*;
/*public class Pop_UpWindow {
    JFrame f;
    JTextField output = new JTextField();
    Pop_UpWindow(){
        f=new JFrame("ComboBox Example");
        String country[]={"India","Aus","U.S.A","England","Newzealand"};
        JComboBox cb=new JComboBox(country);
        cb.setBounds(50, 50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
        output.setBounds(100,200,200,100);
        output.setEditable(false);
        f.add(output);
    }
    public static void main(String[] args) {
        new Pop_UpWindow();
    }
}*/
import java.awt.event.*;
public class Pop_UpWindow {
    JFrame f;
    Pop_UpWindow(){
        f=new JFrame("ComboBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JButton b=new JButton("Show");
        b.setBounds(200,100,75,20);
        String country[]={"Australia","Russia","German","India","China"};
        final JComboBox cb=new JComboBox(country);
        cb.setBounds(50, 100,90,20);
        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Country Selected: " + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }
    public static void main(String[] args) {
        new Pop_UpWindow();
    }
}