package coffee;

public class Espresso extends Coffee {
    public Espresso(int coffeeBeans, int water,double price) {
        super(coffeeBeans, water, 0, price);
        super.name = "Espresso";

    }

}
