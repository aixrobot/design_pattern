package headfirst.chain.checkauthority;

public class VicePresidentPPower extends PurchasePower{
    
    protected double getAllowable(){
        return BASE*40;
    }

    protected String getRole(){
        return "Vice President";
    }
}
