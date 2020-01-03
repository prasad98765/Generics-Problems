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
        printmax(value[(value.length)-1]);
        return value[(value.length)-1];
    }

    public static <E extends Comparable> void printmax(E maximumvv) {
        System.out.println("Maximum value is: "+maximumvv);
    }

    public Object FindMaximunNumber() {
        E maxPositionValue=FindMaximum(Array);
        return maxPositionValue;
    }
}
