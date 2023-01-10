public class Main {
    public static void main(String[] args) {
       /*
       Rectangle object= new Rectangle(1,2);
       System.out.println("Perimeter: " + object.getPerimeter());
       System.out.println("Area: " + object.getArea());
        */
        /*
        Account accountObject = new Account(1122,20000);
       accountObject.setBalance(20000);
       accountObject.setId(1122);
       accountObject.setAnnualInterestRate(4.5);
       System.out.println("Balance: " +accountObject.getBalance());
       System.out.println("AnnualInterest: " + accountObject.getAnnualInterestRate());
         */
        RegularPolygon objectPolygon = new RegularPolygon();
        System.out.println("Perimeter: " + objectPolygon.getPerimeter());
        System.out.println("Area: " + objectPolygon.getArea());
        RegularPolygon objectPolygon2 = new RegularPolygon(6,4);
        System.out.println("Perimeter: " + objectPolygon2.getPerimeter());
        System.out.println("Area: " + objectPolygon2.getArea());
        RegularPolygon objectPolygon3 = new RegularPolygon(6,4, 5.6, 7.8);
        System.out.println("Perimeter: " + objectPolygon3.getPerimeter());
        System.out.println("Area: " + objectPolygon3.getArea());
    }
}