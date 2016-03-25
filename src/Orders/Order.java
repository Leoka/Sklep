package Orders;

import Products.Product;

/**
 * Created by emajgra on 3/24/2016.
 */
public class Order {
    static int nextId = 1;
    private int orderID;
    private orderStatus status;
    private ShoppingCart shoppingCart;
    private double sum;

    public Order() {
        this.orderID = nextId;
        nextId++;
        this.status = orderStatus.PENDING;
        this.shoppingCart = new ShoppingCart();
        this.sum = 0;
    }

    public void statusChange () {
        this.status = this.status.next();
        if (this.status == orderStatus.COMPLETED){
            this.sum = shoppingCart.getSum();
        }
    }

    public orderStatus getStatus() {
        return status;
    }

    public void addToBasket (Product p) {

        shoppingCart.addingProduct(p);

    }
}
