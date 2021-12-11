package promotioncalculator.model;

public abstract class Product {

    private String skuIDs;

    public String getSkuIDs() {
        return skuIDs;
    }

    public void setSkuIDs(String skuIDs) {
        this.skuIDs = skuIDs;
    }

    private Float price;


    public abstract Float getTotalPrice(Float price, String skuIDs );

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


}
