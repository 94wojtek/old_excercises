public class SeparateLineNo {

    public void numberLine(int x) {
        while (x > 0) {
            int reminder = x % 10;
            x /= 10;
            System.out.println(reminder);
        }
    }
}
