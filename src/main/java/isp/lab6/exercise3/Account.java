package isp.lab6.exercise3;

public class Account {
    private Card card;
    private String owner;
    private double balance;

    public Account(Card card,String owner,double balance){
        this.card=card;
        this.owner=owner;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance){
        this.balance=newBalance;
    }

    public Card getCard() {
        return card;
    }

    public String getOwner() {
        return owner;
    }
}
