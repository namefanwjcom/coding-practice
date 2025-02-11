import java.util.Arrays;
import java.util.Scanner;

public class TestSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int val = scanner.nextInt();
        System.out.println(new Solution().removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
