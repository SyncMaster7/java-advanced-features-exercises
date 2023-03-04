package OOP.Task3;

public class Task3Main {
    public static void main(String[] args) {

        System.out.println("\n============= Shape =============");
        Shape shape = new Shape("Yellow", true);
        System.out.println(shape);

        System.out.println("\n============= Circle =============");
        Shape smallCircle = new Circle();
        System.out.println(smallCircle);

        Circle circlAre = new Circle("red", true, 7.2f);
        System.out.println(circlAre.getArea());

        System.out.println("\n============= Rectangle =============");
        Rectangle rectangle = new Rectangle("blue", false, 3.2f, 9.2f);
        System.out.println(rectangle.getArea() + " and " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());


        System.out.println("\n============= Square =============");
        Square square = new Square("navy", true, 3.2f);
        System.out.println(square);

    }
}
