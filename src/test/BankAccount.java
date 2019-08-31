package test;

public class BankAccount {


    public String accountNumber;
    public String accountHolderName;
    public double amount;
    private double dipAmount;

    public BankAccount() {

        this.accountNumber = "";
        this.accountHolderName = "Empty Name";
        this.amount = 100.0;

    }

    public void withdrow(double withdrowAmount) {
        double currentBal = this.amount - withdrowAmount;
        System.out.println(" You Withdrow :" + withdrowAmount);
        System.out.println("Current Balance:" + currentBal);

    }

    public void diposit(double dipAmount) {
        double currentBal = this.amount - dipAmount;
        System.out.println("You diposit :" + dipAmount);
        System.out.println("Current Balance :" + currentBal);

    }

    public void printInfo() {
        System.out.println("\n\n Name :" + this.accountHolderName);
        System.out.println(" Account Number :" + this.accountNumber);
        System.out.println("Current Ballance :" + this.amount);

    }

}



