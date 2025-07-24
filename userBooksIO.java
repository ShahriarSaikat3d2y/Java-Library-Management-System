package File;

import Entity.*;
import Entitylist.*;
import java.io.*;
import java.util.*;

public class userBooksIO{
	
	public static void borrowedBooks(Books em){  // Userpage
		try{
			FileWriter fw = new FileWriter(new File("./file/userBooksInfo.txt"),true);
			fw.write(em.getTitle()+";"+em.getId()+";"+ em.getAuthor()+";"
					+em.getPublishedYear()+";"+em.getGenre()+";"+em.getRating()+";" + em.getQuantity()+"\n");
			em.borrowBook();
			//fw.flush();		
			fw.close();	
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}	
	}
	
	
	public static void loadAllBooks(Bookslist Books){ // userpage
		try{
			Scanner sc = new Scanner(new File("./file/BooksInfo.txt"));
			while(sc.hasNextLine()){
				String data[] = sc.nextLine().split(";");
				
			Books e = new Books(data[0], data[1], data[2], data[3], data[4], data[5], Integer.parseInt(data[6]));
				
				Books.insert(e);
			}
			sc.close();
		}	
		catch(Exception e){
				System.out.println("File not found");
			
		}
	}


	public static void updateAllBooks(Bookslist books){ // user page 
		try{
			FileWriter fw = new FileWriter(new File("./file/BooksInfo.txt"));  // rewriting moode tai true likha lage nai 
			Books allBook[] = books.getAllBooksAsArray();
		
			for(Books em : allBook){
				if(em != null){
					fw.write(em.getTitle()+";"+em.getId()+";"+ em.getAuthor()+";"
					+em.getPublishedYear()+";"+em.getGenre()+";"+em.getRating()+";" + em.getQuantity()+"\n");
					fw.flush();	
				}
			}
			fw.close();
			
		}
		catch(Exception e){
			e.printStackTrace(System.out);
		}
		
	}


	public static void loadBorrowedBooks(Bookslist Books){ // dashboard
		try{
			Scanner sc = new Scanner(new File("./file/userBooksInfo.txt"));
			while(sc.hasNextLine()){
				String data[] = sc.nextLine().split(";");
				
			Books e = new Books(data[0], data[1], data[2], data[3], data[4], data[5], Integer.parseInt(data[6]));
				
				Books.insert(e);
			}
			sc.close();
		}	
		catch(Exception e){
				System.out.println("File not found");
			
		}
	}
	
	


	public static void updateAllBorrowedBooks(Bookslist books){ // dashboard
		try{
			FileWriter fw = new FileWriter(new File("./file/userBooksInfo.txt"));  // rewriting moode tai true likha lage nai 
			Books allBook[] = books.getAllBooksAsArray();
		
			for(Books em : allBook){
				if(em != null){
					fw.write(em.getTitle()+";"+em.getId()+";"+ em.getAuthor()+";"
					+em.getPublishedYear()+";"+em.getGenre()+";"+em.getRating()+";" + em.getQuantity()+"\n");
					fw.flush();	
				}

			}
			fw.close();
			
		}
		catch(Exception e){
			e.printStackTrace(System.out);
		}
		
	}
	/*public static void updateAllBooks(Bookslist Books){
		try{
			FileWriter fw = new FileWriter(new File("./BooksInfo.txt"));  // rewriting moode tai true likha lage nai 
			Books allBooks[] = Books.getAllBooksAsArray();
		
			for(Books em : allBooks){
				if(em != null){
					fw.write(em.getTitle()+";"+em.getId()+";"+ em.getAuthor()+";"+
					em.getPublishedYear()+";"+em.getGenre()+";"+em.getRating()+";" + em.getQuantity()+"\n");
					fw.flush();	
				}
			}
			fw.close();
			
		}
		catch(Exception e){
			e.printStackTrace(System.out);
		}
		
	}*/
	
	
}






