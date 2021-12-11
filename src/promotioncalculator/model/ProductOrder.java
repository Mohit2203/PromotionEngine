package promotioncalculator.model;

import promotioncalculator.model.Product;

import java.util.List;

public class ProductOrder {

    private Integer quantityOrder;
    private List<Product> products;


    public ProductOrder(Integer quantityOrder, List<Product> products) {
        this.quantityOrder = quantityOrder;
        this.products = products;
    }

    public Integer getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(Integer quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
