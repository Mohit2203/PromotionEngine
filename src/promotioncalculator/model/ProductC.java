package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.List;

public class ProductC extends Product {
    @Override
    public BigDecimal getTotalPrice(String id, List<ProductOrder> productOrders) {
        BigDecimal price = new BigDecimal(0);
        for (ProductOrder order : productOrders) {
            if (order.getSkuIDsOfOrder().equalsIgnoreCase(id) && order.getQuantityOrder() >= 1) {
                int skuC = order.getQuantityOrder();
                skuC = skuC * 20;
                price = BigDecimal.valueOf(skuC);
            }
        }
        return price;
    }

}