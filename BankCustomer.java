import java.util.*;

public class BankCustomer {
    private String fname, lname, address;
    private float bankBalance;
    private long accNumber;
    private String PASSWORD = "AnkurSirOP";


    BankCustomer (String f, String l, String add) {
        fname = f;
        lname = l;
        address = add;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setPassword(String pass, String newPass) {
        if(pass.equals(PASSWORD))
            PASSWORD = newPass;
        else {
            System.out.println("Old password does not match");
        }
    }

    public String getFName() {
        return fname;
    }

    public float checkBalance(String pass) {
        if(pass.equals(PASSWORD))
            return bankBalance;
        else return -1;
    }

    public void deposit(float amount){
        bankBalance += amount;
    }
    
    public void withdraw(float amount){
        if(amount > bankBalance) System.out.println("fraud");
        else {
            System.out.println("Withdrawn " + amount + " rupees");
            bankBalance -= amount;
        }
    }
}