package Open_Close_Principle.Refactored;


import Open_Close_Principle.Refactored.PaymentServiceProvider.IPaymentServiceProvider;

public class PaymentService {
    private IPaymentServiceProvider paymentService;

    public String payBill(){
        return this.paymentService.makePayment();
    }
}
