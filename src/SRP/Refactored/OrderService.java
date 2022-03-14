package SRP.Refactored;

import java.util.List;

public class OrderService {
    private SRP.Refactored.LoggerService loggerService;

    public OrderService(SRP.Refactored.LoggerService loggerService){
        this.loggerService = loggerService;
    }

    public String createOrder(){
        this.loggerService.LogOrderDetails(1);
        return  "order";
    }

    public Object getOrder(){
        return  null;
    }

    public List<Object> getAllOrder(){
        return null;
    }
}
