package q2015autumn;

public class CashContext {
    private CashSuper cs;
    private TYPE t;
    public CashContext(TYPE t){
        switch (t){
            case NORMAL:
                cs = new CashNormal();          //(2)
                break;
            case CASH_DISCOUNT:
                cs = new CashDiscount(.8);//(3)
                break;
            case CASH_RETURN:
                cs = new CashReturn(300,80);//(3)
                break;
        }
    }
    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
