public class FindMaximunNumber {

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
}
