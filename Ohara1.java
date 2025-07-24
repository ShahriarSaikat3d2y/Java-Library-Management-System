import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Frames.LogIn;
import Frames.Register;

public class Ohara1 extends JFrame {

    /*public static void main(String[] args) {
        new Ohara1();  // Constructor
    }*/

    public Ohara1() {
        JFrame openFrame = new JFrame("Ohara Library");

        JLabel welcomeLabel = new JLabel("WELCOME TO OHARA LIBRARY");
        welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        welcomeLabel.setBounds(50, 50, 400, 50);

        JPanel welcomePanel = new JPanel();
        welcomePanel.setBounds(0, 0, 500, 150);
        welcomePanel.setLayout(null);
        welcomePanel.add(welcomeLabel);

        openFrame.add(welcomePanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, 150, 500, 350);
        buttonPanel.setLayout(null);

        // Admin Login
        JButton empButton = new JButton("Admin Login");
        empButton.setBounds(50, 20, 150, 40);
        empButton.setFocusable(false);
        empButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AdminLogin().setVisible(true);
                //openFrame.dispose();
            }
        });

        // User Login
        JButton userButton = new JButton("User Login");
        userButton.setBounds(275, 20, 150, 40);
        userButton.setFocusable(false);
        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LogIn().setVisible(true);
                //openFrame.dispose();
            }
        });

        // Admin Register
        JButton adminRegButton = new JButton("Admin Register");
        adminRegButton.setBounds(50, 100, 150, 40);
        adminRegButton.setFocusable(false);
        adminRegButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegisterAdmin().setVisible(true);
               //openFrame.dispose();
            }
        });

        // User Register
        JButton userRegButton = new JButton("User Register");
        userRegButton.setBounds(275, 100, 150, 40);
        userRegButton.setFocusable(false);
        userRegButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new Register().setVisible(true);
               //openFrame.dispose();
            }
        });

        // Add buttons
        buttonPanel.add(empButton);
        buttonPanel.add(userButton);
        buttonPanel.add(adminRegButton);
        buttonPanel.add(userRegButton);

        openFrame.add(buttonPanel);

        openFrame.setBounds(300, 300, 500, 500);
        openFrame.setLayout(null);
        openFrame.setLocationRelativeTo(null);
        openFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        openFrame.setVisible(true);
    }

    /*public void LogIn() {
        System.out.println("LogIn() called");
        // Replace with actual login window or logic
    }

    public void Register() {
        System.out.println("Register() called");
        // Replace with actual register window or logic
    }*/
}
