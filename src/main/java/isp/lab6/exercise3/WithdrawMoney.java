package isp.lab6.exercise3;

public class WithdrawMoney extends  Transaction{
    public double amount;

    public WithdrawMoney(){
        this.amount=0;
    }

    public WithdrawMoney(double amount) {
        this.amount=amount;
    }

    public double getAmount(){
        return amount;
    }

    /**
     * execute the withdraw transaction
     * set the new account balance
     * @return message that the transaction has been done
     */
    @Override
    public String execute() {
        if(amount<=account.getBalance()){
            account.setBalance((account.getBalance())-amount);
            return "Transaction done! New Balance"+account.getBalance()+"";
        }
        else
            return "Not enough money!";
    }
}
