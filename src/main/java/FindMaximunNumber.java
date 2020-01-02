public class FindMaximunNumber {

    public Integer FindMaxNumber(Integer a, Integer b, Integer c) {
        Integer maxNumber = a;
        if (b.compareTo(maxNumber) > 0){
            maxNumber=b;
        }
        if (c.compareTo(maxNumber) > 0){
            maxNumber=c;
        }
        return maxNumber;
    }
}
