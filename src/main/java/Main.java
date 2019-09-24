public class Main {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        int orderCost = taxiService.orderCost(80);
        System.out.println(orderCost);
    }
}
