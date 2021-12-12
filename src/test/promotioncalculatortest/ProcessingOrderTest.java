package test.promotioncalculatortest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import promotioncalculator.model.ProcessingOrder;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class ProcessingOrderTest {
    ProcessingOrder order = new ProcessingOrder();
    Map<String, Integer> map = new HashMap<>();

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("before class");
    }

    @Before
    public void setUp() {
        System.out.println("before");
    }

    @Test
    public void testScenario1() {

        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);
        BigDecimal totalOrderCost = order.getTotalOrderCost(map);
        assertEquals(100, totalOrderCost.intValue());
    }

    @Test
    public void testScenario2() {
        map.put("A", 5);
        map.put("B", 5);
        map.put("C", 1);
        BigDecimal totalOrderCost = order.getTotalOrderCost(map);
        assertEquals(370, totalOrderCost.intValue());
    }

    @Test
    public void testScenario3() {
        map.put("A", 3);
        map.put("B", 5);
        map.put("C", 1);
        map.put("D", 1);
        BigDecimal totalOrderCost = order.getTotalOrderCost(map);
        assertEquals(280, totalOrderCost.intValue());
    }

    @After
    public void tearDown() {
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("after class");
    }
}
