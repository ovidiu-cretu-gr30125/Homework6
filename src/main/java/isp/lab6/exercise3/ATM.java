package isp.lab6.exercise3;

public class ATM {
    private Bank bank;
    private Card card;

    public ATM(Bank bank,Card card){
        this.bank=bank;
        this.card=card;
        bank.addCard(card);
    }

    /**
     * change pin for the current card
     * @param oldPin old pin of the card, this is going to be changed
     * @param newPin new pin to change the old one
     */
    public void changePin(String oldPin,String newPin){
        if(this.card!=null) {
            Transaction transaction;
            transaction = new ChangePin(oldPin, newPin);
            transaction.account=bank.getAccountByCardId(this.card.getCardId());
            System.out.println(transaction.execute());
            System.out.println(bank.executeTransaction(transaction));
        }
        else
            System.out.println("Card is null!");
    }

    /**
     * withdraw money from your bank account
     * @param amount the amount of money you withdraw from account
     */
    public void withdraw(double amount ){
        if(this.card!=null){
            Transaction transaction = new WithdrawMoney(amount);
            transaction.account=bank.getAccountByCardId(this.card.getCardId());
            System.out.println(transaction.execute());
            System.out.println(bank.executeTransaction(transaction));
        }
        else
            System.out.println("Card is null!");
    }

    /**
     * check the balance of your account assigned to the card
     */
    public void checkMoney(){
        if(this.card!=null){
            Transaction transaction;
            transaction = new CheckMoney(bank.getAccountByCardId(this.card.getCardId()));
            System.out.println(transaction.execute());
            System.out.println(bank.executeTransaction(transaction));
        }
        else
            System.out.println("Card is null!");
    }

    /**
     * validate the transactions of the pin introduced is matching with the pin assigned to the card
     * @param card tha card witch you want to make transactions
     * @param pin the pin of the card
     * @return true if the pin matches with the card pin and false if not
     */
    public boolean insertCard(Card card, String pin){
        if(card.getPin().equals(pin)){
            this.card=card;
            System.out.println("Card inserted successfully!");
            return true;
        }
        return false;
    }

    /**
     * remove card from the atm
     */
    public  void removeCard(){
        this.card=null;
    }
}
