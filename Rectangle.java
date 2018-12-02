public class Rectangle implements Figure {

    private static double perimeter;
    private static double area;
    private static double width;
    private static double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public static double getWidth() {
        return width;
    }

    public static double getLength() {
        return length;
    }

    public static void computePerimeter() {
        perimeter = (2 * getWidth()) + (2 * getLength());
    }

    public static void computeArea() {
        area = getWidth() * getLength();
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
    //alternative display method
    
    public void display() {
        computeArea();
        computePerimeter();
        System.out.println("Perimeter of rectangle is: " + getPerimeter());
        System.out.println("Area of rectangle is: " + getArea());
    }
    */
}
