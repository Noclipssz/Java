package Package;

import java.util.Scanner;

public class ClassBanc {
    private int account;
    private String name;
    private double balance;

    Scanner sc = new Scanner(System.in);
    public void MainAplication() {
        createAccount();
        deposit();
        withdraw();
    }
    public void createAccount() {
        System.out.print("Enter account number: ");
        setAccount(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter name: ");
        setName(sc.nextLine());
        System.out.print("Is there initial deposit? ( y / n )");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Enter deposit amount: ");
            setBalance(sc.nextDouble());
        }
        System.out.println(" Account : " + getAccount() + " Holder: " + getName() + " Balance: $ " + getBalance());
    }
    public void deposit(){
        System.out.print("Enter deposit amount: ");
        setBalance((balance + sc.nextDouble()));
        System.out.println(" Update account balance ");
        System.out.println(" Account : " + getAccount() + " Holder: " + getName() + " Balance: $ " + getBalance());
    }
    public void withdraw(){
        System.out.print("Enter withdraw amount: ");
        setBalance((balance - sc.nextDouble()) - 5);
        System.out.println(" Update account balance ");
        System.out.println(" Account : " + getAccount() + " Holder: " + getName() + " Balance: $ " + getBalance());
    }
    private int getAccount() {
        return account;
    }
    private void setAccount(int account) {
        this.account = account;
    }
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private double getBalance() {
        return balance;
    }
    private void setBalance(double balance) {
        this.balance = balance;
    }

}
