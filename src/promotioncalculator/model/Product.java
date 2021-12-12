package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.List;

public abstract class Product {

    private String skuIDs;

    private BigDecimal price;

    List<ProductOrder> productOrders;

    public abstract BigDecimal getTotalPrice(String skuIDs, List<ProductOrder> productOrders );

    public BigDecimal  getPrice() {
        return price;
    }

    public void setPrice(BigDecimal  price) {
        this.price = price;
    }

    public String getSkuIDs() {
        return skuIDs;
    }

    public void setSkuIDs(String skuIDs) {
        this.skuIDs = skuIDs;
    }
   /* public Product(String id)
    {
        this.skuIDs = id;
        switch (id)
        {
            case "A":
                this.price = 50f;

                break;
            case "B":
                this.price = 30f;

                break;
            case "C":
                this.price = 20f;

                break;
            case "D":
                this.price = 15f;
                break;
        }
    }*/

}
