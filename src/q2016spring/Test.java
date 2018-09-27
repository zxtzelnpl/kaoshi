package q2016spring;

class Test {
    public static void main(String[] args){
        Address addr = new Address();
        DutchAddress addrAdapter = new DutchAddressAdapter(addr);   // (5）
        System.out.println("\n The DutchAddress\n");
        testDutch(addrAdapter);
    }

    static void testDutch(DutchAddress addr){
        addr.straat();
        addr.postcode();
        addr.plaats();
    }
}
