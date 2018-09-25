package q2016autumn;

public class HeadDecorator extends Decorator{
    public HeadDecorator(Invoice t) {
        super(t);
    }

    @Override
    public void printInvoice() {
        System.out.println("This is the header of the invoice!");
        ticket.printInvoice();   //(2)
    }
}
