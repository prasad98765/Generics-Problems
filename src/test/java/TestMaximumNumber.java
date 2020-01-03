import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {
    @Test
    public void whenGiven1stPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        int maxNumber=t1.FindMaximum(30,20,10);
        Assert.assertEquals(30,maxNumber);
    }

   @Test
   public void whenGiven2ndPosition_ShouldReturn2ndPositionMaximum() {
       FindMaximunNumber t1=new FindMaximunNumber();
       int maxNumber=t1.FindMaximum(20,30,10);
       Assert.assertEquals(30,maxNumber);
   }

   @Test
   public void whenGiven3rdPosition_ShouldReturn3rdPositionMaximum() {
       FindMaximunNumber t1=new FindMaximunNumber();
       int maxNumber=t1.FindMaximum(20,10,30);
       Assert.assertEquals(30,maxNumber);

    }

    @Test
    public void whenGiven1stFloatPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        float maxNumber=t1.FindMaximum(30.1f,20.2f,10.3f);
        Assert.assertEquals(30.1f,maxNumber,0.0);
    }

    @Test
    public void whenGiven2stFloatPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        float maxNumber=t1.FindMaximum(20.1f,30.2f,10.3f);
        Assert.assertEquals(30.2f,maxNumber,0.0);
    }

    @Test
    public void whenGiven3stFloatPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        float maxNumber=t1.FindMaximum(20.1f,10.2f,30.3f);
        Assert.assertEquals(30.3f,maxNumber,0.0);
    }

    @Test
    public void whenGiven1stStringPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        String maxString=t1.FindMaximum("peach","apple","banana");
        Assert.assertEquals("peach",maxString);
    }

    @Test
    public void whenGiven2stStringPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        String maxString=t1.FindMaximum("Apple","peach","banana");
        Assert.assertEquals("peach",maxString);
    }

    @Test
    public void whenGiven3stStringPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        String maxString=t1.FindMaximum("banana","apple","peach");
        Assert.assertEquals("peach",maxString);
    }

    @Test
    public void whenGivenPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber(40,10,20);
        Object maxNumber = t1.FindMaximunNumber();
        Assert.assertEquals(40,maxNumber);
    }

    @Test
    public void whenGivenPosition_ShouldReturn2ndPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber(20,30,10);
        Object maxNumber = t1.FindMaximunNumber();
        Assert.assertEquals(30,maxNumber);
    }

    @Test
    public void whenGivenPosition_ShouldReturn3rdPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber(10,20,30,40);
        Object maxNumber = t1.FindMaximunNumber();
        Assert.assertEquals(40,maxNumber);
    }

    @Test
    public void whenGivenFloatPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber(30.2f,20.1f,10.3f);
        Object maxNumber=t1.FindMaximunNumber();
        Assert.assertEquals(30.2f, (Float) maxNumber,0.0);
    }

    @Test
    public void whenGivenFloatPosition_ShouldReturn2ndPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber(20.1f,30.2f,10.3f);
        Object maxNumber=t1.FindMaximunNumber();
        Assert.assertEquals(30.2f, (Float) maxNumber,0.0);
    }

    @Test
    public void whenGivenFloatPosition_ShouldReturn3rdPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber(10.1f,20.2f,30.3f);
        Object maxNumber=t1.FindMaximunNumber();
        Assert.assertEquals(30.3f, (Float) maxNumber,0.0);
    }

    @Test
    public void whenGivenStringPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber("peach","Apple","banana");
        Object maxString=t1.FindMaximunNumber();
        Assert.assertEquals("peach",maxString);
    }

    @Test
    public void whenGivenStringPosition_ShouldReturn2ndPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber("Apple","peach","banana");
        Object maxString=t1.FindMaximunNumber();
        Assert.assertEquals("peach",maxString);
    }

    @Test
    public void whenGivenStringPosition_ShouldReturn3rdPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber("Apple","banana","peach");
        Object maxString=t1.FindMaximunNumber();
        Assert.assertEquals("peach",maxString);
    }

    @Test
    public void whenGivenMoreThen3value_ShouldReturnMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        int maxNumber=t1.FindMaximum(30,20,10,50,70,80,100);
        Assert.assertEquals(100,maxNumber);
    }

}
