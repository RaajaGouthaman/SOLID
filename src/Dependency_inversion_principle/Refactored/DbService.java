package Dependency_inversion_principle.Refactored;

public class DbService implements IDbService {

    public String getOrder(){
        return "order";
    }
}
