package ru.mirea.task15.number1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 250, 20);
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button(" / ");
        Button calculateButton = new Button("Calculate");

        tf.setBounds(50, 50, 250, 20);
        addButton.setBounds(50, 100, 60, 30);
        subtractButton.setBounds(120, 100, 60, 30);
        multiplyButton.setBounds(190, 100, 60, 30);
        divideButton.setBounds(260, 100, 60, 30);
        calculateButton.setBounds(50, 150, 270, 30);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + " + ");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + " - ");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + " * ");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + " / ");
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = tf.getText();
                String[] parts = expression.split(" ");
                if (parts.length == 3) {
                    double num1 = Double.parseDouble(parts[0]);
                    double num2 = Double.parseDouble(parts[2]);
                    double result = 0;

                    switch (parts[1]) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }

                    tf.setText(String.valueOf(result));
                }
            }
        });

        f.add(tf);
        f.add(addButton);
        f.add(subtractButton);
        f.add(multiplyButton);
        f.add(divideButton);
        f.add(calculateButton);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

