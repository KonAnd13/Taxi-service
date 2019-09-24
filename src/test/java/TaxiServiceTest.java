import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    void orderCost() {
        int km_1 = 10; // order amount less than 1000.
        int km_2 = 50; // the order amount is more than 1000, but the discount amount is less than 100.
        int km_3 = 100; // the order amount is more than 1000 and the discount amount is more than 100.

        TaxiService taxiService = new TaxiService();
        int orderCost_1 = taxiService.orderCost(km_1);
        int orderCost_2 = taxiService.orderCost(km_2);
        int orderCost_3 = taxiService.orderCost(km_3);
        assertEquals(260, orderCost_1);
        assertEquals(1007, orderCost_2);
        assertEquals(1960, orderCost_3);
    }
}