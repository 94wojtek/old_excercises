package excercises.binary;

public class Binary {

    public void binaryCompute(int number) {
        StringBuilder binaryString = new StringBuilder();
        int result = 0;
        String finalResult = " ";

        if (number < 0) {
            throw new IllegalArgumentException();
        }
        else {
            do {
                result = number / 2;
                int moduloResult = number % 2;
                number = result;
                finalResult = String.valueOf(binaryString.append(moduloResult));
            }
            while (result > 0);
        }

        System.out.println(new StringBuilder(finalResult).reverse());
    }
}
