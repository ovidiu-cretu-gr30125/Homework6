package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    private ArrayList<Card> cards = new ArrayList<Card>();

    /**
     * add the card to the array list of cards
     * @param card
     */
    public void addCard(Card card){
        cards.add(card);
    }

    /**
     * add the accounts to the array list of accounts
     * @param account
     */
    public  Bank(Account[] account){
        Collections.addAll(accounts,account);
    }

    public String executeTransaction(Transaction transaction){
        return "Transaction done! Thank you!";
    }

    /**
     * this method is a getter for the account from card id
     * @param cardId
     * @return the account
     */
    public Account getAccountByCardId(String cardId){
        for(int i=0;i<10;i++) {
            System.out.println(accounts.get(i));
            if (accounts.get(i).getCard().getCardId().equals(cardId)) {
                return accounts.get(i);
            }
        }
        return null;
    }
}
