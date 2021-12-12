package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

public class ProductCAndD extends Product {

    @Override
    public BigDecimal getTotalPrice(Map<String, Integer> productOrders) {
        BigDecimal price = new BigDecimal(0);
        int quantityC = Optional.ofNullable(productOrders.get("C")).orElse(0);
        int quantityD = Optional.ofNullable(productOrders.get("D")).orElse(0);
        int priceC;
        int priceD;
        if (quantityC == quantityD && quantityD > 0) {
            return BigDecimal.valueOf(quantityD * 30);

        } else if (quantityC > quantityD && quantityD > 0) {
            int difference = quantityC - quantityD;
            priceD = (difference * 20) + (quantityD * 30);
            return BigDecimal.valueOf(priceD);
        } else if (quantityD > quantityC && quantityC > 0) {
            int difference = quantityD - quantityC;
            priceC = (30) + (difference * 15);
            return BigDecimal.valueOf(priceC);

        } else {
            priceC = (quantityD * 15) + (quantityC * 20);
            return BigDecimal.valueOf(priceC);
        }

    }
}