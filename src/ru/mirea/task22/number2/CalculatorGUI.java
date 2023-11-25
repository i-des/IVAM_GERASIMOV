package ru.mirea.task22.number2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorGUI extends JFrame {

    private JTextField display;

    public CalculatorGUI() {
        setTitle("RPN Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
                "7", "8", "9", " / ",
                "4", "5", "6", " * ",
                "1", "2", "3", " - ",
                "0", " . ", " = ", " + ",
                " C ", " "
        };

        for (String label : buttonLabels) {
            JButton button = createButton(label);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createButton(String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ButtonClickListener());
        return button;
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String buttonText = source.getText();

            switch (buttonText) {
                case " = ":
                    evaluateExpression();
                    break;
                case " C ":
                    clearDisplay();
                    break;
                default:
                    updateDisplay(buttonText);
                    break;
            }
        }

        private void evaluateExpression() {
            String expression = display.getText();
            String[] tokens = expression.split("\\s+");
            double result = RPNCalculator.evaluateRPN(tokens);
            display.setText(Double.toString(result));
        }

        private void clearDisplay() {
            display.setText("");
        }

        private void updateDisplay(String buttonText) {
            String currentText = display.getText();
            display.setText(currentText + buttonText);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorGUI::new);
    }
}
