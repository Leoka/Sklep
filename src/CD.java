import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Maja on 06.03.2016.
 */
public class CD implements Product {
    private double price;
    private String name;
    private String title;
    private String artist;
    //TODO: Repair Released date
    GregorianCalendar releasedDate;
    public CD(double price, String name, String artist ,int yearOfReleased,int MothOfReleased,int DayOfReleased) {
        this.price = price;
        this.name = name;
        this.title = name;
        this.artist = artist;
        this.releasedDate = new GregorianCalendar(yearOfReleased, MothOfReleased, DayOfReleased);
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
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("price: " +  price + '\n' + "artist: " + artist + '\n' + "title: " + title + "Released date: " + releasedDate);
        System.out.println("---------------------------------------------------------------------------");
    }
}
