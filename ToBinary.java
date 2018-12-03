public class ToBinary {

    public Integer toBinary(int x) {
        return Integer.valueOf(Integer.toBinaryString(x));
    }

    /*
    public int myToBinary(int x) {

        while (x > 0) {
            int result = x % 2;
            x /= 2;
        }
        return x;
    }
    */

    public String printBinary(int number) {
        String binaryReversed = "";
        while (number > 0) {
            binaryReversed += number % 2;
            number /= 2;
        }
        return new StringBuilder(binaryReversed).reverse().toString();
    }
}
