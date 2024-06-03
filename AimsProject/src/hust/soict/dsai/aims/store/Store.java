package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.List;

import java.util.ArrayList;
import hust.soict.dsai.aims.cart.Cart;
public class Store {
    private List<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }


    public void addMedia(Media media) {
        itemsInStore.add(media);
    }
    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }     
    public void displayStore() {
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }
}
