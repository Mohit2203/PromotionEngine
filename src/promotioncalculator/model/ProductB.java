package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.List;

public class ProductB extends Product {

    @Override
    public BigDecimal getTotalPrice(String id, List<ProductOrder> productOrders) {
        int quotient;
        int remainder;
        BigDecimal price = new BigDecimal(0);
        for (ProductOrder order : productOrders) {
            if (order.getSkuIDsOfOrder().equalsIgnoreCase(id) && order.getQuantityOrder() > 2) {
                quotient = order.getQuantityOrder() / 2;
                remainder = order.getQuantityOrder() % 2;

                int priceValue = (quotient * 45) + ((remainder) * 30);
                price = BigDecimal.valueOf(priceValue);
            } else {
                price = new BigDecimal(30);
            }
        }
        return price;
    }
}

