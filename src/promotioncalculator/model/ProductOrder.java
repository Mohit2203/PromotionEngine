package promotioncalculator.model;

public class ProductOrder {

    private Integer quantityOrder;
    public String skuIDsOfOrder;

    public ProductOrder(Integer quantityOrder, String skuIDsOfOrder) {
        this.quantityOrder = quantityOrder;
        this.skuIDsOfOrder = skuIDsOfOrder;
    }

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
