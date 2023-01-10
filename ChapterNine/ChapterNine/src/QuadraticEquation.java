public class QuadraticEquation {
    private double a =0, b =0,c =0;
    QuadraticEquation(){
    }
    QuadraticEquation(double a, double b ,double c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a){
        this.a =a;
    }
    public double getA(){
        return this.a;
    }
    public void setB(double b){
        this.b =b;
    }
    public double getB(){
        return this.b;
    }
    public void setC(double c){
        this.c =c;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        double result = 0;
        result = Math.pow(b,2) - (4 * a *c);
        return result;
    }
    public double getRoot1(){
        double result;
        if(getDiscriminant()>-1){
            result = (-1 * b) + Math.pow(0.5, getDiscriminant());
            return result;
        }
        else {
            return 0;
        }
    }
    public double getRoot2(){
        double result;
        if(getDiscriminant()>-1){
            result = (-1 * b) - Math.pow(0.5, getDiscriminant());
            return result;
        }
        else {
            return 0;
        }
    }
}
