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

    Font myFont = new Font("Impact",Font.BOLD,30);

    double num1=0, num2=0, result=0;
    char operator;
    Calculator(){
    frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,550);
    frame.setLayout(null);

    frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
