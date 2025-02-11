class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] squares = new int[len];
        int left = 0, right = len - 1, store = len - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left], rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                squares[store--] = leftSquare;
                left++;
            } else {
                squares[store--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}