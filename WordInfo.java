public class WordInfo {

    public static boolean isPalindrom(String word) {
        if(word.equals(new StringBuilder(word).reverse().toString())) {
            return true;
        }

        return false;
    }

    public static String wordReverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void wordInfo(String word) {
        System.out.println(word.length());
        System.out.println(isPalindrom(word));
        System.out.println(wordReverse(word));


    }
}
