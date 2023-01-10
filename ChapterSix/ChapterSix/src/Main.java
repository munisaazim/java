
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {
    //Task 2
    public static int sumDigits()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value between 0 && 9999");
        int userInput = input.nextInt();
        int output, result1, result2, result3, result4, result5, result6,
                result7, result8, result9;
        if(userInput>=1000 && userInput<=9999){
            result1 = userInput%10;
            result2 = userInput/10;
            result3 = result2%10;
            result4 = result2/10;
            result5 = result4%10;
            result6 = result4/10;
            result7 = result6%10;
            result8 = result7 / 10;
            output = result1 + result3 + result5 + result7 + result8;
            System.out.println("Sum of digits: "+output);
            return output;
        }
        else if(userInput>=100 && userInput<=999){
            result1 = userInput%10;
            result2 = userInput/10;
            result3 = result2%10;
            result4 = result2/10;
            output = result1 + result3 + result4;
            System.out.println("Sum of digits: "+output);
            return output;
        }

        else if(userInput>=10&& userInput<=99){
        result1 = userInput%10;
        result2 = userInput/10;
        output = result1 + result2;
        System.out.println("Sum of digits: "+output);
        return output;
    }
        else {
            System.out.println("Sum of digits: "+userInput);
        }
        return userInput;
    }
    //Task3
    public static int reverse(int number){
        int remainder = 0, reversedNumber = 0;
        while (number!=0){
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 +remainder;
            number = number /10;
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for checking palindrome");
        int userinput = input.nextInt();
        int checkNumber = reverse(userinput);
        if(checkNumber == userinput){
            System.out.println("Palindrome number");
            return true;
        }
        else {
            System.out.println("Not palindrome number");
        }
        return false;
    }
    //Task4
    public static void displaySortedNumbers(){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter numbers");
       int userInput1 = input.nextInt();
       int userInput2 = input.nextInt();
       int userInput3 = input.nextInt();
       if(userInput1>userInput2 && userInput1>userInput3){
           if(userInput2>userInput3){
               System.out.println("In increasing order: " + userInput1 + " " + userInput2 + userInput3);
           }
           else {
               System.out.println("In increasing order: " + userInput1+ " " + userInput3 + userInput2);
           }
       }
        else if(userInput2>userInput1 && userInput3>userInput3){
            if(userInput1>userInput3){
                System.out.println("In increasing order: " + userInput2 + " " + userInput1 + " " + userInput3);
            }
            else {
                System.out.println("In increasing order: " + userInput2 + " " + userInput3 + " " +userInput1);
            }
        }
       else if(userInput3>userInput1 && userInput3>userInput2){
           if(userInput1>userInput2){
               System.out.println("In increasing order: " + userInput3 + " " + userInput1 + " "+ userInput2);
           }
           else {
               System.out.println("In increasing order: " + userInput3 + " " + userInput2 + " "+userInput1);
           }
       }
    }
    //Task16
    public static int numberOfDaysInAYear(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        int userInput = input.nextInt();
        if(userInput%400==0){
            System.out.println("The year isn't leap");
        }
        else if(userInput%4==0){
            System.out.println("The year is leap");
        }
        return 1;
    }
    //Task17
    public static void palibdromicPrime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int userInput = input.nextInt();
        int number = reverse(userInput);
        if(number%2== 0|| number % 3==0 || number % 5==0){
            System.out.println("Number isn't palindromic prime");
        }
        else {
            System.out.println("Number is palindromic prime");
        }
    }
    public static void main(String[] args) {
        Main object = new Main();
        object.palibdromicPrime();
    }
}