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
        for (int i =1; i<=10; i++){
            result = input * 1.5;
        }

        tuitution = result;
        for(int i = 1; i<=4; i++){
            tuitution = tuitution * 1.5;
        }
    }
    public static void main(String[] args) {
        Main object = new Main();
//        object.CaseStudy4();
        object.Task7();
    }
}