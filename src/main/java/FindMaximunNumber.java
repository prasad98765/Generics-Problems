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

    public Float FindFloatMaxNumber(Float a, Float b, Float c) {
        Float maxNumber = a;
        if (b.compareTo(maxNumber) > 0){
            maxNumber=b;
        }
        if (c.compareTo(maxNumber) > 0){
            maxNumber=c;
        }
        return maxNumber;
    }

    public String FindStringMax(String a, String b, String c) {
        String maxNumber = a;
        if (b.compareTo(maxNumber) > 0){
            maxNumber=b;
        }
        if (c.compareTo(maxNumber) > 0){
            maxNumber=c;
        }
        return maxNumber;
    }
}
