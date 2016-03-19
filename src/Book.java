import java.sql.*;

/**
 * Created by Maja on 06.03.2016.
 */
public class Book extends Product {
    static int nextId = 1;
    int id;
    double price;
    String name;
    String author;
    String title;
    String publisher;
    String category;
    int amount;



    public Book(String title, String author, String publisher, String category, double price, int amount, Connection conn) {
        ResultSet rs = null;
        String sql = null;
        PreparedStatement ps = null;
        String queryCheck = "SELECT * from books where id=" + id;
        try {
            ps = conn.prepareStatement(queryCheck);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            rs = stmt.executeQuery(queryCheck);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(rs);
        if (rs != null) {
            this.id = nextId;
            nextId += 1;
            System.out.println("Adding book to database...");
            sql = "INSERT INTO books VALUES(" + id + "," + price + ",'" + author + "','" + title + "','" + publisher + "','" + category + "'," + amount + ");";
            System.out.println(sql);
            try {
                stmt.executeUpdate(sql);
                System.out.println("Book added.");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                System.out.println(rs);
            }

            this.price = price;
            this.name = title;
            this.author = author;
            this.title = title;
            this.publisher = publisher;
            this.category = category;
            this.amount = amount;
        }
        else {
            System.out.println("Record is already existing. Changing amount...");
            this.amount = this.amount + amount;
            sql = "UPDATE books SET amount = " + this.amount + "WHERE id=" + id;
            try {
                stmt.executeQuery(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Amount changed. amount = " + amount);

        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}
