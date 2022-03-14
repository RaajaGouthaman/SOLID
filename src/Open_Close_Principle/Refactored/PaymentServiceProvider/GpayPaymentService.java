package Open_Close_Principle.Refactored.PaymentServiceProvider;

public class GpayPaymentService implements IPaymentServiceProvider {
    @Override
    public String makePayment() {
        return "Gpay Payment Successful";
    }
}
