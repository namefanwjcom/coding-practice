import java.util.Arrays;
import java.util.Scanner;

public class TestSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new Solution().generateMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
