package Frames;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

    
public class BookGUI extends JFrame implements ActionListener{

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    
    JButton addButton;
    JButton viewButton;
    JButton dltButton;
    JButton searchButton;
    JButton updateButton;
    JButton ratingButton;

    JTextField titleField;
    JTextField authorField;
    JTextField genreField;
    JTextField yearField;
    JTextField ratingField;
    JTextField idField;

    
    

    public BookGUI(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 600, 650);
        this.setLocationRelativeTo(null);
        this.setLayout(null); // layout of the frame

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(null);
        headerPanel.setBounds(50, 10, 600, 40);

        JLabel headerLabel = new JLabel("Ohara Customization");
        headerLabel.setBounds(160, 10, 350, 40);
        headerLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        headerPanel.add(headerLabel);
        this.add(headerPanel);

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null); // manual positioning inside the panel
        panel.setBounds(60, 50, 600, 300); // adjust height if needed

        // Label and Field 1
        label1 = new JLabel("Book Title:");
        label1.setBounds(60, 35, 90, 30);
        panel.add(label1);

        titleField = new JTextField();
        titleField.setBounds(140, 35, 280, 30);
        panel.add(titleField);

        // Label and Field 2
        label2 = new JLabel("Author:");
        label2.setBounds(60, 70, 80, 30);
        panel.add(label2);

        authorField = new JTextField();
        authorField.setBounds(140, 70, 280, 30);
        panel.add(authorField);

        // Label and Field 3
        label3 = new JLabel("Genre:");
        label3.setBounds(60, 120, 80, 30);
        panel.add(label3);

        genreField = new JTextField();
        genreField.setBounds(140, 115, 280, 30);
        panel.add(genreField);

        // Label and Field 4
        label4 = new JLabel("Year:");
        label4.setBounds(60, 180, 80, 30);
        panel.add(label4);

        yearField = new JTextField();
        yearField.setBounds(140, 185, 280, 30);
        panel.add(yearField);

        label5 = new JLabel("Rating:");
        label5.setBounds(60,230,80,30);
        panel.add(label5);

        ratingField = new JTextField();
        ratingField.setBounds(140,235,280,30);
        panel.add(ratingField);

        label6 = new JLabel("Book ID: ");
        label6.setBounds(60,280,80,30);
        panel.add(label6);

        idField = new JTextField();
        idField.setBounds(140,285,280,30);
        panel.add(idField);



        // Add panel to frame
        this.add(panel);

       	JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new java.awt.Color(240, 240, 240)); // light gray
        buttonPanel.repaint();


        buttonPanel.setLayout(null);
        buttonPanel.setBounds(20, 345, 600, 80);

        addButton = new JButton("Add");
        addButton.setBounds(50, 20, 80, 25);
        addButton.setFocusable(false);
        buttonPanel.add(addButton);

        viewButton = new JButton("View");
        viewButton.setBounds(140, 20, 80, 25);
        viewButton.setFocusable(false);
        buttonPanel.add(viewButton);

        dltButton = new JButton("Remove");
        dltButton.setBounds(230, 20, 85, 25);
        dltButton.setFocusable(false);
        buttonPanel.add(dltButton);

        searchButton = new JButton("Search");
        searchButton.setBounds(325, 20, 80, 25);
        searchButton.setFocusable(false);
        buttonPanel.add(searchButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(415, 20, 80, 25);
        updateButton.setFocusable(false);
        buttonPanel.add(updateButton);


        this.add(buttonPanel);

        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(null);
        displayPanel.setBounds(25, 420, 600, 180); // adjust as needed

        JTextArea bookDisplayArea = new JTextArea();
        bookDisplayArea.setEditable(false); // user shouldn't type here
        bookDisplayArea.setLineWrap(true);
        bookDisplayArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(bookDisplayArea);
        scrollPane.setBounds(30, 10, 480, 150);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        displayPanel.add(scrollPane);
        this.add(displayPanel);

        //BUTTON TO ADD BOOKS
        /*addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText().trim();
                String author =authorField.getText().trim();
                String genre = genreField.getText().trim();
                String year= yearField.getText().trim();
                String rating= ratingField.getText().trim();

                if (title.isEmpty() ||author.isEmpty() || genre.isEmpty() || year.isEmpty() || rating.isEmpty()) {
                    JOptionPane.showMessageDialog(BookGUI.this, "Please fill in all fields.");
                    return;
                }

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\JAVA GUI\\JAVA GUI\\GUI\\Book.txt",true));
                    writer.write("Title: " + title + ",Author: " +author + ", Genre: " + genre + ", Year: "+year+ ", Rating: "+rating+ "\n");
                    writer.close();

                    JOptionPane.showMessageDialog(BookGUI.this, "Book added.");
                    titleField.setText("");
                    authorField.setText("");
                    genreField.setText("");
                    yearField.setText("");
                    ratingField.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(BookGUI.this, "Error saving book: " + ex.getMessage());
                }
            }
        });*/

        //BUTTON TO VIEW BOOK DETAILS
        /*viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA GUI\\JAVA GUI\\GUI\\Book.txt"));
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    reader.close();
                    bookDisplayArea.setText(content.toString());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(BookGUI.this, "Error reading file: " + ex.getMessage());
                }
            }
        });*/


        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}


