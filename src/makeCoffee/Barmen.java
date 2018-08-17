package makeCoffee;

import coffee.Coffee;

public class Barmen implements MakeCoffee {
    @Override
    public void maceCoffee(Coffee coffee, String name) {
        System.out.println("Barmen : Is coffee - "+ coffee.getName() + "-" + name);
    }
}
