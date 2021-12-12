package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.List;

public class ProductCAndD extends Product {

    @Override
    public BigDecimal getTotalPrice(String id, List<ProductOrder> productOrders) {
        BigDecimal price =new BigDecimal(0);
        for (ProductOrder order : productOrders) {
            if (order.getSkuIDsOfOrder().equalsIgnoreCase(id) && order.getQuantityOrder() > 0 ) {
                int skuC = order.getQuantityOrder();
                int skuD = order.getQuantityOrder();
                if (skuC > 0 && skuD > 0) {
                    if (skuC == skuD) {
                        skuC = 0;
                        skuD = skuC+ (skuD * 30);
                        price = BigDecimal.valueOf(skuD);
                    }
                    }else if (skuC > skuD) {
                        int difference = skuC - skuD;
                        skuC = difference * 20;
                        skuD = skuD * 30;
                        skuD = (skuC+skuD);
                        price= BigDecimal.valueOf(skuD);
                    } else {
                        if (skuC < skuD) {
                            int difference = skuD - skuC;
                            skuC = 0;
                            skuD = (skuC + 30) + (difference * 15);
                            price = BigDecimal.valueOf(skuD);
                        }
                    }

            }
        }
        return price;
    }
}