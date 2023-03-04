package OOP.Task3;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    }

    @Override
    public double getArea() {
        return (double) (Math.pow(getWidth(), 2));
    }

    @Override
    public double getPerimeter() {
        return (double) (4 * getWidth());
    }
}
