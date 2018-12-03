import java.util.Arrays;
import java.util.Scanner;

public class LoopsUse {
    public static void main(String[] args) {

        For forLoop = new For();
        forLoop.ascendFor(5);

        While whileLoop = new While();
        whileLoop.ascendWhile(5);

        System.out.println("Array");
        ArrayFacotry array = new ArrayFacotry(10);
        System.out.println(array.oneDimension().length);
        System.out.println(array.twoDimension().length);

        System.out.println();

        SeparateLineNo lineNumber = new SeparateLineNo();
        lineNumber.numberLine(1234);

        ReverseWord word = new ReverseWord();
        System.out.println(word.wordReverse("Hejka"));

        ToBinary number = new ToBinary();
        System.out.println(number.toBinary(21));
        System.out.println(number.printBinary(29));
        System.out.println();

        Palindrom pal = new Palindrom();
        System.out.println("Palindrom:");
        System.out.println(pal.isPalindrom("czesc"));
        System.out.println();

        ArrayFacotry identity = new ArrayFacotry(10);
        System.out.println(Arrays.deepToString(identity.identityMatrix()));
        System.out.println(identity.identityMatrixTry());

        ThreeNumbers numArray = new ThreeNumbers();
        int[] array2 = {2, -5, 0};
        numArray.betterThreeNumbers(array2);
        numArray.threeNumbers(array2);
        System.out.println();

        //Sort number lowest to largest in array
        BubbleSort sorting = new BubbleSort();
        Integer[] array3 = {76, 0, 123, -8, 12};
        int[] array4 = {76, 0, 123, -8, 12};
        sorting.sort(array3);
        System.out.println();
        sorting.bubbleSort(array4);

        System.out.println();
        /*
        //User input, N-long array containing N numbers
        PrintArray array5 = new PrintArray();
        Scanner inPut = new Scanner(System.in);
        System.out.println("Type N number: ");
        int n = inPut.nextInt();
        System.out.println(Arrays.toString(array5.printArray(n)));
        inPut.close();
        */

        WordInfo word1 = new WordInfo();
        word1.wordInfo("siusiak");
    }
}
