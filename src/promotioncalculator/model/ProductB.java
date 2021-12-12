package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ProductB extends Product {

    @Override
    public BigDecimal getTotalPrice(Map<String, Integer> productOrders) {
        int quotient;
        int remainder;
        BigDecimal price = new BigDecimal(0);
        int quantity = productOrders.get("B");
        if (quantity > 2) {
            quotient = quantity / 2;
            remainder = quantity % 2;

            int priceValue = (quotient * 45) + ((remainder) * 30);
            price = BigDecimal.valueOf(priceValue);
        } else {
            price = new BigDecimal(30);
        }
        return price;
    }
}

