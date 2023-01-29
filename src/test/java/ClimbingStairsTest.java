import junit.framework.TestCase;

public class ClimbingStairsTest extends TestCase {
    public void testProfit1(){
        int n = 5;
        int actual = Main.Solution.climbStairs(n);
        int expected = 8;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        int n = 6;
        int actual = Main.Solution.climbStairs(n);
        int expected = 13;
        assertEquals(expected, actual);
    }
}