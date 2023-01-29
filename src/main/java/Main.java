import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int n = 44;
        System.out.println(Solution.climbStairs(n));

    }

    public static class Solution {
        public static int climbStairs(int n) {
            return f3(n + 1);
        }

        public static int f1(int n) {

            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return f1(n - 1) + f1(n - 2);
            }
        }

        public static int f2(int n) {
            return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5) + 0.5);
        }

        public static int f3(int n) {
            return  Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+ arr[1]})
                    .limit(n + 1)
                    .map(y -> y[0])
                    .max(Comparator.naturalOrder())
                    .get();
        }
    }
}
