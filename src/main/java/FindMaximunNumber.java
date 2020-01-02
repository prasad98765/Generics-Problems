import java.util.Arrays;

public class FindMaximunNumber<E extends Comparable> {
     E a,b,c;

    public FindMaximunNumber(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public FindMaximunNumber()
    {

    }

    public static <E extends Comparable> E FindMaximum(E... value) {

        E[] Array=value;
        Arrays.sort(value);
        return value[(value.length)-1];
    }

    public Object FindMaximunNumber() {
        E maxPosition=FindMaximum(a,b,c);
        return maxPosition;
    }
}
