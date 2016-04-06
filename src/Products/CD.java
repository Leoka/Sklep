package Products;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by Maja on 06.03.2016.
 */
public class CD extends Product {
    private double price;
    private String name;
    private String title;
    private String artist;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private GregorianCalendar releasedDate;
    private int amount;
    
    public CD(String title, String artist, double price, String category, int yearOfReleased, int mothOfReleased, int dayOfReleased, int amount) {
        this.id = nextId;
        nextId++;
        this.price = price;
        this.name = title;
        this.title = title;
        this.artist = artist;
        this.category = category;
        this.releasedDate = new GregorianCalendar(yearOfReleased, mothOfReleased-1, dayOfReleased );
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public GregorianCalendar getReleasedDate() {
        return releasedDate;
    }
    
    public void getFullDescription() {
        System.out.println("Title: \t\t\t" + this.title);
        System.out.println("Artist: \t\t" + this.artist);
        System.out.println("Price: \t\t\t" + this.price);
        System.out.println("Category: \t\t" + this.category);
        System.out.println("Released date: \t" + sdf.format(releasedDate.getTime()));
        System.out.println("----------------------------------------------------------------");
    }
}
}
