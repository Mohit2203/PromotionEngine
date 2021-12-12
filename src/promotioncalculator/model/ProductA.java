package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.Map;

public class ProductA extends Product {


    @Override
    public BigDecimal getTotalPrice(Map<String, Integer> productOrders) {
        int quotient;
        int remainder;
        BigDecimal price;
        int quantity = productOrders.get("A");
        if (quantity > 2) {
            quotient = quantity / 3;
            remainder = quantity % 3;
            int priceValue = (quotient * 130) + ((remainder) * 50);
            price = BigDecimal.valueOf(priceValue);
        } else {
            price = new BigDecimal(50);
        }
        return price;
    }
}
