import java.util.Date;

public class Drink extends Product {
    private double volumeDrink;


    public Drink(String name, double cost, double volumeDrink) {
        super(name, cost);
        this.volumeDrink = volumeDrink;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format("  объем %.2f л.", volumeDrink));
        return localString.toString();
    }
}
