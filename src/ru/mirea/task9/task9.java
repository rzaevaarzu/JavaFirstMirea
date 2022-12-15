package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class INNInvalidException extends Exception
{
    public INNInvalidException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}


public class OnlineShop extends JFrame
{
    JLabel label = new JLabel("Оформление заказа - Ввод ИНН", SwingConstants.CENTER);
    JLabel innHelpText = new JLabel("Введите ваш ИНН (12 цифр):");
    JLabel innErrorText = new JLabel("");

    JTextField innInput = new JTextField("", 12);

    JButton submitButton = new JButton("Отправить");


    Font labelFont = new Font("Roboto", Font.BOLD, 24);
    Font normalFont = new Font("Roboto", Font.PLAIN, 16);

    public void submitOrder() {
        String inn = innInput.getText();
        Shop p = new Shop();

        try {
            p.SubmitOrder(inn);

            innErrorText.setForeground(Color.green);
            innErrorText.setText("Заказ создан успешно!");

            innInput.setText("");
        }
        catch (INNInvalidException e) {
            innErrorText.setForeground(Color.red);
            innErrorText.setText("Введенная строка не является действительным ИНН.");
        }

    }

    public OnlineShop()
    {
        super("Online Shop Checkout");
        setSize(600,300);

        JPanel listPane = new JPanel();
        setLayout(new BorderLayout());
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.Y_AXIS));

        label.setFont(labelFont);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(label);

        JPanel innPanel = new JPanel();
        innPanel.setLayout(new FlowLayout ());
        innHelpText.setFont(normalFont);
        innHelpText.setAlignmentX(Component.CENTER_ALIGNMENT);
        innPanel.add(innHelpText);

        innInput.setFont(normalFont);
        innPanel.add(innInput);

        listPane.add(innPanel);

        innErrorText.setFont(normalFont);
        innErrorText.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(innErrorText);

        submitButton.setFont(normalFont);
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(submitButton);

        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                submitOrder();
            }
        });

        add(listPane, BorderLayout.NORTH);

    }
    public static void main(String[]args)
    {
        new OnlineShop().setVisible(true);
    }
}

