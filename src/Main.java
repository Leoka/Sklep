import java.text.ParseException;

import java.sql.*;
import java.lang.*;

/**
 * Created by Maja on 06.03.2016.
 */

public class Main {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/SHOP";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "adoy";

    public static void main(String[] args) throws ParseException {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        Book ksiazka1 = new Book("Nieznajomy","Harlan Coben","Wydawnictwo Albatros","Sensacja",29.49,100,conn);
        Book ksiazka2 = new Book("Unik", "Chelsea Cain", "Czwarta Strona", "Kryminał", 30.32, 50, conn);
        System.out.println(ksiazka1.toString());
        System.out.println(ksiazka2.toString());
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

