public class PhanTu<T extends Comparable<T>> {
    private T val;

    public PhanTu() {

    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public boolean isGreaterThan(T a) {
        return this.val.compareTo(a) > 0;
    }

}
