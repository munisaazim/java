import java.text.DecimalFormat;
import java.util.*;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public void CaseStudy1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two digits");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int gcd=0;
        int counter = 1;
        while(counter<numberOne && counter<numberTwo){
            if(numberOne%counter==0 && numberTwo%counter==0){
                gcd = counter;
            }
            counter++;
        }
        System.out.println("The greatest common divisor for " + numberOne + " " + numberTwo + " is " + gcd);
    }
    public void CaseStudy2(){
        double tuition = 10000;
        int year = 0;
        while(tuition<20000.0){
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("The year(s) need(s): " + year);
    }
    public void CaseStudy3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to check palindrome or no");
        String word= input.nextLine();
        int length = word.length() -1;
        int low = 0;
        boolean check = true;
        while(low<length){
            if(word.charAt(low)!=word.charAt(length)){
                check = false;
                break;
            }
            low++;
            length--;
        }
        if(check){
            System.out.println("The word is Palindrome");
        }
        else{
            System.out.println("The word is not Palindrome");
        }
    }
    public void CaseStudy4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        double number = input.nextDouble();
        boolean answer = true;
        for(int i = 2; i<number; i++){
            if(number%i==0.0){
                answer = false;
                //System.out.println(i);
                break;
            }
        }
        if(answer){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
    }
    public void CaseStudy5(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        int number = input.nextInt();
        int positive=0, negative=0, sum=0, avg=0, counter=0;
        while (number!=0){
            if(number>=1){
                positive++;
            } else {
                negative++;
            }
            counter++;
            number = input.nextInt();
        }
        sum = positive+negative+1;
        avg=sum/counter;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + sum);
        System.out.println("The average is " +avg);
    }
    public void Task3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        double number = input.nextDouble();
        double pound = 2.2;
        System.out.println("Kilograms -> Pounds");
        for(int i = 1; i<number; i++){
            System.out.print (i + " ");
            System.out.println(i*pound);
        }
    }
    public void Task4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        double number = input.nextDouble();
        double km = 1.609;
        System.out.println("Miles\tKilometers");
        for (int i = 1; i<=number;i++){
            System.out.println(i + "\t\t" + i * km);
        }
    }
    public void Task5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number kg");
        double kg = input.nextDouble();
        double pound = 2.2;
        System.out.println("Kilograms\tPounds\t|\tPounds Kilograms");
        for(int i = 1; i<=kg; i++){
            System.out.println(i + "\t\t\t" +  df.format(i * pound) + "\t|\t" + df.format(i * pound )+ "\t" + i);
        }
    }
    public void Task6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number in miles");
        double miles = input.nextDouble();
        double km = 1.609;
        System.out.println("Miles\tKilometers\t|\tKilometers Miles");
        for(int i = 1; i<=miles; i++){
            System.out.println(i + "\t\t\t" +  df.format(i * km) + "\t|\t" + df.format(i * miles )+ "\t" + i);
        }
    }
    public void Task7(){
        double input = 10000;
        double increase = 1.5;
        double result=0, tuitution=0;
        System.out.println("First year tuitition " + (input + (input * increase)));
            result = (input + (input * 1.5))*10;
        tuitution = result;
        System.out.println("Tuition for 10 years " + result);
            tuitution = tuitution * 1.5 * 4;
        System.out.println("Tuition for 10 years " + tuitution);
    }
    public void Task8(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int number = input.nextInt();
        String highestName= " ";
        int finalScore =0;
        for(int i = 0; i<number; i++){
            System.out.print(
                    "Student: " + (i + 1) +
                            "\n   Name: ");
            String name = input.next();
            System.out.print(
                    "   Score: ");
            int score = input.nextInt();
            if(score>finalScore){
                finalScore = score;
                highestName = name;
            }
        }
        System.out.println("Highest score  name: " + highestName + " score: " + finalScore);

    }
    public void Task9(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int number = input.nextInt();
        String highestName =" ", littleName =" ";
        int finalScore = 0, beforeFinalScore = 0;
        for(int i = 0; i<number; i++){
            System.out.print("Student " + i + "\n" + "Name: ");
            String name = input.next();
            System.out.print(" Score: ");
            int point = input.nextInt();
            if(i==0){
                highestName = name;
                finalScore = point;
            }
            else if(i==1 && point>finalScore){
                beforeFinalScore = finalScore;
                littleName = highestName;
                finalScore = point;
                highestName =name;
            }
            else if (i==1) {
                beforeFinalScore = point;
                littleName = name;
            }
            else if(i>0 && point >beforeFinalScore && point>finalScore){
               beforeFinalScore = finalScore;
               littleName = highestName;
               finalScore = point;
               highestName = name;
            }
            else if (i > 0 && point >beforeFinalScore) {
                beforeFinalScore = point;
                littleName = name;
            }
        }
        System.out.println("The first highest scored student " + highestName + " point: " + finalScore);
        System.out.println("The second highest score student: " + littleName + " point: " + beforeFinalScore);
    }
    public void Task10(){
        int counter = 0;
        for(int i = 100; i<=1000; i++){
            if(i%5==0 && i%6==0){
                System.out.print(i + " ");
                counter++;
            }
            if(counter==10){
                System.out.print("\n");
            }
        }
    }
    public void Task11(){
        int counter = 0;
        for(int i = 100; i<=200; i++){
            if(i%5==0 || i%6==0){
                System.out.print(i+ " ");
                counter++;
            }
            if(counter==10){
                System.out.println();
            }
        }
    }
    public void Task12(){
        for(int i = 1;;i++){
            if(Math.pow(i,2)>12000){
                System.out.println(i);
                break;
            }
        }
    }
    public void Task13() {
        int num= 0;
        for (int i = 0; i < 12000; i++) {
            if (Math.pow(i, 3) > 12000) {
                num++;
            }

        }
        System.out.println(num);
    }
    public void Task14(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        int numOne = input.nextInt();
        System.out.println("Enter number2");
        int numTwo = input.nextInt();
        int small =0;
        int GCD = 0;
        if(numOne>numTwo){
            small = numTwo;
        }
        else if(numTwo>numOne){
            small = numOne;
        }
        for(int i =1; i<=small; i++){
            if(numOne%i==0 && numTwo%i==0){
                if(i>GCD){
                    GCD = i;
                }
            }
        }
        System.out.println("GCD for these numbers: " + GCD);
    }
    public void Task16(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        for(int i =1; i<number; i++){
            if(number%i==0){
                System.out.print(i + " ");
            }
        }
    }
    public void Task17(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();
        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
    public void Task18A(){
        System.out.println("Pattern A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
    public void Task18B(){
        System.out.println("Pattern B");
        for (int r = 6; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public void Task18C(){
        int numberOfLines = 6;
        System.out.println("Pattern C");
        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int col = rows; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public void Task18D(){
        System.out.println("Pattern D");
        for (int rows = 0; rows < 6; rows++) {				// Print rows
            for (int ws = 0; ws < rows; ws++) {				// Print white space
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - rows; col++) {	// Print numbers
                System.out.print((col + 1) + " ");
            }
            System.out.println();								// Print newline
        }
    }
    public void Task19(){
        int startRight = 0,endSpace = 7;
        for (int row = 1; row <= 128; row += row) {

            for (int startSpace = 0; startSpace < endSpace; startSpace++) {
                System.out.print("    ");
            }
            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }
            for (int r = startRight; r > 0 ; r /= 2 ) {
                System.out.printf("%4d", (r));
            }
            System.out.println();
            endSpace--;
            startRight = row;
        }
    }
    public void Task20(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loan amount");
        int loan = input.nextInt();
        System.out.println("Enter number of years");
        int year = input.nextInt();
        double i = 0, monthylPayment= 0,totalPayment=0, monthlyInterestRate=0;
        System.out.println("Interest Rate\tMonthly Payment\t\t\t\tTotal Payment");
        for(i = 5; i<=8; i+=0.125){
            System.out.print(i + "%\t\t\t");
            monthlyInterestRate = i/1200;
            monthylPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
            totalPayment = monthylPayment * year *12;
            System.out.println(monthylPayment + "\t\t\t" + totalPayment + "\t\t\t\t");
        }
    }
    public void Task22(){
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.println("Number of Years: ");
        double yearAmount = input.nextDouble();
        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount * monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, yearAmount*12));
        double totalPayment = monthlyPayment * yearAmount *12;
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
        double balance = loanAmount, principal,interest;
        System.out.println("Payment\tInterest\t\t\t\tPrincipal\t\t\t\tBalance");
        for (int i = 1; i <= yearAmount * 12; i++)
        {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
        }
    }
    public void Task23(){
        double number = 50000;
        double sum = 0;
        double i;
        for(i=1;i<=number; i++) {
            double num = 1/i;
            sum = sum + num;
            System.out.println(sum);
        }
        System.out.println("The answer: " + sum);
    }
    public void Task24(){
        double upNumber = 97;
        double downNumber = 95;
        double sum = 0 ;
        for(int i = 1; i<=upNumber; i++){
            for (int j = 3; j<=downNumber; j++){
                sum = sum +(upNumber/downNumber);
            }
        }
        System.out.println("The sum: " + sum);
    }
    public void Task25(){
        double numOne = 10000;
        double sum = 0;
        for(double i =1; i<=(2*numOne - 1); i+=2){
            sum +=1/i;
            i=i+2;
            sum-=1/i;
        }
        System.out.println(sum);
        double pi = 4 * sum;
        System.out.println("PI for 10000: " + pi);
        double numTwo = 20000;
        sum = 0;
        for(double j = 1; j<=(2*numTwo);j+=2){
            sum+=1/j;
            j+=2;
            sum-=1/j;
        }
        pi = 4 * sum;
        System.out.println("PI for 20000: " + pi);
        double numThree = 100000;
        sum = 0;
        for(double i =1; i<=(2*numThree-1); i++){
            sum+=1/i;
            i+=2;
            sum-=1/i;
        }
        pi = 4 * sum;
        System.out.println("PI for 100000: " + pi);
    }
    public void Task27(){
        int counter = 0;
        for(int i = 101; i<=2100;i++){
            if(i%4==0) {
                System.out.print(i + " ");
                counter++;
            }
            if(counter==10){
                System.out.println();
                counter=0;
            }
        }
    }
    public void Task30(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate");
        double annualRate = input.nextDouble();
        System.out.println("Enter number of month");
        double numberMonth = input.nextDouble();
        double monthInterestRate = (annualRate/100)/12;
        double monthCalculatedRate = amount * (1+monthInterestRate);
        System.out.println("The value in account: " + monthCalculatedRate);
        for(int i = 2; i<=numberMonth; i++){
            monthCalculatedRate = (amount + monthCalculatedRate) * (1+monthInterestRate);
        }
        System.out.println("The value in account: " + monthCalculatedRate);

    }
    public void Task31(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = input.nextDouble();
        System.out.println("Enter annual percent");
        double annualPercent = input.nextDouble();
        System.out.println("Enter month");
        double month = input.nextDouble();
        System.out.println("Month\tCD value");
        double monthCalculateRate = amount + (amount * annualPercent)/1200;
        System.out.println("1\t\t" + monthCalculateRate);
       for(int i = 2; i<=month; i++){
           monthCalculateRate = monthCalculateRate + (monthCalculateRate*annualPercent)/1200;
           System.out.println(i + "\t\t" + monthCalculateRate);
       }
    }
    public static void main(String[] args) {
        Main object = new Main();
        object.Task31();
    }
}