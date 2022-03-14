package Open_Close_Principle.Refactored.PaymentServiceProvider;

public class NetBankingPaymentService implements IPaymentServiceProvider{
    @Override
    public String makePayment() {
        return "Net Banking payment successful";
    }
}
