package q2015autumn;

public class CashDiscount implements CashSuper{
    private double moneyDiscount;
    public CashDiscount(double moneyDiscount){
        this.moneyDiscount = moneyDiscount;
    }
    public double acceptCash(double money){
        return money*moneyDiscount;
    }
}
