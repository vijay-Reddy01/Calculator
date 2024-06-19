import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calci implements ActionListener {
    double num1=0, num2=0, result=0;
    int calculation;

    JFrame frame = new JFrame("calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onButtonradioButton = new JRadioButton("on");
    JRadioButton offButtonradioButton = new JRadioButton("off");
    JButton btnZero = new JButton("0");
    JButton btnOne = new JButton("1");
    JButton btnTwo = new JButton("2");
    JButton btnThree = new JButton("3");
    JButton btnFour = new JButton("4");
    JButton btnFive = new JButton("5");
    JButton btnSix = new JButton("6");
    JButton btnSeven = new JButton("7");
    JButton btnEight = new JButton("8");
    JButton btnNine = new JButton("9");
    JButton btnDot = new JButton(".");
    JButton btnClear = new JButton("CLR");
    JButton btnDel = new JButton("DEL");
    JButton btnEqual = new JButton("=");
    JButton btnMul = new JButton("X");
    JButton btnDiv = new JButton("/");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnSqr = new JButton("x\u00B2");
    JButton btnSqrt = new JButton("\u221A");
    JButton btnExp = new JButton("^");

    Calci() {
        GUI();
        addComponents();
        addActionEvent();
    }

    public void GUI() {
        frame.setSize(320, 525);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 60, 60);
        label.setForeground(Color.BLACK);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 25));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onButtonradioButton.setBounds(10, 95, 60, 40);
        onButtonradioButton.setSelected(true);
        onButtonradioButton.setBackground(Color.black);
        onButtonradioButton.setForeground(Color.white);
        onButtonradioButton.setFocusable(false);
        frame.add(onButtonradioButton);

        offButtonradioButton.setBounds(10, 120, 60, 40);
        offButtonradioButton.setBackground(Color.black);
        offButtonradioButton.setForeground(Color.white);
        offButtonradioButton.setFocusable(false);
        frame.add(offButtonradioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onButtonradioButton);
        buttonGroup.add(offButtonradioButton);

        btnSeven.setBounds(10, 230, 60, 40);
        btnSeven.setFont(new Font("Arial", Font.BOLD, 20));
        btnSeven.setFocusable(false);
        frame.add(btnSeven);

        btnEight.setBounds(80, 230, 60, 40);
        btnEight.setFont(new Font("Arial", Font.BOLD, 20));
        btnEight.setFocusable(false);
        frame.add(btnEight);

        btnNine.setBounds(150, 230, 60, 40);
        btnNine.setFont(new Font("Arial", Font.BOLD, 20));
        btnNine.setFocusable(false);
        frame.add(btnNine);

        btnFour.setBounds(10, 290, 60, 40);
        btnFour.setFont(new Font("Arial", Font.BOLD, 20));
        btnFour.setFocusable(false);
        frame.add(btnFour);

        btnFive.setBounds(80, 290, 60, 40);
        btnFive.setFont(new Font("Arial", Font.BOLD, 20));
        btnFive.setFocusable(false);
        frame.add(btnFive);

        btnSix.setBounds(150, 290, 60, 40);
        btnSix.setFont(new Font("Arial", Font.BOLD, 20));
        btnSix.setFocusable(false);
        frame.add(btnSix);

        

        btnOne.setBounds(10, 350, 60, 40);
        btnOne.setFont(new Font("Arial", Font.BOLD, 20));
        btnOne.setFocusable(false);
        frame.add(btnOne);

        btnTwo.setBounds(80, 350, 60, 40);
        btnTwo.setFont(new Font("Arial", Font.BOLD, 20));
        btnTwo.setFocusable(false);
        frame.add(btnTwo);

        btnThree.setBounds(150, 350, 60, 40);
        btnThree.setFont(new Font("Arial", Font.BOLD, 20));
        btnThree.setFocusable(false);
        frame.add(btnThree);

        btnDot.setBounds(150, 410, 60, 40);
        btnDot.setFont(new Font("Arial", Font.BOLD, 20));
        btnDot.setFocusable(false);
        frame.add(btnDot);

        btnZero.setBounds(10, 410, 130, 40);
        btnZero.setFont(new Font("Arial", Font.BOLD, 20));
        btnZero.setFocusable(false);
        frame.add(btnZero);

        btnEqual.setBounds(220, 350, 60, 100);
        btnEqual.setFont(new Font("Arial", Font.BOLD, 20));
        btnEqual.setBackground(new Color(240, 188, 2));
        btnEqual.setFocusable(false);
        frame.add(btnEqual);

        btnDiv.setBounds(220, 110, 60, 40);
        btnDiv.setFont(new Font("Arial", Font.BOLD, 20));
        btnDiv.setBackground(new Color(239, 188, 2));
        btnDiv.setFocusable(false);
        frame.add(btnDiv);

        btnSqrt.setBounds(10, 170, 60, 40);
        btnSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        btnSqrt.setFocusable(false);
        frame.add(btnSqrt);

        btnMul.setBounds(220, 230, 60, 40);
        btnMul.setFont(new Font("Arial", Font.BOLD, 20));
        btnMul.setBackground(new Color(239, 188, 2));
        btnMul.setFocusable(false);
        frame.add(btnMul);

        btnMinus.setBounds(220, 170, 60, 40);
        btnMinus.setFont(new Font("Arial", Font.BOLD, 20));
        btnMinus.setBackground(new Color(239, 188, 2));
        btnMinus.setFocusable(false);
        frame.add(btnMinus);

        btnPlus.setBounds(220, 290, 60, 40);
        btnPlus.setFont(new Font("Arial", Font.BOLD, 20));
        btnPlus.setBackground(new Color(239, 188, 2));
        btnPlus.setFocusable(false);
        frame.add(btnPlus);

        btnSqr.setBounds(80, 170, 60, 40);
        btnSqr.setFont(new Font("Arial", Font.BOLD, 20));
        btnSqr.setFocusable(false);
        frame.add(btnSqr);

        btnExp.setBounds(150, 170, 60, 40);
        btnExp.setFont(new Font("Arial", Font.BOLD, 15));
        btnExp.setFocusable(false);
        frame.add(btnExp);

        btnDel.setBounds(150, 110, 60, 40);
        btnDel.setFont(new Font("Arial", Font.BOLD, 12));
        btnDel.setBackground(Color.red);
        btnDel.setForeground(Color.white);
        btnDel.setFocusable(false);
        frame.add(btnDel);

        btnClear.setBounds(80, 110, 60, 40);
        btnClear.setFont(new Font("Arial", Font.BOLD, 12));
        btnClear.setBackground(Color.red);
        btnClear.setForeground(Color.white);
        btnClear.setFocusable(false);
        frame.add(btnClear);
    }

    public void addActionEvent() {
        onButtonradioButton.addActionListener(this);
        offButtonradioButton.addActionListener(this);
        btnDel.addActionListener(this);
        btnClear.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMul.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnSqr.addActionListener(this);
        btnEqual.addActionListener(this);
        btnDot.addActionListener(this);
        btnOne.addActionListener(this);
        btnZero.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnExp.addActionListener(this);
    }

    public static void main(String[] args) {
        Calci calculator = new Calci();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == onButtonradioButton) {
            enable();
        } else if (source == offButtonradioButton) {
            disable();
        } else if (source == btnClear) {
            label.setText("");
            textField.setText("");
        } else if (source == btnDel) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == btnZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == btnOne) {
            textField.setText(textField.getText() + "1");
        } 
        else if (source == btnTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == btnThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == btnFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == btnFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == btnSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == btnSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == btnEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == btnNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == btnDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == btnPlus) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        } else if (source == btnMinus) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        } else if (source == btnMul) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "X");
        } else if (source == btnDiv) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        } else if (source == btnSqr) {
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == btnSqrt) {
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            String string = Double.toString(sqrt);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == btnExp) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 5; 
            textField.setText("");
            label.setText(str + "^");
        } else if (source == btnEqual) {
            num2 = Double.parseDouble(textField.getText());
            switch (calculation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textField.setText("Divide by zero error");
                        return;
                    }
                    break;
                case 5:
                    result = Math.pow(num1, num2);
                    break;
            }
            if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
    }

    public void enable() {
        onButtonradioButton.setEnabled(false);
        offButtonradioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        btnClear.setEnabled(true);
        btnDel.setEnabled(true);
        btnDiv.setEnabled(true);
        btnMul.setEnabled(true);
        btnPlus.setEnabled(true);
        btnMinus.setEnabled(true);
        btnSqrt.setEnabled(true);
        btnSqr.setEnabled(true);
        btnDot.setEnabled(true);
        btnEqual.setEnabled(true);
        btnZero.setEnabled(true);
        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);
    }

    public void disable() {
        onButtonradioButton.setEnabled(true);
        offButtonradioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        btnClear.setEnabled(false);
        btnDel.setEnabled(false);
        btnDiv.setEnabled(false);
        btnMul.setEnabled(false);
        btnPlus.setEnabled(false);
        btnMinus.setEnabled(false);
        btnSqrt.setEnabled(false);
        btnSqr.setEnabled(false);
        btnDot.setEnabled(false);
        btnEqual.setEnabled(false);
        btnZero.setEnabled(false);
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnFour.setEnabled(false);
        btnFive.setEnabled(false);
        btnSix.setEnabled(false);
        btnSeven.setEnabled(false);
        btnEight.setEnabled(false);
        btnNine.setEnabled(false);
    }
}
