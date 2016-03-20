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
    int amount;
    String category;

    public Book(String title, String author, String publisher, String category, double price, int amount, Connection conn) {
        ResultSet rs = null;
        String sql = null;
        PreparedStatement ps = null;
        int count = 0;
        String queryCheck = "SELECT COUNT(*) from books where id=" + nextId;
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
        try {
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            count = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (count == 0) {
            this.id = nextId;
            nextId += 1;
            System.out.println("Adding book to database...");
            sql = "INSERT INTO books VALUES(" + id + "," + price + ",'" + author + "','" + title + "','" + publisher + "','" + category + "'," + amount + ");";
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
        else if(count ==1){

            // TODO Wrong ID when updating amount.
            this.price = price;
            this.name = title;
            this.author = author;
            this.title = title;
            this.publisher = publisher;
            this.category = category;
            this.amount = amount;

            System.out.println("Record is already existing. Changing amount...");
            sql = "SELECT amount from books WHERE id=" + nextId + ";";
            int previousAmount = 0;
            try {
                rs = stmt.executeQuery(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                previousAmount = rs.getInt(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            amount = previousAmount + amount;
            sql = "UPDATE books SET amount = " + amount + " WHERE id=" + nextId + ";";
            try {
                stmt.executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Amount changed. Amount is now = " + amount);

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
