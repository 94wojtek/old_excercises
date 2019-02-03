package conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Multiply int number by Pi number with decimal point result and with int result
        Multiplication convert1 = new Multiplication();
        System.out.println("Type int number: ");

        try {
            int intNumber = input.nextInt();
            if (intNumber != 0) {
                convert1.multiply(intNumber);
            }
            else
                throw new IllegalArgumentException("Number must be positive.");
        }
        catch (InputMismatchException e) {
            System.err.println("Type int number only.");
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("__________________");


        //Division two int arguments with decimal point result
        Division convert2 = new Division();

        try {
            System.out.println("Type first int number: ");
            int intNum1 = input.nextInt();
            System.out.println("Type second int number: ");
            int intNum2 = input.nextInt();

            convert2.divide(intNum1, intNum2);
        }
        catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }

        input.close();

        System.out.println("__________________");



        //Passing null as an argument to type Integer method
        //Creating bug by assigment type Integer method with null argument to type int variable
        Bug bug = new Bug();

        try {
            int newBug = bug.createBug(null);
        }
        catch (NullPointerException e) {
            System.err.println("Null passed as an argument");
        }

        System.out.println("__________________");

        //Char to int assigment
        //Print result: 42
        //ASCII: asterix (*)
        char character = '*';
        int intNumber = 0;
        System.out.println(intNumber = character);
    }
}
