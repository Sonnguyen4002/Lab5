package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.media.Media;

public class Disc extends Media {

    public Disc(String title, String category, float cost, int length, String director) {
        super(); 
        this.length = length;
        this.director = director;
        this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
    }
	private int length;
    private String director;
    
    
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + "$";
    }

}
