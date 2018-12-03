import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    public int[] printArray(int n) {
        int[] array = new int[n];
        Scanner inPut = new Scanner(System.in);
        System.out.println("Type N numbers to fill array: ");
        for (int tmp = 0; tmp <= n; tmp++) {
            for (int index = 0; index < array.length; index++) {
                int nNumbers = inPut.nextInt();
                tmp = nNumbers;
                array[index] = tmp;
            }
        }
        Arrays.sort(array);
        return array; //POPRAWNE
    }
}
