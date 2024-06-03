package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
public class StoreTest {
    public static void main(String[] args) {
    Store my_store = new Store();
    DigitalVideoDisc disk4 = new DigitalVideoDisc("tite4", "category4", "director4", 40.0f, 50);
    my_store.addMedia(disk4);
    
    my_store.removeMedia(disk4);
    }
}
