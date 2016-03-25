package User;

import Orders.Order;
import Orders.orderStatus;
import Products.Product;

import java.util.List;

/**
 * Created by emajgra on 3/24/2016.
 */
public class NormalUser extends User {

    static int nextId = 1;
    int userID;
    private List<Order> orders;
    boolean isLogin = false;

    public NormalUser(String login, String password) {
        this.userID = nextId;
        nextId++;
        this.login = login;
        this.password = password;
        Order order = new Order();
        this.orders.add(order);

    }

    public boolean login(String login, String password) {
        if ((login.equals(this.login)) && (password.equals(this.password))){
            this.isLogin = true;
            System.out.println("Successful login for user: " + login);
            return true;
        } else {
            this.isLogin = false;
            System.out.println("Unsuccessful login. Wrong login or password.");
            return false;
        }
    }

    public void addToBasket(Product p) {
        if (this.isLogin == true) {
            int i = orders.lastIndexOf(orders);
            if (orders.get(i).getStatus() != orderStatus.PENDING) {
                orders.add(new Order());
                orders.get(i).addToBasket(p);
            } else {
                orders.get(i).addToBasket(p);
            }
        }
        else
            System.out.println("You have to log in before you can buy something.");
    }
}
