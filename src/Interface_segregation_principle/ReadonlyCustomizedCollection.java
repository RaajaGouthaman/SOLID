package Interface_segregation_principle;

public class ReadonlyCustomizedCollection implements ICollection{
    @Override
    public void add() {
        throw new UnsupportedOperationException("Add elements not supported in readonly collection");
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void elementAt() {

    }
}
