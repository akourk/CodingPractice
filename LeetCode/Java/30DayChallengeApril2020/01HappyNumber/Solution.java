public class Solution {
    public static boolean isHappy(int n) {
        int temp;
        int temp2 = 0;
        int i = 0;

        while (i < 1000) {
            while (n > 0) {
                temp = (n%10);
                temp *= temp;
                temp2 += temp;
                n /= 10;
            }

            if (temp2 == 1)
                return true;

            n = temp2;
            temp2 = 0;
            i++;
        }

        return false;
    }
}


/*
// fastest solution:

int slow = n;
int fast = n;

do {
    slow = HappySq(slow);
    fast = HappySq(HappySq(fast));
    } while (slow != fast);
    return slow == 1? true : false;
}

private int HappySq(int n) {
    int num = 0;
    while (n != 0) {
        num = num + (n%10) * (n%10);
        n = n/10;
    }
    return num;
}
 */
