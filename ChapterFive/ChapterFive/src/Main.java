import java.util.*;

public class Main {
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
    public static void main(String[] args) {
        Main object = new Main();
        object.CaseStudy3();
    }
}