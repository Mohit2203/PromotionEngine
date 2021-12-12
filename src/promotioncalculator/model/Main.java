package promotioncalculator.model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductA a = new ProductA();

        ProductOrder productOrders = new ProductOrder(7,"A");

        List<ProductOrder> productOrderList = new ArrayList<>();
        productOrderList.add(productOrders);
        System.out.println("Value"+a.getTotalPrice("A",productOrderList));

        ProductB b = new ProductB();

        ProductOrder productOrdersB = new ProductOrder(5,"B");

        List<ProductOrder> productOrderListB = new ArrayList<>();
        productOrderListB.add(productOrdersB);
        System.out.println("Value of B"+b.getTotalPrice("B",productOrderListB));

        ProductC c = new ProductC();

        ProductOrder productOrdersC = new ProductOrder(5,"C");

        List<ProductOrder> productOrderListC = new ArrayList<>();
        productOrderListC.add(productOrdersC);
        System.out.println("Value of C"+c.getTotalPrice("C",productOrderListC));
    }
}
