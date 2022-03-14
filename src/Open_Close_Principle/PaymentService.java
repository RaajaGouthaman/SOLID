package Open_Close_Principle;

public class PaymentService {
     private NetBankingPaymentService netBankingPaymentService;

    public String payUsingNetBanking(){
      return this.netBankingPaymentService.makePayment();
    }
}
