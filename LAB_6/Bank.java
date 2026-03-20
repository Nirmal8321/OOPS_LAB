// LAB_6 Q5 - deposit and withdraw
public class Bank {
    double deposit(double amount, double balance) {
        return amount + balance;
    }
    double withdraw(double amount, double balance) {
        if (balance >= amount) return balance - amount;
        return 0;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        double bal = 1000;
        bal = b.deposit(500, bal);
        System.out.println("After deposit: " + bal);
        bal = b.withdraw(300, bal);
        System.out.println("After withdraw: " + bal);
        System.out.println("Withdraw 2000: " + b.withdraw(2000, bal));
    }
}
