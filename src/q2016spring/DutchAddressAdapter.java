package q2016spring;

public class DutchAddressAdapter extends DutchAddress {
    private Address address; //(1)
    public DutchAddressAdapter(Address addr){
        address = addr;
    }

    public void straat(){
        address.street();   //(2)
    }

    public void postcode(){
        address.zip();      //(3)
    }

    public void plaats(){
        address.city();     //(4)
    }
}
