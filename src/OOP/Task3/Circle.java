package OOP.Task3;

public class Circle extends Shape {
    private float radius;

    public Circle() {
        this.radius = 1;
    }

    //    How to - non-arguments constructor which will set: the color value to 'unknown', the isFilled value to false and
//    the radius value to 1

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
