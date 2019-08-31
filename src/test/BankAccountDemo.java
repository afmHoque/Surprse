package test;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount accDhruba = new BankAccount();
        accDhruba.printInfo();

        accDhruba.accountHolderName = "Dhruba Saha";
        accDhruba.accountNumber = "Che123";
        accDhruba.amount = 0.0;
        accDhruba.printInfo();

        BankAccount accHoque = new BankAccount();

        accHoque.accountHolderName = "Afm Hoque";
        accHoque.accountNumber = " Che007";
        accHoque.amount = 500.0;
        accHoque.printInfo();

    }
}