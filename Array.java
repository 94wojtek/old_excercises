import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        System.out.println(getAlphabeth());

        getNumbers(new Integer[] {34, 5, 18});
    }

    public static String[] getAlphabeth() {
        return new String[] {"a", "b", "c", "d", "e"};
    }

    public static Integer[] getNumbers(Integer[] array) {
        Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());
        for (int num : array) {
            System.out.println(num);
        }
        return array;
    }
}


