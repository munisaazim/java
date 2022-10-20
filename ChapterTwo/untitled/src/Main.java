
import java.time.Year;
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
    public void Task1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter celcius degree: ");
        double celcius = input.nextDouble();
        double farenheit = (9.0/5.0) * celcius + 32.0;
        System.out.println("In farenheit: " + farenheit);
    }
    public void Task2(){
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter length of cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area: " + area);
        System.out.println("The volume: " + volume);
    }
    public void Task3(){
        final double FOOT = 0.305;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter feet number: ");
        double feet = input.nextDouble();
        double toMeter = feet * FOOT;
        System.out.println("Conversion feet to meter: " + toMeter);
    }
    public void Task4(){
        final double POUND = 0.454;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * POUND;
        System.out.println("Entered pounds in kilogram: " + kilograms);

    }
    public void Task5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("Enter gratitude: ");
        double gratuity = input.nextDouble();
        double gratuitySolution = subtotal * gratuity /100;
        double subtotalSolution = gratuitySolution + subtotal;
        System.out.println("Gratuity: " + gratuitySolution + "\n" + "Subtotal: " + subtotalSolution);
    }
    public void Task6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number in range 0-1000");
        double number = input.nextDouble();
        if (number / 10 > 9 && number / 10 < 100) {
            double remainOne = number % 10;
            double state = number / 10;
            double remainTwo = state % 10;
            int stateTwo = (int) (state / 10);
            int total = (int) (remainOne + remainTwo + stateTwo);
            System.out.println("Sum of all digits: " + total);
        } else if (number / 10 > 0 && number < 10) {
            double remaineOne = number % 10;
            int state = (int) (remaineOne / 10);
            int total = (int) (remaineOne + state);
            System.out.println("Sum of all digits " + total);
        } else {
            System.out.println("Incorrect input, sorry((");
        }
    }
        public void Task7(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter minutes");
            double minutes = input.nextDouble();
            double hours = minutes /60;
            double day = hours/24;
            int totalYear = (int)(day/365);
            int totalDay = (int)(day%365);
            System.out.println(minutes + " = " + totalYear + " years " + totalDay + " days");

    }
        public void Task9(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1, t");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double acc = (v1 - v0) /t;
        System.out.println("The average acceleration: " + acc);
    }
        public void Task10(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms:");
        double weight = input.nextDouble();
        System.out.println("Enter the initial temperature:");
        double initTemperature = input.nextDouble();
        System.out.println("Enter the final temperature:");
        double finalTemperature = input.nextDouble();
        double result = weight * (finalTemperature - initTemperature) * 4184;
        System.out.println("The energy needed is " + result);
    }
        public void Task11(){
            double yearSecond = 365 * 86400;
            double birth = yearSecond / 7.0;
            double death = yearSecond / 13.0;
            double migrate = yearSecond / 45.0;
            double allCalculationOneYear = ((yearSecond * 7)  - death) + migrate;
            int allCalculationFiveYear = (int)(allCalculationOneYear * 5);
            System.out.println("Calculation of possible population for following 5 years: " + allCalculationFiveYear);
    }
        public void Task12(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (speed * speed)/(2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);
    }
        public void Task13(){
            Scanner input = new Scanner(System.in);
            System.out.println("Add your savings: ");
            double savings = input.nextDouble();
            double annualInterest = 5 /savings;
            //System.out.println("annual" + annualInterest);
            double monthInterestRate = annualInterest /12;
            double firstMonth = 100 * (1 + monthInterestRate);
            //System.out.println("firstmonth" + firstMonth);
            double secondMonth = (100 + firstMonth) * (1 + monthInterestRate);
            double thirdMonth = (100 + secondMonth) * (1 + monthInterestRate);
            double fourthMonth = (100 + thirdMonth) * (1 + monthInterestRate);
            double fifthMonth = (100 + fourthMonth) * (1 + monthInterestRate);
            double sixthMonth = (100 + fifthMonth) * (1 + monthInterestRate);
            //double seventhMonth = (100 + sixthMonth) * (1 + monthInterestRate);
            System.out.println("After the sixth month, the account value is $" + sixthMonth);
    }
        public void Task14(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight(pounds)");
        double pound = input.nextDouble();
        System.out.println("Enter height(inches)");
        double inch = input.nextDouble();
        double kilogramm = pound * 0.45359237;
        double meters = inch * 0.0254;
        double BMI = kilogramm / (meters * meters);
        System.out.println("BMI: " + BMI);
    }
    public void Task15(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Neter x2 and y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x = (x2-x1) * (x2 - x1);
        double y = (y2 - y1) * (y2 - y1);
        double sum = x + y;
        double distance = Math.pow(sum, 0.5);
        System.out.println("The distance between the two points is " + distance);
    }
    public void Task16(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side");
        double side = input.nextDouble();
        double area = (3 * Math.pow(3, 0.5)/2) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + area);
    }
    public void Task17(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour");
        double speed = input.nextDouble();
        double solution = ((35.74 + (0.625 * temperature)) - (35.75 * (Math.pow(speed, 0.16))) + (0.4275 * temperature * (Math.pow(speed, 0.16))));
        System.out.println("The wind chill index is " + solution);
    }
    public static void main(String[] args) {
        Main object = new Main();
        object.Task17();
    }
}