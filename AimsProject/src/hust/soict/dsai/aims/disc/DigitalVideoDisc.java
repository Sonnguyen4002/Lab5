package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	//	overload
	public DigitalVideoDisc(String title) {
		super(title, "", 0, 0, "");
		this.setTitle(title);
		nbDigitalVideoDiscs ++;
		this.setId(nbDigitalVideoDiscs);
	};
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost, 0, "");
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		nbDigitalVideoDiscs ++;
		this.setId(nbDigitalVideoDiscs);
	};
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost, 0, director);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.setDirector(director);
		nbDigitalVideoDiscs ++;
		this.setId(nbDigitalVideoDiscs);
	};
	public DigitalVideoDisc(String title, String category, String director, float cost, int length) {
		super(title, category,cost, length, director );
		nbDigitalVideoDiscs ++;
		this.setId(nbDigitalVideoDiscs);
	};
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
		
	}
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + "$";
    }
    

}
