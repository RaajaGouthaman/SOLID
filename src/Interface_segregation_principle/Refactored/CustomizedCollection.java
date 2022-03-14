package Interface_segregation_principle.Refactored;

import Interface_segregation_principle.Refactored.ICollection;

public class CustomizedCollection implements ICollection,IReadonlyCollection {
    @Override
    public void add() {

    }

    @Override
    public void addElementAt() {

    }

    @Override
    public void removeElementAt() {

    }

    @Override
    public void removeLastElement() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void elementAt() {

    }
}
