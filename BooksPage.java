package Frames;
import Entity.*;
import Entitylist.*;
import File.BooksIO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BooksPage extends JFrame implements ActionListener{
	Font font30B = new Font("Segoe UI",Font.BOLD,30);
	Font font20 = new Font("Segoe UI",Font.PLAIN,20);
	Font font20B = new Font("Segoe UI",Font.BOLD,20);
	Font font15 = new Font("Segoe UI",Font.PLAIN,15);
	
	
	JTextField title,id,author,publishedYear,genre,rating,quantity;
	JTextArea textArea;
	JScrollPane jsp;
	JPanel topPanel,leftPanel,rightPanel,bottomPanel; 
	JButton deleteBtn,addBtn,backButton,homeButton,searchBtn,updateBtn,clear;
	
	
	public BooksPage(){
		super("Admin Panel");
		this.setSize(1000,700);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//=========================TOP PANEL===========================
		topPanel = new JPanel();
		topPanel.setBounds(0,0,1000,80); //x,y,w,h
		topPanel.setLayout(null);
		
		//------------------Welcome-------------------
		JLabel header = new JLabel("Welcome to Ohara Library");
		header.setBounds(200,15,700,50); //x,y,w,h
		header.setFont(font30B);
		topPanel.add(header);
		
		this.add(topPanel);
		
		
		//=========================LEFT PANEL===========================
		leftPanel = new JPanel();
		leftPanel.setBounds(0,80,600,550);
		leftPanel.setLayout(null);
		// leftPanel.setBackground(new Color(153,153,255));
		
		
		int vPos = 80;
		int gap=40;
		int lblsize=150;
		int txtfieldsize=300;
		//---------------------title---------------------
		JLabel titleLabel = new JLabel("Book's Title");
		titleLabel.setBounds(60,vPos,lblsize,30); //x,y,w,h
		titleLabel.setFont(font20);
		leftPanel.add(titleLabel);
		
		//title TextField
		title = new JTextField();
		title.setBounds(200,vPos,txtfieldsize,30); //x,y,w,h
		title.setFont(font20);
		leftPanel.add(title);
		
		vPos+=gap;
		//--------------------ID------------------------
		JLabel idLabel = new JLabel("Book's ID");
		idLabel.setBounds(60,vPos,lblsize,30); //x,y,w,h
		idLabel.setFont(font20);
		leftPanel.add(idLabel);

		id = new JTextField();
		id.setBounds(200,vPos,txtfieldsize,30); //x,y,w,h
		id.setFont(font20);
		leftPanel.add(id);
		
		vPos+=gap;
		//-----------------------author-------------------
		JLabel authorLabel = new JLabel("Author");
		authorLabel.setBounds(60,vPos,lblsize,30); //x,y,w,h
		authorLabel.setFont(font20);
		leftPanel.add(authorLabel);

		author = new JTextField();
		author.setBounds(200,vPos,txtfieldsize,30); //x,y,w,h
		author.setFont(font20);
		leftPanel.add(author);
		
		vPos+=gap;
		//-------------------publishedYear------------------
		JLabel publishedYearLabel = new JLabel("Published Year");
		publishedYearLabel.setBounds(60,vPos,lblsize,30); //x,y,w,h
		publishedYearLabel.setFont(font20);
		leftPanel.add(publishedYearLabel);

		publishedYear = new JTextField();
		publishedYear.setBounds(200,vPos,txtfieldsize,30); //x,y,w,h
		publishedYear.setFont(font20);
		leftPanel.add(publishedYear);
		
		vPos+=gap;
		//-------------------genre--------------------
		JLabel genreLabel = new JLabel("Genre");
		genreLabel.setBounds(60,vPos,lblsize,30); //x,y,w,h
		genreLabel.setFont(font20);
		leftPanel.add(genreLabel);

		genre = new JTextField();
		genre.setBounds(200,vPos,txtfieldsize,30); //x,y,w,h
		genre.setFont(font20);
		leftPanel.add(genre);
		
		vPos+=gap;
		//-------------------rating--------------------
		JLabel ratingLabel = new JLabel("Rating");
		ratingLabel.setBounds(60,vPos,lblsize,30); //x,y,w,h
		ratingLabel.setFont(font20);
		leftPanel.add(ratingLabel);

		rating = new JTextField();
		rating.setBounds(200,vPos,txtfieldsize,30); //x,y,w,h
		rating.setFont(font20);
		leftPanel.add(rating);
		
		vPos+=gap;

		//-------------------genre--------------------
		JLabel quantityLabel = new JLabel("Quantity");
		quantityLabel.setBounds(60,vPos,lblsize,30); //x,y,w,h
		quantityLabel.setFont(font20);
		leftPanel.add(quantityLabel);

		quantity = new JTextField();
		quantity.setBounds(200,vPos,txtfieldsize,30); //x,y,w,h
		quantity.setFont(font20);
		leftPanel.add(quantity);
		
		vPos+=gap;
		
		//------------------ Buttons ------------------------
		int btnhpos =20;
		int btnhgap =130;
		int btnvpos =440;
		
		//Add Button
		addBtn = new JButton("Add");
		addBtn.setBounds(btnhpos,btnvpos,100,30); //x,y,w,h
		addBtn.setFont(font20);
		addBtn.addActionListener(this);
		leftPanel.add(addBtn);
		
		btnhpos += btnhgap;
		
		//Delete Button
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(btnhpos,btnvpos,120,30); //x,y,w,h
		deleteBtn.setFont(font20);
		deleteBtn.addActionListener(this);
		leftPanel.add(deleteBtn);
		
		btnhpos += btnhgap;
		
		//Update Button
		updateBtn = new JButton("Update");
		updateBtn.setBounds(btnhpos+10,btnvpos,100,30); //x,y,w,h
		updateBtn.setFont(font20);
		updateBtn.addActionListener(this);
		leftPanel.add(updateBtn);
		
		btnhpos += btnhgap;
		
		//Search Button
		searchBtn = new JButton("Search");
		searchBtn.setBounds(btnhpos,btnvpos,120,30); //x,y,w,h
		searchBtn.setFont(font20);
		searchBtn.addActionListener(this);
		leftPanel.add(searchBtn);
		
		
		//Clear Button
		clear = new JButton("Clear");
		clear.setBounds(370,370,90,30); //x,y,w,h
		clear.setFont(font20);
		clear.addActionListener(this);
		leftPanel.add(clear);
		
		btnhpos += btnhgap;
		
		this.add(leftPanel);
		//=========================RIGHT PANEL===========================
		rightPanel = new JPanel();
		rightPanel.setBounds(600,80,400,550);
		rightPanel.setLayout(null);
		
		
		//------------------Text Area -------------------

		textArea = new JTextArea();
		textArea.setFont(font15);
		textArea.setEditable(false);
		
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setBounds(13, 13, 360, 525);
		rightPanel.add(jsp);

		BooksIO.loadAllBooks(Books);
		updateTextArea();

		this.add(rightPanel);
		
		//=========================BOTTOM PANEL===========================
		bottomPanel = new JPanel();
		bottomPanel.setBounds(0,620,1000,80);
		bottomPanel.setLayout(null);
		
		
		backButton = new JButton("<Log Out");
      	backButton.setBounds(0,10,100, 30);
		backButton.setFocusable(false);
      	backButton.setFont(font15);
      	backButton.addActionListener(this);
      	bottomPanel.add(backButton);
		
      	 		//Home Button
      	/*homeButton = new JButton("<Home");
      	homeButton.setBounds(900,10,100, 30);
      	
      	homeButton.setFocusable(false);
      	homeButton.setFont(font15);
		
      	homeButton.addActionListener(this);
		bottomPanel.add(homeButton);*/
		
		this.add(bottomPanel);
		
		this.setVisible(true);
	}


	Bookslist Books = new Bookslist();
	
	@Override
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == addBtn){
			try{
				Books em = new Books(title.getText(),
									id.getText(),
									author.getText(),
									publishedYear.getText(),
									genre.getText(),
									rating.getText(),
									Integer.parseInt(quantity.getText()));
									
				Books.insert(em);
				BooksIO.addBooks(em);
				updateTextArea();
			}
			catch(NumberFormatException er){
				JOptionPane.showMessageDialog(this, "Invalid input! Enter author & rating", "Error", JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception er){
				JOptionPane.showMessageDialog(this, "Invalid input! Enter ID in number format", "Error", JOptionPane.ERROR_MESSAGE);
			}
			clear();
		}
		
		if(e.getSource() == deleteBtn){
			Books em = Books.getById(id.getText());
			if(em != null){
				Books.removeById(id.getText());
				BooksIO.updateAllBooks(Books);
				JOptionPane.showMessageDialog(this,"Books Deleted");
			}
			else{
				JOptionPane.showMessageDialog(this,"Books Not Found", "Warning",JOptionPane.ERROR_MESSAGE);
			}
			updateTextArea();
			clear();
		}
		
		if(e.getSource() == updateBtn){
			try{
				Books tempE = new Books(title.getText(),
									id.getText(),
									author.getText(),
									publishedYear.getText(),
									genre.getText(),
									rating.getText(),
									Integer.parseInt(quantity.getText()));
				Books em = Books.getById(id.getText());
				Books.removeById(id.getText());
				if(em != null){
					em = tempE;
					Books.insert(tempE);
					BooksIO.updateAllBooks(Books);
					updateTextArea();
					JOptionPane.showMessageDialog(this,"Information Updated");
				}
				else{
					JOptionPane.showMessageDialog(this,"Books Not Found", "Warning",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(NumberFormatException er){
				JOptionPane.showMessageDialog(this, "Enter author & rating", "Error", JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception er){
				JOptionPane.showMessageDialog(this, "Invalid input! Enter ID in number format", "Error", JOptionPane.ERROR_MESSAGE);
			}
			clear();
		}
		
		if(e.getSource() == searchBtn){
			Books em = null;

			// Priority: search by ID, then Title, then Genre
			if (!id.getText().isEmpty()) {
				em = Books.getById(id.getText());
			} else if (!title.getText().isEmpty()) {
				em = Books.getByTitle(title.getText());
			} else if (!genre.getText().isEmpty()) {
				em = Books.getByGenre(genre.getText());
			} else if (!author.getText().isEmpty()) {
				em = Books.getByAuthor(author.getText());
			}
			
			if(em != null){
				JOptionPane.showMessageDialog(this,em.getBookAsString());
			}
			else{
				JOptionPane.showMessageDialog(this,"Books Not Found", "Warning",JOptionPane.ERROR_MESSAGE);
			}
			clear();
		}
		if(e.getSource() == clear){
			clear();
			
		}


		if(e.getSource() == backButton){
			new LogIn();
			this.dispose();	
		}
		/*if(e.getSource() == homeButton){
			new BooksPage();
			this.dispose();	
		}*/
	}
	
	public void updateTextArea(){
		
		textArea.setText(Books.getAllBookAsString());
		
	}

	public void clear(){
			title.setText("");
			id.setText("");
			author.setText("");
			publishedYear.setText("");
			genre.setText("");
			rating.setText("");
			quantity.setText("");
	}

}





