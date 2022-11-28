import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CarInterface implements ActionListener
{
    public CarInterface()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("RC Car Controller");
        frame.setVisible(true);

        frame.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Click buttons to move the RC car.");


        //panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        label.setBounds(10,10,400,25);
        panel.add(label);

        JButton buttonUp = new JButton("^");
        buttonUp.setBounds(265, 100, 50, 50);
        buttonUp.setFocusPainted(false);
        buttonUp.setBackground(Color.WHITE);
        buttonUp.addActionListener(e -> {UpPressed();});
        panel.add(buttonUp);

        JButton buttonLeft = new JButton("<");
        buttonLeft.setBounds(200, 165, 50, 50);
        buttonLeft.setFocusPainted(false);
        buttonLeft.setBackground(Color.WHITE);
        buttonLeft.addActionListener(e -> {LeftPressed();});
        panel.add(buttonLeft);

        JButton buttonRight = new JButton(">");
        buttonRight.setBounds(330, 165, 50, 50);
        buttonRight.setFocusPainted(false);
        buttonRight.setBackground(Color.WHITE);
        buttonRight.addActionListener(e -> {RightPressed();});
        panel.add(buttonRight);

        JButton buttonDown = new JButton("v");
        buttonDown.setBounds(265, 230, 50, 50);
        buttonDown.setFocusPainted(false);
        buttonDown.setBackground(Color.WHITE);
        buttonDown.addActionListener(e -> {DownPressed();});
        panel.add(buttonDown);
    }

    public void UpPressed()
    {
        System.out.println("Up Clicked");
    }

    public void LeftPressed()
    {
        System.out.println("Left Clicked");
    }

    public void RightPressed()
    {
        System.out.println("Right Clicked");
    }

    public void DownPressed()
    {
        System.out.println("Down Clicked");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
    }
    public static void main(String[] args)
    {
        new CarInterface();
    }
}