public abstract class BankAccount {
    public static void main(String[] args) {

    }
    public abstract double interestRate();
}

class fixedAccount extends BankAccount {
    public double interestRate(){
        return 10.1;
    }
}

class currentAccount extends BankAccount {
    public double interestRate(){
        return 7.8;
    }
}



