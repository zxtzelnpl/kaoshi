package q2016autumn;

public class test {
    public static void main(String[] args){
        Invoice t = new Invoice();
        Invoice ticket;
        ticket = new FootDecorator(new HeadDecorator(t));         // (4)
        ticket.printInvoice();
        System.out.println("----------------");
        ticket = new FootDecorator(new HeadDecorator(new Decorator(null)));    // (5)
        ticket.printInvoice();
    }
}
