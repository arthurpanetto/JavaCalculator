import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel Calculadora;
    private JTextField txtDisplay;
    private JButton btnEqual;
    private JButton btnPlus;
    private JButton btnClear;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JButton btnSquared;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btnMin;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnDot;
    private JButton btn0;
    private JButton btnBackspace;
    private JButton btnMult;
    private JButton btnDivision;

    double a, b, result;
    String opt;

    public Calculadora() {
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn7.getText());
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn8.getText());
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn9.getText());
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn4.getText());
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn5.getText());
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn6.getText());
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn1.getText());
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn2.getText());
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn3.getText());
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn0.getText());
            }
        });
        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble((txtDisplay.getText()));
                opt = "-";
                txtDisplay.setText("");
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble((txtDisplay.getText()));
                opt = "+";
                txtDisplay.setText("");
            }
        });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble((txtDisplay.getText()));
                opt = "*";
                txtDisplay.setText("");
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble((txtDisplay.getText()));
                opt = "/";
                txtDisplay.setText("");
            }
        });
        btnSquared.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble((txtDisplay.getText()));
                opt = "^";
                txtDisplay.setText("");
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
                }
            }
        });
        btnBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(txtDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());

                if(opt == "+"){
                    result = a + b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(opt == "-"){
                    result = a - b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(opt == "*"){
                    result = a * b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(opt == "/") {
                    result = a / b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(opt == "^") {
                    result = a * a;
                    txtDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
