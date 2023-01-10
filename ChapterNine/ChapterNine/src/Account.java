import java.util.*;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    Account(){

    }
    Account(int id, int balance){
        this.id = id;
        this.balance = balance;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getId(){
        return this.id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate/100;
    }
    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterest(){
        double sum = balance * ((annualInterestRate/100)/12);
        return sum;
    }
    public double withDraw(){
        double withDraw = balance / 8;
        return withDraw;
    }
    public double deposit(){
        double deposit = balance + 5000;
        return deposit;
    }
}
