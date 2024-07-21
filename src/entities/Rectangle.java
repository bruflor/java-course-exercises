package entities;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width * height;
    }

    public double calculatePerimeter(){
        return 2 * (width + height);
    }
    public double calculateDiagonal(){
        return Math.sqrt(width * width + height * height);
    }
}
