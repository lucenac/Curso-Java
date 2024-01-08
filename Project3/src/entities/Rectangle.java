package entities;

public class Rectangle {

    public double w;
    public double h;
    public double area() {
        return w * h;
    }
    public double perimeter() {
        return h*2 + w*2;
    }
    public double diagonal() {
        return Math.sqrt(h*h + w*w);
    }
}
