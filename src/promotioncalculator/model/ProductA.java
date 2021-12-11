package promotioncalculator.model;

import java.util.ArrayList;
import java.util.List;

public class ProductA extends Product{

    @Override
    public Float getTotalPrice(Float price, String id) {
        List<ProductOrder> productOrders = new ArrayList<>();
        Integer quotient;
        Integer remainder;
        for (ProductOrder order : productOrders) {
            if (order.getSkuIDsOfOrder() == id) {
                quotient = order.getQuantityOrder() / 3;
                remainder = order.getQuantityOrder() % 3;

                Integer priceValue = (quotient * 130) + ((remainder) * 50);
                price = priceValue.floatValue();
            }
        }
        return price;
    }
}
