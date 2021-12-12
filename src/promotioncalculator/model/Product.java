package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.Map;

public abstract class Product {
    public abstract BigDecimal getTotalPrice(Map<String, Integer> productOrders);

}
