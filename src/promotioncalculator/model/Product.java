package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public abstract class Product {

    private String skuIDs;

    private BigDecimal price;


    public abstract BigDecimal getTotalPrice(Map<String, Integer> productOrders);

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSkuIDs() {
        return skuIDs;
    }

    public void setSkuIDs(String skuIDs) {
        this.skuIDs = skuIDs;
    }


}
