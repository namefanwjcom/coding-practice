import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int n: nums1) {
            for (int m : nums2) {
                map1.put(n + m, map1.getOrDefault(n + m, 0) + 1);
            }
        }
        int res = 0;
        for (int n: nums3) {
            for (int m : nums4) {
                res += map1.getOrDefault(-(n+m), 0);
            }
        }
        return res;
    }
}