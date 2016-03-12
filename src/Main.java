/**
 * Created by Maja on 06.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Book ksiazka = new Book(12.99, "Hobbit", "J. R. R. Tolkien");
        CD plyta = new CD(39.99, "Podróż zwana życiem", "O.S.T.R.", 2016, 2, 3);
        System.out.println(plyta.getReleasedDate());
        System.out.println(ksiazka.getName());
        System.out.println(ksiazka.getPrice());
        ksiazka.getFullDescription();
        plyta.getFullDescription();
        ShoppingCart koszyk = new ShoppingCart();

        koszyk.addingProduct(ksiazka);
        koszyk.addingProduct(plyta);
        koszyk.getListOfProducts();
        System.out.println(koszyk.getSum());
        koszyk.addingProduct(plyta);
        koszyk.getListOfProducts();
        System.out.println(koszyk.getSum());
        koszyk.removingProduct(plyta);
        koszyk.getListOfProducts();
        System.out.println(koszyk.getSum());
        koszyk.removingProduct(ksiazka);
        koszyk.getListOfProducts();
    }
}
