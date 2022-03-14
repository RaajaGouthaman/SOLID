package Liskov_substitution_principle;

public class DeliveryProcessor {
    public void process(){
        BookDelivery delivery = new SoftCopyDelivery();
        delivery.getDeliveryLocations();
    }
}
