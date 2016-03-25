package Orders;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maja on 12.03.2016.
 */
public class ShoppingCart {

    private List<Product> productList;
    private double sum;

    public ShoppingCart (){
        this.productList = new ArrayList<Product>();
        this.sum = 0;
    }

    public void addingProduct(Product newProduct){
        this.productList.add(newProduct);
        this.sum = this.sum + newProduct.getPrice();
    }

    public void removingProduct(Product removedProduct) {
        this.productList.remove(removedProduct);
        this.sum = this.sum - removedProduct.getPrice();
    }

    public double getSum () {
        return this.sum;
    }

    public void getListOfProducts () {
        for (int i = 0; i < this.productList.size(); i++) {
            System.out.println(this.productList.get(i).getName());
            System.out.println("cena:" + this.productList.get(i).getPrice());
        }
    }
}
