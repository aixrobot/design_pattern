package headfirst.chain.checkauthority;

public class PresidentPPower extends PurchasePower{
    protected double getAllowable(){
        return BASE*60;
    }

    protected String getRole(){
        return "President";
    }
}
