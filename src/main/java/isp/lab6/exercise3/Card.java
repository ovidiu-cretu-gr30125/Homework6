package isp.lab6.exercise3;

public class Card {
    private String cardId;
    private String pin;

    public Card(String cardId,String pin){
        this.cardId=cardId;
        this.pin=pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCardId(){
        return cardId;
    }

    public String getPin(){
        return pin;
    }
}
