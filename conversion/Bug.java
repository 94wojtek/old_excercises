package conversion;

public class Bug {

    protected Integer createBug(Integer num) throws NullPointerException {
        num = null;
        return num;
    }
}
