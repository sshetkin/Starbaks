package coffee;

public class Coffee {

    int coffeeBeans;
    int water;
    int milk;
    double price;

    String name;

    public Coffee(int coffeeBeans, int water, int milk, double price) {
        this.coffeeBeans = coffeeBeans;
        this.water = water;
        this.milk = milk;
        this.price = price;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getWater() {
        return water;
    }

    public double getPrice() {
        return price;
    }

    public int getMilk() {
        return milk;
    }

    public String getName(){
        return name;
    }

}

