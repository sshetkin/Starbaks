package shop;

import coffee.Coffee;

public class Sklad {
    int coffeeBeansCount;
    int milkCount;
    int waterCount;
    int stacan;

    public Sklad(int coffeeBeansCount, int milkCount, int waterCount, int stacan) {
        this.coffeeBeansCount = coffeeBeansCount;
        this.milkCount = milkCount;
        this.waterCount = waterCount;
        this.stacan = stacan;
    }
    public int getCoffeeBeansCount() {
        return coffeeBeansCount;
    }

    public int getMilkCount() {
        return milkCount;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public int getStacan() {
        return stacan;
    }

    public boolean ostatki(Coffee coffee){

        if (coffeeBeansCount < coffee.getCoffeeBeans()) {
            return  false;
        }else if (milkCount < coffee.getMilk()){
            return  false;
        }else if (waterCount < coffee.getWater()){
            return  false;
        }else if (stacan < 1){
            return  false;
        } else return true;


    }

    public void takeResorces (Coffee coffee){
        coffeeBeansCount = coffeeBeansCount - coffee.getCoffeeBeans();
        waterCount-= coffee.getWater();
        milkCount-= coffee.getMilk();
        stacan--;
    }

}
