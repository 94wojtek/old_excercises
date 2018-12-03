public class MyNumber {
    private double number;

    MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public double root() {
        return Math.sqrt(number);
    }

    public double power(double x) {
        return Math.pow(number, x);
    }

    public MyNumber pow(MyNumber pow) {
        return new MyNumber(Math.pow(number, pow.number));
    }

    public double add(double x) {
        return number += x;
    }

    public double substract(double x) {
        return number -= x;
    }
}
