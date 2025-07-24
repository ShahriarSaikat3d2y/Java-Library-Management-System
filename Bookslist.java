 package Entitylist;
 import Entity.Books;

public class Bookslist{
	private Books Books[];
	
	public Bookslist(){
		Books = new Books[500];
	}
	public Bookslist(int size){
		Books = new Books[size];
	}
	
	public void insert(Books e){
		boolean flag = false;
		for(int i=0;i<Books.length;i++){
			if(Books[i] == null){
				Books[i] = e;
				flag = true;
				break;
			}
		}
		//if(flag){System.out.println("Book inserted. ");}
		//else{System.out.println("Can not insert Book.");}	
	}
	
	public void removeById(String id){
		boolean flag = false;
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				if(Books[i].getId().equals(id) ){
					Books[i] = null;
					flag = true;
					break;
				}
			}
		}
		
		if(flag){System.out.println("Book Deleted Successfully ");}
		else{System.out.println("No Book with this Id !!");}
	}
	public void removeByTitle(String title){
		boolean flag = false;
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				if(Books[i].getTitle().equals(title) ){
					Books[i] = null;
					flag = true;
					break;
				}
			}
		}
		
		if(flag){System.out.println("Book Deleted Successfully ");}
		else{System.out.println("No Book with this title!!");}
	}
	public void returnBorrowedBook(Books b){
		boolean flag = false;
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				if(Books[i].getId().equals(b.getId()) ){
					Books[i].returnBook();
					Books[i] = null;
					flag = true;
					break;
				}
			}
		}
		
		if(flag){System.out.println("Book Deleted Successfully ");}
		else{System.out.println("No Book with this Id !!");}
	}
	
	public Books getById(String id){
		Books e = null;
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				if(Books[i].getId().equals(id) ){
					e = Books[i];
					break;
				}
			}
		}
		return e;
	}
	public Books getByTitle(String title){
		Books e = null;
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				if(Books[i].getTitle().equals(title) ){
					e = Books[i];
					break;
				}
			}
		}
		return e;
	}
	
	public Books getByGenre(String genre){
		Books e = null;
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				if(Books[i].getGenre().equals(genre) ){
					e = Books[i];
					
				}
			}
		}
		return e;
	}

	public Books getByAuthor(String author){
		Books e = null;
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				if(Books[i].getAuthor().equals(author) ){
					e = Books[i];
					
				}
			}
		}
		return e;
	}

	public boolean borrowBook(String id){
	for(int i=0; i<Books.length; i++){
		if(Books[i] != null && Books[i].getId().equals(id)){
			if(Books[i].getQuantity() > 0){
				Books[i].setQuantity(Books[i].getQuantity() - 1);
				System.out.println("Book borrowed successfully.");
				return true;
			}
			else{
				System.out.println("Book not available.");
				return false;
			}
		}
	}
	System.out.println("Book ID not found.");
	return false;
}

	
	public void showAll(){
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				Books[i].showAllDetails();
			}
		}
	}
	public String getAllBookAsString(){
		String s = "";
		for(int i=0;i<Books.length;i++){
			if(Books[i] != null){
				s+=Books[i].getBookAsString()+"\n";
			}
		}
		return s;
	}


	
	public Books [] getAllBooksAsArray(){
		return Books;
	}
}