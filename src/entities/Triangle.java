package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(double xa, double xb, double xc ){
        a = xa;
        b = xb;
        c = xc;
    }

    public double calculateArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
