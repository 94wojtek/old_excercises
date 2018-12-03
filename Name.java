public class Name {
    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());

        results(0, 3);
        System.out.println(isEven(2));
        System.out.println(refraction(12));
        System.out.println(power(3));
        System.out.println(root(27));
        System.out.println(triangle(3, 4, 5));
    }

    private static String name = "Wojtek";
    public static String getName() {
        return name;
    }

    private static int age = 24;
    public static int getAge() {
        return age;
    }

    public static void results(double arg1, double arg2) {
        double sum = arg1 + arg2;
        double odds = arg1 - arg2;
        double multi = arg1 * arg2;
        if (arg1 != 0 && arg2 != 0) {
            System.out.println("Product: " + multi);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + odds);
    }

    public static boolean isEven(double arg) {
        return arg % 2 == 0;
    }

    public static boolean refraction(double arg) {
        return (arg % 3 == 0 && arg % 5 == 0);
    }

    public static double power(double arg) {
        return Math.pow(arg, 3); //metoda podnosi przesłany argument do potęgi o wartości drugiego argumentu
    }

    public static double root(double arg) {
        return Math.sqrt(arg);
    }

    public static boolean triangle(double arg1, double arg2, double arg3) {
        double longest = arg1;
        double side1 = arg2;
        double side2 = arg3;
        
        if (arg2 > arg1 && arg2 > arg3) {
            longest = arg2;
            side1 = arg1;
            side2 = arg3;
        }
        else if (arg3 > arg1 && arg3 > arg2) {
            longest = arg3;
            side1 = arg2;
            side2 = arg1;
        }

        return Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(longest, 2);
    }
}
