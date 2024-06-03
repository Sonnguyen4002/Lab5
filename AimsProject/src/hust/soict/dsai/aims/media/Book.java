package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
    public Book(String title, String category, float cost) {
        super();
        this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
    }
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String author) {
	    if (!authors.contains(author)) {
	        authors.add(author);
	    } else {
	        System.out.println("Author is already in the List");
	    }
	}
	public void removeAuthor(String author) {
	    if (authors.contains(author)) {
	        authors.remove(author);
	    } else {
	        System.out.println("Author is not in the List");
	    }
	}
    @Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory() + ": " + getCost() + "$";
    }
	
}
