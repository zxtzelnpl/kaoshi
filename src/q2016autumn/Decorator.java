package q2016autumn;

public class Decorator extends Invoice {
    protected Invoice ticket;

    public Decorator(Invoice t){
        ticket = t;
    }

    @Override
    public void printInvoice() {
        if(ticket!=null){
            ticket.printInvoice();       //(1)
        }
    }
}
