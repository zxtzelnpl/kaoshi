package q2016autumn;

public class FootDecorator extends Decorator{
    public FootDecorator(Invoice t) {
        super(t);
    }

    @Override
    public void printInvoice() {
        ticket.printInvoice();   //(3)
        System.out.println("This is the footnote  of the invoice!");
    }
}
