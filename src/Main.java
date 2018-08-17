import coffee.Americano;
import coffee.Espresso;
import coffee.Late;
import makeCoffee.Barmen;
import makeCoffee.CoffeeMachine;
import shop.NotEnoughExeptoin;
import shop.Sklad;
import shop.Starbaks;
import peoples.People;
import peoples.Wallet;

public class Main {
    public static void main (String args []) {

        People[] people = {new People("Ivan", new Americano(10, 100, 25), new Wallet(10.0, 100.0)),
                            new People("Serg", new Late(10, 100, 100, 35), new Wallet(1.0, 10.0)),
                            new People("Zam", new Espresso(10, 30, 20), new Wallet(40.0, 1000.0))};


        CoffeeMachine coffeeMachine = new CoffeeMachine(2);
        Barmen barmen = new Barmen();
        Sklad sklad = new Sklad(100, 500, 300, 100);
        Starbaks starbaks = new Starbaks(coffeeMachine, barmen, sklad);

        for (People man : people) {
            try {
                starbaks.makeCoffee(man);
            } catch (NotEnoughExeptoin notEnoughExeptoin) {
                System.out.println("Not enough resources!");
                break;
            }
        }
    }
}
