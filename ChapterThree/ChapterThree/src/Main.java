import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;

public class Main {
    public void Example1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for y");
        int y = input.nextInt();
        int x;
        if(y>0){
            x = 1;
            System.out.println("Assigning to x: " + x);
        }
    }
    public void Example2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter payment");
        double payment = input.nextDouble();
        if(payment > 90){
            double add = payment * 0.03;
            payment+=add;
            System.out.println("Payment with addition: " + payment);
        }
        else{
            double subtract = payment * 0.01;
            payment-=subtract;
            System.out.println("Payment with subtraction: " + payment);
        }
        System.out.println(payment);
    }
    public void caseStudy(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight(in pounds):");
        double pounds = input.nextDouble();
        System.out.println("Enter height(in inches):");
        double inch = input.nextDouble();
        double kg = pounds * 0.45359237;
        double meter = inch * 0.0254;
        double BMI_number = kg /(Math.pow(meter,2));
        System.out.println("BMI: " + BMI_number);
        if(BMI_number < 18.5){
            System.out.println("Underweight");
        }
        else if(BMI_number>=18.5 &&BMI_number<25.0){
            System.out.println("Normal");
        }
        else if(BMI_number>=20.5 &&BMI_number<30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
    public void caseStudy2(){
        double tax = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose status (0-single filer, 1-married jointly or qualifying widow(er),\n" +
                "2-married separately, 3-head of household): ");
        int status = input.nextInt();
        System.out.println("Enter income: ");
        double income = input.nextDouble();
        if(status == 0){
            if(income > 0 && income<=8350){
                tax = income * 0.10;
            }
            else if(income > 8351 && income <= 33950) {
                tax = income * 0.25;
            }
            else if(income > 33951 && income < 82250){
                tax = income * 0.25;
            }
            else if(income < 82251 && income >= 171550){
                tax = income * 0.28;
            }
            else if(income <171551 && income >= 372950){
                tax = income * 0.33;
            }
            else if(income > 372951){
                tax = income * 0.35;
            }
        }
        else if(status==1){
            if(income > 0 && income<=16700){
                tax = income * 0.10;
            }
            else if(income > 16701 && income <= 67900) {
                tax = income * 0.25;
            }
            else if(income > 67901 && income < 137050){
                tax = income * 0.25;
            }
            else if(income < 137051 && income >= 20850){
                tax = income * 0.28;
            }
            else if(income <20851 && income >= 372950){
                tax = income * 0.33;
            }
            else if(income > 372951){
                tax = income * 0.35;
            }
        }
        else if(status==2){
            if(income > 0 && income<=83500){
                tax = income * 0.10;
            }
            else if(income > 83501 && income <= 33950) {
                tax = income * 0.25;
            }
            else if(income > 33951 && income < 68525){
                tax = income * 0.25;
            }
            else if(income < 68526 && income >= 104425){
                tax = income * 0.28;
            }
            else if(income <104426 && income >= 186475){
                tax = income * 0.33;
            }
            else if(income > 186476){
                tax = income * 0.35;
            }
        }
        else if(status==3){
            if(income > 0 && income<=11950){
                tax = income * 0.10;
            }
            else if(income > 11951 && income <= 45500) {
                tax = income * 0.25;
            }
            else if(income > 45501 && income < 117450){
                tax = income * 0.25;
            }
            else if(income < 117451 && income >= 190200){
                tax = income * 0.28;
            }
            else if(income <190201 && income >= 372950){
                tax = income * 0.33;
            }
            else if(income > 372951){
                tax = income * 0.35;
            }
        }
        else{
            System.out.println("Invalid input");
            System.exit(1);
        }
        System.out.println("The tax: " + tax);
    }
    public void Example3(){
        Scanner input = new Scanner(System.in);
        boolean answer =true;
        System.out.println("Enter number");
        int number = input.nextInt();
        for(int i = 1; i<100; i++){
            if( number==i){
                answer = true;
            }
            else {
                answer = false;
            }
        }
        System.out.println(answer);
    }
    public void caseStudy3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two digit number");
        int userEnter = input.nextInt();
        int guess = (int)(Math.random()*100);
        int userEnter1 = userEnter/100;
        int userEnter2 = userEnter%100;
        int guess1 = guess/100;
        int guess2 = guess%100;
        System.out.println("Lottery number: " + guess);
        if(userEnter==guess){
            System.out.println("The award is $10,000");
        }
        else if(userEnter1==guess1 && userEnter2 ==guess2){
            System.out.println("The award is $3,000");
        }
        else if(userEnter1==guess1 || userEnter2==guess2||
                userEnter1==guess2||userEnter2==guess1){

            System.out.println("The award is $1,000");
        }
        else{
            System.out.println("Incorrect input");
        }

    }
    public void Task1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:");
        double a = input.nextDouble();
        System.out.println("Enter b value");
        double b = input.nextDouble();
        System.out.println("Enter c value");
        double c = input.nextDouble();
        double discreminant = (Math.pow(b,2) - (4*a*c));
        if(discreminant>0){
            double rootOne = ((-1*b)+(Math.pow(discreminant, 0.5)))/(2*a);
            double rootTwo =  ((1*b)+(Math.pow(discreminant, 0.5)))/(2*a);
            System.out.println("Rootone: " + rootOne + " Roottwo: " + rootTwo);

        }
        else if(discreminant==0){
            double root = (-1*b)/(2*a);
            System.out.println("Root: " + root);
        }
        else{
            System.out.println("The equation has no real roots.");
        }
    }
    public void Task4() {
        int input = (int) (Math.random() * 12);
        System.out.println("Generated  number: " + input);
        switch (input) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Incorrect input");
                break;

        }
    }
        public void Task5() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter today's day: ");
            int date = input.nextInt();
            System.out.println("Enter the number of days elapsed since today:");
            int futureDate = input.nextInt();
            int futureDate2 = (int)(futureDate%7);
            switch(date){
                case 0:
                    System.out.print("Today is Sunday and ");
                    break;
                case 1:
                    System.out.print("Today is Monday and ");
                    break;
                case 2:
                    System.out.print("Today is Tuesday and ");
                    break;
                case 3:
                    System.out.print("Today is Wednesday and ");
                    break;
                case 4:
                    System.out.print("Today is Thursday and ");
                    break;
                case 5:
                    System.out.print("Today is Friday and ");
                    break;
                case 6:
                    System.out.print("Today is Saturday and ");
                    break;
            }
            if(futureDate==0||futureDate2==0){
                System.out.print("the future day is Sunday");
            }
            else if(futureDate==1||futureDate2==1){
                System.out.print("the future day is Monday");
            }
            else if(futureDate==2||futureDate2==2){
                System.out.print("the future day is Tuesdday");
            }
            else if(futureDate==3||futureDate2==3){
                System.out.print("the future day is Wednesday");
            }
            else if(futureDate==4 |futureDate2==4){
                System.out.print("the future day is Thursday");
            }
            else if(futureDate==5 |futureDate2==5){
                System.out.print("the future day is Friday");
            }
            else if(futureDate==6 |futureDate2==6){
                System.out.print("the future day is Sunday");
            }
            else{
                System.out.print("No future day");
            }
        }
        public void Task8(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numberOne = input.nextInt();
        System.out.println("Enter number two: ");
        int numberTwo = input.nextInt();
        System.out.println("Enter number three");
        int numberThre = input.nextInt();
        System.out.println("Sorted number:");
        if(numberOne>numberTwo && numberTwo>numberThre){
            System.out.println(numberOne);
            System.out.println(numberTwo);
            System.out.println(numberThre);
        }
        else if(numberOne>numberThre && numberThre>numberTwo){
            System.out.println(numberOne);
            System.out.println(numberThre);
            System.out.println(numberTwo);
        }
        else if(numberOne==numberTwo && numberTwo>numberThre && numberOne>numberThre){
            System.out.println(numberOne);
            System.out.println(numberTwo);
            System.out.println(numberThre);
        }
        else if(numberOne==numberThre && numberThre>numberTwo && numberOne>numberTwo){
            System.out.println(numberOne);
            System.out.println(numberTwo);
            System.out.println(numberThre);
        }
        else if(numberTwo>numberOne && numberOne>numberThre){
                System.out.println(numberTwo);
                System.out.println(numberOne);
                System.out.println(numberThre);
        }
        else if(numberTwo>numberThre && numberThre>numberOne){
                System.out.println(numberTwo);
                System.out.println(numberThre);
                System.out.println(numberOne);
        }
        else if(numberTwo==numberOne && numberOne>numberTwo && numberTwo>numberThre){
                System.out.println(numberTwo);
                System.out.println(numberOne);
                System.out.println(numberThre);
        }
        else if(numberTwo==numberThre && numberThre>numberOne && numberTwo>numberOne){
                System.out.println(numberTwo);
                System.out.println(numberThre);
                System.out.println(numberOne);
        }
        else if(numberThre>numberOne && numberOne>numberTwo){
                System.out.println(numberThre);
                System.out.println(numberOne);
                System.out.println(numberTwo);
        }
        else if(numberThre>numberTwo && numberTwo>numberOne){
                System.out.println(numberThre);
                System.out.println(numberTwo);
                System.out.println(numberOne);
        }
        else if(numberThre==numberTwo && numberTwo>numberOne && numberThre>numberOne){
                System.out.println(numberThre);
                System.out.println(numberTwo);
                System.out.println(numberOne);
        }
        else if(numberThre==numberOne && numberThre>numberTwo && numberThre>numberTwo){
                System.out.println(numberThre);
                System.out.println(numberOne);
                System.out.println(numberTwo);
            }

    }
    public void Task9(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for d1, d2. d3, d4, d5, d6, d7, d8, d9");
        double d1 = input.nextDouble();
        double numberd9 = d1/1000000000;
        double numberd8 = d1/100000000;
        double numberd7 = d1/10000000;
        double numberd6 = d1/1000000;
        double numberd5 = d1/100000;
        double numberd4 = d1/10000;
        double numberd3 = d1/1000;
        double numberd2 = d1/100;
        double numberd1 = d1/10;
        double calculate = (numberd1 *1+numberd2 *2+numberd3 *3+numberd4 *4+numberd5 *5+ numberd6 *6+numberd7 *7+numberd8 *8+numberd9 *9)%11;
        if(calculate == 0){
            System.out.println((int)(d1) + 'X');
        }
        else if(calculate>0 || calculate<0){
            System.out.println((int)(d1) + (int)(calculate));
        }
        else{
            System.out.println("Incorrect input");
        }

    }
    public void Task11(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year and month");
        int year = input.nextInt();
        int month  = input.nextInt();
        boolean leap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        switch (month){
            case 1:
                System.out.println("January has 31 days " + year);
                break;
            case 2:
                if(leap==true){
                    System.out.println("February has 29 days " + year);
                }
                else{
                    System.out.println("February has 28 days " + year);
                }
                break;
            case 3:
                System.out.println("March has 31 days " + year);
                break;
            case 4:
                System.out.println("April has 30 days " + year);
                break;
            case 5:
                System.out.println("May has 31 days " + year);
                break;
            case 6:
                System.out.println("June has 30 days " + year);
                break;
            case 7:
                System.out.println("July has 31 days " + year);
                break;
            case 8:
                System.out.println("August has 31 days " + year);
                break;
            case 9:
                System.out.println("September has 30 days " + year);
                break;
            case 10:
                System.out.println("October has 31 days " + year);
                break;
            case 11:
                System.out.println("November has 30 days " + year);
                break;
            case 12:
                System.out.println("December has 31 days " + year);
                break;
            default:
                System.out.println("Incorrect input");

        }
    }
    public void Task12(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit number");
        int palindrome = input.nextInt();
        int reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = palindrome;

        // get the reverse of originalNum
        // store it in variable
        while (palindrome != 0) {
            remainder = palindrome % 10;
            reversedNum = reversedNum * 10 + remainder;
            palindrome /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
    public void Task14(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        double userInput = input.nextDouble();
        double randomNumber = Math.random();
        if(userInput==randomNumber){
            System.out.println("It is head");
        }
        else{
            System.out.println("It is tail");
        }
    }
    public void Task15(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit number");
        int userInput = input.nextInt();
        int generatedNumber = (int)(Math.random()*1000);
        System.out.println("The lottery number " + generatedNumber);
        int userInput1 = userInput/1000;
        int userInput2 = userInput1/100;
        int userInput3 = userInput2/10;
        int userInput4 = userInput2 %10;
        int generatedNumber1 = generatedNumber/1000;
        int generatedNumber2 = generatedNumber1/100;
        int generatedNumber3 = generatedNumber2/10;
        int generatedNumber4 = generatedNumber3 %10;
        if(userInput==generatedNumber){
            System.out.println("The award is $10,000.");
        }
        else if(userInput1==generatedNumber1 && userInput2==generatedNumber2 && userInput3==generatedNumber3){
            System.out.println("The award is $3,000");
        }
        else if(userInput1==generatedNumber1 || userInput2==generatedNumber2 || userInput3==generatedNumber3){
            System.out.println("The award is $1,000");
        }
    }
    public void Task16(){
        int width = (int)(Math.random() * 100);
        int height = (int)(Math.random()*200);
        System.out.println("(" + width + ", " + height + ")");
    }
    public void Task17(){
        int random = (int)(Math.random()*3);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scissor (0), rock (1), paper (2):");
        int game = input.nextInt();
        if(game==0 &&random==1) {
            System.out.println("The computer is rock. You are scissor. Computer won");
        }
        else if(game==0 &&random==2) {
            System.out.println("The computer is rock. You are paper. Computer won");
        }
        else if(game==0 &&random==0) {
            System.out.println("The computer is rock. You are rock too. It is draw");
        }
        else if(game==1 &&random==2) {
            System.out.println("The computer is scissor. You are paper. Computer won");
        }
        else if(game==1 &&random==1) {
            System.out.println("The computer is scissor. You are scissor too. It is draw");
        }
        else if(game==2 &&random==2) {
            System.out.println("The computer is paper. You are paper too. It is draw");
        }
        else if(random==0 &&game==1) {
            System.out.println("The computer is scissor. You are rock. You won");
        }
        else if(random==0 &&random==2) {
            System.out.println("The computer is paper. You are scissor. You won");
        }
        else if(random==0 &&game==0) {
            System.out.println("The computer is rock. You are rock too.It is draw");
        }
        else if(random==1 &&game==2) {
            System.out.println("The computer is paper. You are scissor. Computer won");
        }
        else if(game==1 &&random==1) {
            System.out.println("The computer is scissor. You are scissor too. It is draw");
        }
    }
    public void Task18(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight");
        int weight = input.nextInt();
        if(weight> 0 && weight<=1){
            System.out.println("The cost will be: 3.5");
        }
        else if(weight>1 && weight<=3){
            System.out.println("The cost will be: 5.5");
        }
        else if(weight>3&& weight<=10){
            System.out.println("The cost will be: 8.5");
        }
        else if(weight>10 && weight<=20){
            System.out.println("The cost will be: 10.5");
        }
        else if(weight>20){
            System.out.println("Unavailable shipping");
        }
        else{
            System.out.println("Incorrect input");
        }
    }
    public void Task19(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter perimeters of edges for triangle");
        int edgeOne = input.nextInt();
        int edgeTwo = input.nextInt();
        int edgeThree= input.nextInt();
        if(edgeOne+edgeTwo>edgeThree){
            System.out.println("Perimeter: " +(edgeOne + edgeTwo+edgeThree));
        }
        else if (edgeOne+edgeTwo>edgeThree) {
            System.out.println("Perimeter: " +(edgeOne + edgeTwo+edgeThree));
        }
        else if (edgeTwo+edgeThree>edgeOne) {
            System.out.println("Perimeter: " +(edgeOne + edgeTwo+edgeThree));
        }
    }
    public static void main(String[] args) {
        //Cannot convert boolean to int and int to boolean
        /*boolean b = true;
        int i = (int)b;

        int j = 1;
        boolean a = (boolean)j;*/
        Main object = new Main();
        object.Task19();
    }

}