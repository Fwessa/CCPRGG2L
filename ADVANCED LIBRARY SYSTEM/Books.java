// Luisa T. Dala
// INF224

public class Books {

  String title;
	String author;
	String bookNumber;
	int copies;
	
	public Books(String bookNumber, String title, String author, int copies){

		this.bookNumber = bookNumber;
		this.title = title ;
		this.author = author;
		this.copies = copies;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}

	public String getBookNumber() {
        return bookNumber;
    }
    
    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

}
