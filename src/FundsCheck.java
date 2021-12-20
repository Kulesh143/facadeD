public class FundsCheck {
    private double cashInAccount=1000.00;
    public double getCashInAccount(){
        return cashInAccount;
    }
    public void decreaseCashInAccount(double cashWithdraw){
        cashInAccount-=cashWithdraw;
    }
    public void increaseCashInAccount(double cashDeposited){
        cashInAccount+=cashDeposited;
    }
    public boolean haveEnoughMoney(double cashToWithdraw){
        if(cashToWithdraw>getCashInAccount()){
            System.out.println("Error: you dont have enough Mopney");
            System.out.println("Current Balance is "+getCashInAccount());
            return false;
        }else{
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal Complete : Current Balance is "+getCashInAccount());
            return true;
        }
    }
    public void makeDeposit(double cahsToDeposit){
        increaseCashInAccount(cahsToDeposit);
        System.out.println("Deposit Complete and Current Balance is "+getCashInAccount());
    }
}
