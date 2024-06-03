package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", "jungle1", 10);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", "Cinderella1",20);

        swap(jungleDVD,cinderellaDVD);
        System.out.println(jungleDVD.getTitle());
        System.out.println(jungleDVD.getCategory());
        System.out.println(jungleDVD.getCost());


    }
     public static void swap(Object o1, Object o2) {
         Object tmp = o1;
         o1 = o2;
         o2 = tmp;
     }
     public static void changeTitle(DigitalVideoDisc dvd, String title) {
         String oldTitle = dvd.getTitle();
         dvd.setTitle(title);
         dvd = new DigitalVideoDisc(oldTitle);
     }
     
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tmpTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmpTitle);
        if (dvd1.getCategory() != null) {
        String tmpCategory = dvd1.getCategory();
        dvd1.setCategory(dvd2.getCategory());
        dvd2.setCategory(tmpCategory);
        }
        if (dvd1.getDirector() != null) {
        String tmpDirector = dvd1.getDirector();
        dvd1.setDirector(dvd2.getDirector());
        dvd2.setDirector(tmpDirector);
        }
        if (dvd1.getCost() != 0){
        float tmpCost = dvd1.getCost();
        dvd1.setCost(dvd2.getCost());
        dvd2.setCost(tmpCost);
        }
        if (dvd1.getLength() != 0.0) {
        int tmpLength = dvd1.getLength();
        dvd1.setLength(dvd2.getLength());
        dvd2.setLength(tmpLength);
        }
    }
}
