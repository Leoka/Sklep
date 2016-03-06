/**
 * Created by Maja on 06.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Book ksiazka = new Book(12.99, "Hobbit", "J. R. R. Tolkien");
        CD plyta = new CD(39.99, "Podróż zwana życiem", "O.S.T.R.", 2016, 2, 3);
        System.out.println(plyta.getReleasedDate());
        System.out.println(ksiazka.getName());
        System.out.println(ksiazka.getPrice());
        ksiazka.getFullDescription();
        plyta.getFullDescription();
    }
}
