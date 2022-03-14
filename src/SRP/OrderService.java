package SRP;

import java.util.List;

public class OrderService {

    public String createOrder(){
        this.logOrderDetails(1);
        return  "order";
    }

    public Object getOrder(){
     return  null;
    }

    public List<Object> getAllOrder(){
        return null;
    }

    private void logOrderDetails(int orderId){
      System.out.println("Order Id"+orderId);
    }
}
