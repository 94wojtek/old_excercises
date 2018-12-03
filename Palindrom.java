public class Palindrom {

    public boolean isPalindrom(String word) {
        if(word.equals(new StringBuilder(word).reverse().toString())) {
            return true;
        }

        return false;
    }
}
