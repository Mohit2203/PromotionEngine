package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.Map;

public class ProcessingOrder {


    public BigDecimal getTotalOrderCost(Map<String, Integer> order) {
        BigDecimal costOrder = new BigDecimal(0);
        if (order.containsKey("A")) {
            costOrder = costOrder.add(new ProductA().getTotalPrice(order));
        }
        if (order.containsKey("B")) {
            costOrder = costOrder.add(new ProductB().getTotalPrice(order));
        }
        if (order.containsKey("C") || order.containsKey("D")) {
            costOrder = costOrder.add(new ProductCAndD().getTotalPrice(order));
        }
        return costOrder;
    }
}
