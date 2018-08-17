package peoples;

import coffee.*;

public class People {

    public String name;
    public Coffee coffee;
    public Wallet wallet;

    public People(String name, Coffee coffee, Wallet wallet) {
        this.name = name;
        this.coffee = coffee;
        this.wallet = wallet;
    }

    public boolean canPay() {
        if (coffee.getPrice() <= wallet.getCash() ){
            wallet.setCash(wallet.getCash()-coffee.getPrice());
            return true;
        }else if(coffee.getPrice()<= wallet.getCard()){
            wallet.setCard(wallet.getCard()-coffee.getPrice());
            return true;
        } else {
              return false;
        }
    }

}
