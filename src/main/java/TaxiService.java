public class TaxiService {
    private int landingCost = 60;
    private int costOfOneKm = 20;
    private int amountForDiscount = 1000;
    private int discount = 5;
    private int maxDiscountAmount = 100;

    int orderCost(int km) {
        int total = landingCost + costOfOneKm * km;
        if (total > amountForDiscount) {
            double discountAmount = total / 100.0 * discount;
            if (discountAmount < maxDiscountAmount)
                total -= discountAmount;
            else
                total -= maxDiscountAmount;
        }
        return total;
    }
}
