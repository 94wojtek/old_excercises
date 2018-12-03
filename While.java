public class While {

    public void ascendWhile(int x) {
        System.out.println("While loop");
        int counter = 0;
        while (x > 0 && counter <= x) {
            System.out.println(counter++);
        }
    }
}
