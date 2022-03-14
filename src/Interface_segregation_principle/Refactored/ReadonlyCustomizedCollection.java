package Interface_segregation_principle.Refactored;

import Interface_segregation_principle.ICollection;

public class ReadonlyCustomizedCollection implements IReadonlyCollection {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void elementAt() {

    }
}
