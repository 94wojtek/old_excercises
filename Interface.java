import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);

        System.out.println("Type width and length of rectangle: ");
        double width = inPut.nextDouble();
        double length = inPut.nextDouble();
        Figure rectangle = new Rectangle(width, length);

        System.out.println("Type circle's radius: ");
        double radius = inPut.nextDouble();
        Figure circle = new Circle(radius);

        System.out.println("Type lengths of legs: ");
        double leg1 = inPut.nextDouble();
        double leg2 = inPut.nextDouble();
        Figure triangle = new Triangle(leg1, leg2);

        inPut.close();

        Figure[] shape = {circle, rectangle, triangle};

        for (Figure object : shape) {
            if (object == triangle) {
                System.out.println("Perimeter of triangle is: " + object.getPerimeter());
                System.out.println("Area of triangle is: " + object.getArea());
            }
            else if (object == rectangle) {
                System.out.println("Perimeter of rectangle is: " + object.getPerimeter());
                System.out.println("Area of rectangle is: " + object.getArea());
            }
            else {
                System.out.println("Perimeter of circle is: " + object.getPerimeter());
                System.out.println("Area of circle is: " + object.getArea());
            }
        }
    }
}
