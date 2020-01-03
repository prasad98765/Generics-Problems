import java.util.Arrays;

public class FindMaximunNumber<E extends Comparable> {
     E[] Array;

    public FindMaximunNumber(E... value) {
        this.Array=value;
    }
    public FindMaximunNumber() {

    }

    public static <E extends Comparable> E FindMaximum(E... value) {
        E[] Array=value;
        Arrays.sort(value);
        return value[(value.length)-1];
    }

    public Object FindMaximunNumber() {
        E maxPositionValue=FindMaximum(Array);
        return maxPositionValue;
    }
}
