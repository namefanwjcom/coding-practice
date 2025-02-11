class Solution {
    public int removeElement(int[] nums, int val) {
        int readIndex = 0, writeIndex = 0, count = 0;
        while (readIndex < nums.length) {
            if (nums[readIndex] != val) {
                nums[writeIndex] = nums[readIndex];
                writeIndex ++;
                count ++;
            }
            readIndex ++;
        }
        return count;
    }
}