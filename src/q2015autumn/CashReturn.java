package q2015autumn;

public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;
    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    public double acceptCash(double money){
        double result = money;
        if(money >= moneyCondition){
            result = money - Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
