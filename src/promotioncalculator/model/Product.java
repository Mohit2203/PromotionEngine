package promotioncalculator.model;

public abstract class Product {

    private Integer skuIDs;

    private Float price;

    private String skuName;

    public abstract Integer getTotalPrice(Integer skuIDs, Float price);

    public Integer getSkuIDs() {
        return skuIDs;
    }

    public void setSkuIDs(Integer skuIDs) {
        this.skuIDs = skuIDs;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
}
