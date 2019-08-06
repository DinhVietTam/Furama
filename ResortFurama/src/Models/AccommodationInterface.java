package Models;

public interface AccommodationInterface {
    public static final int PRICE_ONEDATE = 10;
    public float getCostFinal();
    public int getNumberDateStayInResort(int money);
    public void paymentMoneyByVisaCard();
    public void paymentMoneyByMasterCard();
}
