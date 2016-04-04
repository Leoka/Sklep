package User;

import Orders.Order;
import Orders.orderStatus;
import Products.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emajgra on 3/24/2016.
 */
public class NormalUser extends User {

    static int nextId = 1;
    int userID;
    private List<Order> orders = new ArrayList<>();
    private boolean isLogin = false;

    public NormalUser(String login, String password) {
        this.userID = nextId;
        nextId++;
        this.login = login;
        this.password = password;
        this.orders.add(new Order());

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

    public boolean isLogin() {
        return isLogin;
    }

    public void addToBasket(Product p) {
        if (this.isLogin == true) {
            int i = orders.size() - 1;
            if (orders.get(i).getStatus() != orderStatus.PENDING) {
                orders.add(new Order());
                orders.get(i).addToBasket(p);
                System.out.println("You have added " + p.getName() + " to your cart.");
            } else {
                orders.get(i).addToBasket(p);
                System.out.println("You have added " + p.getName() + " to your cart.");
            }
        }
        else
            System.out.println("You have to log in before you can buy something.");
    }
}
