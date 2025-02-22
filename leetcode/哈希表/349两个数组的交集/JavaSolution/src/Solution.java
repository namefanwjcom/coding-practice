import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    final int MAX_VALUE = 1005;
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] in1 = new boolean[MAX_VALUE];
        Arrays.fill(in1, false);
        for (int n: nums1) {
            in1[n] = true;
        }
        int[] result = new int[MAX_VALUE];
        Arrays.fill(result, 0);
        boolean[] visit = new boolean[MAX_VALUE];
        Arrays.fill(visit, false);
        int count = 0;
        for (int n: nums2) {
            if (in1[n] && !visit[n]) {
                result[count++] = n;
                visit[n] = true;
            }
        }
        return Arrays.copyOf(result, count);
    }
}

class Solution2 {
    final int MAX_VALUE = 1005;
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n: nums1) {
            set1.add(n);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums2) {
            if (set1.contains(n)) {
                set.add(n);
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int n: set) {
            result[i++] = n;
        }
        return result;
    }
}