import java.io.PrintStream;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;
public class Menu {
    Calculations calculations = new Calculations();
    public void callMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Main menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: exit");
        System.out.println("Enter id");
        int number = input.nextInt();
        switch (number){
            case 1:
                System.out.println("The balance is: "+ calculations.getBalance());
            case 2:
                calculations.withDraw();
            case 3:
                System.out.println("The balance is: " + calculations.getBalance());
            case 4:
                System.out.println("Exist");
                System.exit(1);
            default:
                System.out.println("Incorrect input");
        }
        input.close();
    }

}
