package coffee;

public class Americano extends Coffee {
    public Americano(int coffeeBeans, int water, double price) {

        super(coffeeBeans, water, 0, price);
        super.name = "Americano";
    }

}
