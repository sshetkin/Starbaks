package shop;

import makeCoffee.Barmen;
import makeCoffee.CoffeeMachine;
import peoples.People;

public  class Starbaks {

    private CoffeeMachine coffeeMachine;
    private Barmen barmen;
    private Sklad  sklad;

    public Starbaks(CoffeeMachine coffeeMachine, Barmen barmen, Sklad sklad) {
        this.coffeeMachine = coffeeMachine;
        this.barmen = barmen;
        this.sklad = sklad;
    }

    public void makeCoffee(People people) throws NotEnoughExeptoin {
        if (sklad.ostatki(people.coffee)) {

            if (people.canPay()) {
                sklad.takeResorces(people.coffee);
                if (coffeeMachine.isWorking()) {
                    coffeeMachine.maceCoffee(people.coffee, people.name);
                } else barmen.maceCoffee(people.coffee, people.name);
            } else System.out.println(people.name + " - dont have enough money!");

        } else throw new NotEnoughExeptoin();
    }
}
