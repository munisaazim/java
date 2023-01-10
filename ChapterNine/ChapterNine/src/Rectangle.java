public class Rectangle {
    double width;
    double height;
    Rectangle(){
        this.height = 1;
        this.width = 1;
    }
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return this.height + this.width;
    }
}
