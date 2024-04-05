import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private double total3 = 0.0;
    private double total4 = 0.0;
    private double total5 = 0.0;
    private double total6 = 0.0;
    private double total7 = 0.0;
    private double total8 = 0.0;
    private JPanel javaCalculator;
    private JTextField textDisplay;
    private JButton btnSix;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPoint;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnEquals;

    public javaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);

            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);

            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);

            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);

            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);

            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);

            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);

            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);

            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);

            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (total1 != 0.0) {
                    total2 = total1 + Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(Double.toString(total2));
                }
                else if (total1 == 0.0) {
                    if (total3 != 0.0) {
                        total4 = total3 - Double.parseDouble(textDisplay.getText());
                        textDisplay.setText(Double.toString(total4));
                    }
                    else if (total5 != 0.0) {
                        total6 = total5 * Double.parseDouble(textDisplay.getText());
                        textDisplay.setText(Double.toString(total6));
                    }
                    else if (total7 != 0.0) {
                        total6 = total5 / Double.parseDouble(textDisplay.getText());
                        textDisplay.setText(Double.toString(total6));
                    }

                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0.0;
                total2 = 0.0;
                textDisplay.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                }
                else if (textDisplay.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                }
                else {
                    String btnPointText = textDisplay.getText() + ".";
                        textDisplay.setText(btnPointText);
                }
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total3 = total3 + Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total5 = total5 + Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
            }

        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total7 = total7 + Double.parseDouble(textDisplay.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("javaCalculator");
        frame.setContentPane(new javaCalculator().javaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
