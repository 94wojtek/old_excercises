package conversion;

public class Division {

    protected void divide(int inputNum1, int inputNum2) {
        if (inputNum1 == 0 || inputNum2 == 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        else {
            System.out.println(inputNum1 + " / " + inputNum2 + " = " + (double) inputNum1 / inputNum2);
        }
    }
}
