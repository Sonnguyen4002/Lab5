package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
	public int MAX_NUMBER = 20;
	private List<Media> itemsOrdered = new ArrayList<>();;



    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added to the cart.");
        } else {
            System.out.println(media.getTitle() + " is already in the cart.");
        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println(media.getTitle() + " has been removed from the cart.");
        } else {
            System.out.println(media.getTitle() + " is not in the cart.");
        }
    }
	public void unlimited_number() {
		this.MAX_NUMBER = Integer.MAX_VALUE;
	}

    public void displayCart() {
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
    }
	public float totalCost() {
		float total_cost = 0;
		for (Media disk : this.itemsOrdered) {
			total_cost += disk.getCost();
		}
		return total_cost;
	}
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
	
}
