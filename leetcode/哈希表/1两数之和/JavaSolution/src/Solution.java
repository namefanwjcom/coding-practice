import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            try {
                int j = map.get(target - nums[i]);
                if (i != j) return new int[]{i, j};
            } catch (NullPointerException e) {
            }
        }
        return null;
    }
}