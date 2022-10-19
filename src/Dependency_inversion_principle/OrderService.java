package Dependency_inversion_principle;

public class OrderService {

    public void getOrder(){
      DbService dbService = new DbService();

      dbService.getOrder();
    }
}
