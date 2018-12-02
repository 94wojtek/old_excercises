public class Circle implements Figure {

    private static double perimeter;
    private static double area;
    private static double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static void computePerimeter() {
        perimeter = 2 * PI * getRadius();
    }

    public static void computeArea() {
        area = PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        computePerimeter();
        return perimeter;
    }

    @Override
    public double getArea() {
        computeArea();
        return area;
    }

    /*
    public void display() {
        computePerimeter();
        computeArea();
        System.out.println("Circumference of circle is: " + getPerimeter());
        System.out.println("Area of circle is: " + getArea());
    }
    */
}
