import java.util.*;

public class Calculations {
    private double balance;
    Scanner input = new Scanner(System.in);
    int userInput = 0;
    Calculations(){
        this.balance  = 100;
    }
    Calculations(double balance){
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
    public double withDraw(){
        System.out.println("Enter amount");
        userInput = input.nextInt();
        double result = 0;
        result = this.balance - userInput;
        return result;
    }
    public double deposit(){
        return this.balance;
    }
}
