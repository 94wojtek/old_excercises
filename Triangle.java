public class Triangle implements Figure {

    private static double perimeter;
    private static double area;
    private static double leg1;
    private static double leg2;

    Triangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public static double getLeg1() {
        return leg1;
    }

    public static double getLeg2() {
        return leg2;
    }

    public static void computePerimeter() {
        double sqrLeg3 = (Math.pow(getLeg1(), 2)) + (Math.pow(getLeg2(), 2));
        double leg3 = Math.sqrt(sqrLeg3);
        perimeter = getLeg1() + getLeg2() + leg3;
    }

    public static void computeArea() {
        area = (getLeg1() * getLeg2()) / 2;
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
        System.out.println("Perimeter of triangle is: " + getPerimeter());
        System.out.println("Area of triangle is: " + getArea());
    }
    */
}
