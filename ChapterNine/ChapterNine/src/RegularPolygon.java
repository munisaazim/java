public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    RegularPolygon(){

    }
    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public void setN(int n){
        this.n=n;
    }
    public int getN(){
        return this.n;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return this.x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return this.y;
    }
    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        double upper = n * Math.pow(side, 2);
        double lower = 4 * Math.tan(3.14/n);
        double result = upper/lower;
        return result;
    }
}
