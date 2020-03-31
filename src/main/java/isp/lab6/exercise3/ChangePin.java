package isp.lab6.exercise3;

public class ChangePin extends  Transaction{
    public String oldPin;

    public String newPin;

    public ChangePin( String oldPin, String newPin){
        this.oldPin=oldPin;
        this.newPin=newPin;
    }

    @Override
    public String execute() {
        if(oldPin.equals(account.getCard().getPin())){
            System.out.println("Pin OK!");
            account.getCard().setPin(newPin);
            return "Pin changed!";
        }
        return "Wrong pin!";
    }
}
