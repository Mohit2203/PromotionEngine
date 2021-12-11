package promotioncalculator;

import promotioncalculator.model.ProductOrder;

import java.util.List;

public class Cart {

    public Integer cartID;

    List<ProductOrder> productOrders;

    public Integer getCartID() {
        return cartID;
    }

    public void setCartID(Integer cartID) {
        this.cartID = cartID;
    }

    public List<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(List<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }
}
