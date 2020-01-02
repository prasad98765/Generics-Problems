import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {
    @Test
    public void whenGiven1stPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        int maxNumber=t1.FindMaxNumber(30,20,10);
        Assert.assertEquals(30,maxNumber);
    }

   @Test
   public void whenGiven2ndPosition_ShouldReturn2ndPositionMaximum() {
       FindMaximunNumber t1=new FindMaximunNumber();
       int maxNumber=t1.FindMaxNumber(20,30,10);
       Assert.assertEquals(30,maxNumber);
   }

   @Test
   public void whenGiven3rdPosition_ShouldReturn3rdPositionMaximum() {
       FindMaximunNumber t1=new FindMaximunNumber();
       int maxNumber=t1.FindMaxNumber(20,10,30);
       Assert.assertEquals(30,maxNumber);

    }

    @Test
    public void whenGiven1stFloatPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        float maxNumber=t1.FindFloatMaxNumber(30.1f,20.2f,10.3f);
        Assert.assertEquals(30.1f,maxNumber,0.0);
    }

    @Test
    public void whenGiven2stFloatPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        float maxNumber=t1.FindFloatMaxNumber(20.1f,30.2f,10.3f);
        Assert.assertEquals(30.2f,maxNumber,0.0);
    }

    @Test
    public void whenGiven3stFloatPosition_ShouldReturn1stPositionMaximum() {
        FindMaximunNumber t1=new FindMaximunNumber();
        float maxNumber=t1.FindFloatMaxNumber(20.1f,10.2f,30.3f);
        Assert.assertEquals(30.3f,maxNumber,0.0);
    }
}
