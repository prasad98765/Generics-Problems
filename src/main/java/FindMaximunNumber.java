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

    public static <E extends Comparable> E FindMaximum(E a,E b,E c) {
        E maxNumber = a;
        if (b.compareTo(maxNumber) > 0){
            maxNumber=b;
        }
        if (c.compareTo(maxNumber) > 0){
            maxNumber=c;
        }
        return maxNumber;
    }

    public Object FindMaximunNumber() {
        E maxPosition=FindMaximum(a,b,c);
        return maxPosition;
    }
}
