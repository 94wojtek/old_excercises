import java.util.Scanner;

public class UsePrimitiveTypes {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);
        BinaryScanner convert = new BinaryScanner();
        System.out.println("Type new int: ");
        System.out.println(convert.scannerToBinary(inPut.nextInt()));
    }
}
