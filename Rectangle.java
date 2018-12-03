public class Rectangle {
    private double lenght;
    private double width;

    Rectangle() {
    }

    Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double area() {
        return getLenght() * getWidth();
    }

    public double perimeter() {
        return (2 * getLenght()) + (2 * getWidth());
    }

    public double diagonal() {
        return Math.sqrt((Math.pow(getLenght(), 2)) + (Math.pow(getWidth(), 2)));
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = width;
    }
}