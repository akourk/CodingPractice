public class Solution {
    public int mySqrt(int x) {
        for (int i = 1; i <= 46340; i++) {
            if (i * i > x)
                return i - 1;
        }
        return 46340;
    }
}


// using math:
// return (int)Math.sqrt((double)x);
// or
// return (int)Math.floor(Math.sqrt(x));
