package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductA extends Product{



    @Override
    public BigDecimal getTotalPrice(String id, List<ProductOrder> productOrders) {
        int quotient;
        int remainder;
        BigDecimal price = new BigDecimal(0);
        for (ProductOrder order : productOrders) {
            if (order.getSkuIDsOfOrder().equalsIgnoreCase(id) && order.getQuantityOrder() > 2) {
                quotient = order.getQuantityOrder() / 3;
                remainder = order.getQuantityOrder() % 3;

                int priceValue = (quotient * 130) + ((remainder) * 50);
                price = BigDecimal.valueOf(priceValue);
            }
            else{
                price=new BigDecimal(50);
            }
        }
        return price;
    }
}
