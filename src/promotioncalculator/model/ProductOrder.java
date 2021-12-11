package promotioncalculator.model;

import promotioncalculator.model.Product;

import java.util.List;

public class ProductOrder {

    private Integer quantityOrder;
    public String skuIDsOfOrder;

    public String getSkuIDsOfOrder() {
        return skuIDsOfOrder;
    }

    public void setSkuIDsOfOrder(String skuIDsOfOrder) {
        this.skuIDsOfOrder = skuIDsOfOrder;
    }

    public Integer getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(Integer quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

}
