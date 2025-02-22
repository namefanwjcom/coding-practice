import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int digitSquareSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n %  10);
            n /= 10;
        }
        int res = 0;
        for (int i: list) {
            res += i * i;
        }
        return res;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            set.add(n);
            n = digitSquareSum(n);
            if (set.contains(n)) return false;
        }
        return true;
    }
}