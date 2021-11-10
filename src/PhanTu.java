import java.util.List;

public class PhanTu<T extends Comparable<T>> {
    private T val;

    public PhanTu() {

    }

    public PhanTu(T val) {
        this.val = val;
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

    public void sort(List<T> arr) {
        // Dùng insertion sort
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j > 0; j--) {
                PhanTu<T> phanTuTruoc = new PhanTu<>(arr.get(j - 1));
                if (phanTuTruoc.isGreaterThan(arr.get(j))) {
                    // Nếu phần tử trước > phần tử sau thì swap
                    T tmp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, tmp);
                } else {
                    break;
                }
            }
        }
    }

}
