/**
 * Created by emajgra on 3/24/2016.
 */
public class Order {
    static int nextId;
    int orderID;
    orderStatus status;
    ShoppingCart shoppingCart;
    public void statusChange () {
        this.status = this.status.next();
    }
}
