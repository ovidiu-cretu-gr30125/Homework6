package isp.lab6.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Card[] card = new Card[10];
        for(int i=0;i<10;i++){
            card[i]= new Card("000"+i,"50"+i);
        }
        Account[] account = new Account[10];
        for(int i=0;i<10;i++){
            account[i] = new Account(card[i],"Owner"+i,10*i);
        }
        Bank bank = new Bank(account);

        ATM atm = new ATM(bank,card[0]);

        atm.insertCard(card[0],"500");

        atm.checkMoney();

        atm.withdraw(200);

        atm.changePin("500","400");

    }
}
