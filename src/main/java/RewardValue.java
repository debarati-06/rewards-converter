public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cash;
    private int miles;
    public RewardValue(double cash){
        if(cash < 0) {
            throw new IllegalArgumentException("Cash value must be positive");
        }
        this.cash = cash;
    }
    public RewardValue(int miles){
        if(miles < 0) {
            throw new IllegalArgumentException("Miles value must be positive");
        }
        this.miles = miles;
    }
    Double getCashValue(){
            return cash + miles*0.0035;
    }
    int getMilesValue() {
            return (int)  (miles + cash/0.0035);
    }
}