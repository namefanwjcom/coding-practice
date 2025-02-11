class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        boolean flag = false;
        for (int left = 0, right = 0, sum = 0; left < nums.length; sum-=nums[left++]) {
//            System.out.println(left + " " + flag + " " + right + " " + sum);
            while (right < nums.length && sum < target) {
                sum += nums[right++];
            }
            if (sum >= target) {
                result = Math.min(result, right - left);
                flag = true;
            }
//            System.out.println(left + " " + right + " " + sum + " " + result);
        }
        if (flag) return result;
        else return 0;
    }
}