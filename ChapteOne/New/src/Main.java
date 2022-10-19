public class Main {
    public void Task1(){
        //Task 1.1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }
    public void Task2(){
        //Task 1.2
        System.out.println(" Welcome to Java");
        System.out.println(" Welcome to Java");
        System.out.println(" Welcome to Java");
        System.out.println(" Welcome to Java");
        System.out.println(" Welcome to Java");
    }
    public void Task3(){
        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");
    }
    public void Task4(){
        System.out.println("a  a^2  a^3");
        System.out.println("1  1    1");
        System.out.println("2  4    8");
        System.out.println("3  9    27");
        System.out.println("4  16   64");
    }
    public void Task5(){
        System.out.println("9.5 * 4.5 - 2.5 * 3");
        System.out.println("------------------- = " + +((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
        System.out.println("45.5 - 3.5");
    }
    public void Task6(){
        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = ");
        System.out.print((1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9));
    }
    public void Task7(){
        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = ");
        System.out.println((int)4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11));
        System.out.print("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 - 1/13) = ");
        System.out.println((int)4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 - 1/13));
    }
    public void Task8(){
        double radius = 5.5;
        double pi = 3.14;
        System.out.println("Perimeter: " + 2 * radius * pi);
        System.out.println("Area: " + radius * radius * pi);

    }
    public void Task9(){
        double width = 4.5;
        double height = 7.9;
        System.out.println("Area: " + width * height);
    }
    public void Task10(){
        System.out.println((14 / 45.30) / 1.6);
    }
    public void Task11(){
        double yearSecond = 365 * 86400;
        double birth = yearSecond / 7.0;
        double death = yearSecond / 13.0;
        double migrate = yearSecond / 45.0;
        double allCalculationOneYear = ((yearSecond * 7)  - death) + migrate;
        double allCalculationFiveYear = allCalculationOneYear * 5;
        System.out.println("Calculation of possible population for following 5 years: " + allCalculationFiveYear);
    }
    public void Task13(){
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
    }
    public static void main(String[] args) {
        Main object = new Main();
        object.Task13();
    }

}