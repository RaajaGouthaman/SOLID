package Liskov_substitution_principle;

public class SoftCopyDelivery extends BookDelivery{
    @Override
    void getDeliveryLocations() {
        throw new UnsupportedOperationException("Delivery address not required for soft copy");
    }
}
