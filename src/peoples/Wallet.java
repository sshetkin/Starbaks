package peoples;

public class Wallet {
    double cash;
    double card;

    public Wallet(double cash, double card) {
        this.cash = cash;
        this.card = card;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCard() {
        return card;
    }

    public void setCard(double card) {
        this.card = card;
    }
}
