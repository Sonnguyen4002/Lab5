package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.*;
import java.util.Scanner;

public class Aims {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Store store = new Store();
    private static final Cart cart = new Cart();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        int choice = getUserChoice();
        processMainMenuChoice(choice);
    }

    public static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void processMainMenuChoice(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Exiting the application...");
                break;
            case 1:
                viewStore();
                break;
            case 2:
                updateStore();
                break;
            case 3:
                seeCurrentCart();
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                showMenu();
        }
    }

    public static void viewStore() {
        store.displayStore();
        storeMenu();
    }

    public static void updateStore() {
        System.out.println("Update store functionality is not implemented yet.");
        showMenu();
    }

    public static void seeCurrentCart() {
        cart.displayCart();
        cartMenu();
    }

    public static void storeMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        int choice = getUserChoice();
        processStoreMenuChoice(choice);
    }

    public static void processStoreMenuChoice(int choice) {
        switch (choice) {
            case 0:
                showMenu();
                break;
            case 1:
                seeMediaDetails();
                break;
            case 2:
                addMediaToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                seeCurrentCart();
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                storeMenu();
        }
    }

    public static void seeMediaDetails() {
        System.out.println("See media details functionality is not implemented yet.");
        storeMenu();
    }

    public static void addMediaToCart() {
        System.out.println("Add media to cart functionality is not implemented yet.");
        storeMenu();
    }

    public static void playMedia() {
        System.out.println("Play media functionality is not implemented yet.");
        storeMenu();
    }

    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
        int choice = getUserChoice();
        processCartMenuChoice(choice);
    }

    public static void processCartMenuChoice(int choice) {
        switch (choice) {
            case 0:
                storeMenu();
                break;
            case 1:
                filterMediasInCart();
                break;
            case 2:
                sortMediasInCart();
                break;
            case 3:
                removeMediaFromCart();
                break;
            case 4:
                playMediaFromCart();
                break;
            case 5:
                placeOrder();
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                cartMenu();
        }
    }

    public static void filterMediasInCart() {
        // Implement filter medias in cart functionality
        System.out.println("Filter medias in cart functionality is not implemented yet.");
        cartMenu();
    }

    public static void sortMediasInCart() {
        // Implement sort medias in cart functionality
        System.out.println("Sort medias in cart functionality is not implemented yet.");
        cartMenu();
    }

    public static void removeMediaFromCart() {
        // Implement remove media from cart functionality
        System.out.println("Remove media from cart functionality is not implemented yet.");
        cartMenu();
    }

    public static void playMediaFromCart() {
        // Implement play media from cart functionality
        System.out.println("Play media from cart functionality is not implemented yet.");
        cartMenu();
    }

    public static void placeOrder() {
        // Implement place order functionality
        System.out.println("Place order functionality is not implemented yet.");
        cartMenu();
    }
}
