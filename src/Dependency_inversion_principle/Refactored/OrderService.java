package Dependency_inversion_principle.Refactored;

import Dependency_inversion_principle.DbService;

public class OrderService {
    private  IDbService dbService;

    OrderService(IDbService dbService){
       this.dbService = dbService;
    }
    public void getOrder(){
      this.dbService.getOrder();
    }
}
