package makeCoffee;

import coffee.Coffee;
import shop.Sklad;

public  class CoffeeMachine implements MakeCoffee {

    int maxCountStacan;
    int countStacan = 0;

    public CoffeeMachine(int maxCountStacan) {
        maxCountStacan = maxCountStacan;
    }

    public boolean isWorking(){
        if (countStacan <= maxCountStacan) {
            return  true;
        } else return false;
    }

    @Override
    public void maceCoffee(Coffee coffee, String name) {
        countStacan ++;
        System.out.println("CoffeeMachine : Is coffee - "+ coffee.getName() + "-" + name);
    }
}
