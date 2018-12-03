import java.util.Arrays;

public class ThreeNumbers {

    public void betterThreeNumbers(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void threeNumbers(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            boolean isLast = i == array.length - 1;
            if (isLast) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
