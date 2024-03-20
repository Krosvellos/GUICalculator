import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textfield;

    JButton numberButtons[] = new JButton[10];
    JButton operatorButtons[] = new JButton[8];
    JButton addButton, subButton, multButton, divButton;
    JButton decButton, equalsButton, delButton, clearButton;
    JPanel panel;

    Font myFont = new Font("SF Pro",Font.BOLD,18);

    double num1=0, num2=0, result=0;
    char operator;
    Calculator(){
    frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,550);
    frame.setLayout(null);
    textfield = new JTextField();
    textfield.setBounds(50,25,300,50);
    textfield.setFont(myFont);
    textfield.setEditable(false);

    addButton = new JButton("+");
    subButton = new JButton("-");
    multButton = new JButton("*");
    divButton = new JButton("/");
    equalsButton = new JButton("=");
    delButton = new JButton("DELETE");
    clearButton = new JButton("CLEAR");
    decButton = new JButton(".");

    operatorButtons[0] = addButton;
    operatorButtons[1] = subButton;
    operatorButtons[2] = multButton;
    operatorButtons[3] = divButton;
    operatorButtons[4] = equalsButton;
    operatorButtons[5] = delButton;
    operatorButtons[6] = clearButton;
    operatorButtons[7] = decButton;

    for(int i = 0; i<8; i++){
        operatorButtons[i].addActionListener(this);
        operatorButtons[i].setFont(myFont);
        operatorButtons[i].setFocusable(false);
    }

        for(int i = 0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);

        }

        delButton.setBounds(50,430,145,50);
        clearButton.setBounds(205,430,145,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        // panel.setBackground(Color.lightGray);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equalsButton);
        panel.add(divButton);

    frame.add(panel);
    frame.add(delButton);
    frame.add(clearButton);
    frame.add(textfield);
    frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
