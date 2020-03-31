package isp.lab6.exercise3;

public class CheckMoney extends  Transaction{
    public Account account;

    public CheckMoney(Account account){
        this.account=account;
    }

    public double getAccountBalance(Account account){
        return account.getBalance();
    }

    @Override
    public String execute() {
        return "CheckMoney{"+getAccountBalance(account)+"}";
    }
}
