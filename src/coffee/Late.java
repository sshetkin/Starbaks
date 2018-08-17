package coffee;

public class Late extends Coffee {
    public Late(int coffeeBeans, int water, int milk, double price) {

        super(coffeeBeans, water, milk, price);
        super.name = "Late";
    }
}
