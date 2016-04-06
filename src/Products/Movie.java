import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by emajgra on 4/5/2016.
 */
public class Movie extends Product {
    static int nextId = 3000;
    int id;
    private double price;
    private String name;
    private String title;
    private GregorianCalendar releasedDate;
    private Format format;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private int amount;

    public Movie(double price, String title, Format format, int dayOfReleased, int mothOfReleased, int yearOfReleased, int amount) {
        this.id = nextId;
        nextId++;
        this.price = price;
        this.name = title;
        this.title = title;
        this.format = format;
        this.releasedDate = new GregorianCalendar(yearOfReleased, mothOfReleased-1, dayOfReleased);
        this.amount = amount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void getFullDescription() {
        System.out.println("Title: \t\t\t" + this.title);
        System.out.println("Price: \t\t\t" + this.price);
        System.out.println("Released date: \t" + sdf.format(releasedDate.getTime()));
        System.out.println("Format: \t\t" + format.toString());
        System.out.println("----------------------------------------------------------------");
    }
}
