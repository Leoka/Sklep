/**
 * Created by Maja on 06.03.2016.
 */
public class Book implements Product {
    double price;
    String name;
    String author;
    String title;
    public Book(double price, String name, String author ){
        this.price = price;
        this.name = name;
        this.author = author;
        this.title = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public void getFullDescription() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("price: " +  price + '\n' + "author: " + author + '\n' + "title: " + title);
        System.out.println("---------------------------------------------------------------------------");
    }
}
