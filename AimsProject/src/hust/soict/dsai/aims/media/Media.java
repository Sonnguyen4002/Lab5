package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.cart.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.cart.MediaComparatorByTitleCost;

import java.util.Comparator;

public abstract class Media {
    int id;
    String title;
    String category;
    float cost;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public float getCost() {
        return cost;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public abstract String toString();
  
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Media media = (Media) obj;
        return title.equals(media.title);
    }
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            int titleComparison = m1.getTitle().compareTo(m2.getTitle());
            if (titleComparison != 0) {
                return titleComparison;
            } else {
                return Float.compare(m2.getCost(), m1.getCost());
            }
        }
    };
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            int costComparison = Float.compare(m2.getCost(), m1.getCost());
            if (costComparison != 0) {
                return costComparison;
            } else {
                return m1.getTitle().compareTo(m2.getTitle());
            }
        }
    };
    
    
}


