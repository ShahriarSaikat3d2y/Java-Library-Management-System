package Entity;

public class Books{
    private String id;
    private String title;
    private String author;
    private String publishedYear;
    private String rating;
    private String genre;
    private  int quantity;


    public Books(String title, String id, String author, String publishedYear, String genre, String rating,int quantity){
        setTitle(title);
        setId(id);
        setauthor(author);
        setPublishedYear(publishedYear);
        setGenre(genre);
        setRating(rating);
        setQuantity(quantity);
    }

    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

    public void setauthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }

    public void setPublishedYear(String publishedYear){
        this.publishedYear=publishedYear;
    }
    public String getPublishedYear(){
        return publishedYear;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setRating(String rating){
        this.rating=rating;
    }
    public String getRating(){
        return rating;
    }

    public void includeBooks(int number){
        quantity = quantity + number; 
    }
    public void sellBooks(int number){
        quantity = quantity - number;
    }

    public void borrowBook(){
        quantity--;
    }
    public void returnBook(){
        quantity++;
    }



    public void showAllDetails(){
		System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor() );
        System.out.println("Published Year : " + getPublishedYear() );
        System.out.println("Rating : " +getRating() );
        
	}
	
	public String getBookAsString(){
		return "---------------------------------------" +"\n"+
		"Book's Title: " + getTitle()+"\n"+
        "Book's ID: " + getId()+"\n"+
        "Author: " + getAuthor()+"\n"+
        "Published Year : " + getPublishedYear()+"\n"+
        "Book's Genre: " + getGenre()+"\n"+
        "Rating : " +getRating() +"\n"+
        "Book's Quantity: " + getQuantity()+"\n"+
		"---------------------------------------" +"\n";
	}



}