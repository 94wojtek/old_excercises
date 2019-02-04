package conversion;

public class Division {

    protected void divide(int inputNum1, int inputNum2) {
        try {
            if(inputNum2 != 0) {
                System.out.println(inputNum1 + " / " + inputNum2 + " = " + (double) inputNum1 / inputNum2);
            }
            else
                throw new ArithmeticException("Can't divide by zero.");
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
