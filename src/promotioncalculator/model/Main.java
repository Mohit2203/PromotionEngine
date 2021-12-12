package promotioncalculator.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // map.put("A", 3);
        //  map.put("B", 5);
        // map.put("C", 2);
        map.put("D", 2);

        ProcessingOrder order = new ProcessingOrder();
        BigDecimal totalOrderCost = order.getTotalOrderCost(map);
        System.out.println("Value of Items" + totalOrderCost);
    }
}
