public class OrderProcessor {

    private final PaymentService paymentService;

    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String placeOrder(String account, double amount) {
        boolean success = paymentService.processPayment(account, amount);
        return success ? "ORDER_SUCCESS" : "ORDER_FAILED";
    }
}
