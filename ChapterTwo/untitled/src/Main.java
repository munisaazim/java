
import java.util.Scanner;
public class Main {
    public void exampleTwo(){
        final double KILOMETERS_PER_MILE = 1.609;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter kilometer: ");
        double kilometer = input.nextDouble();
        double output = kilometer * KILOMETERS_PER_MILE;
        System.out.println("Kilometer in Mile: " + output);
    }
    public void caseStudy(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value such as 11.58");
        double number = input.nextDouble();
        int cent = (int)(number * 100);
        int dollar = cent / 100;
        double remainingCent = dollar % 100;
        int quarters = (int)(remainingCent/25);
        double remainingQuarters = quarters % 25;
        int dimes = (int)(remainingQuarters/10);
        double remainingDimes = dimes % 10;
        int nickels = (int)(remainingDimes/5);
        double pennies = nickels % 5;
        System.out.println("Balance " + number);
        System.out.println("Dollar: " + dollar);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

    }
    
    public static void main(String[] args) {
        Main object = new Main();
        object.caseStudy();

    }
}