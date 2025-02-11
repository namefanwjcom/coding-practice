enum Direction {
    right, down, left, up;
}

class Solution {
    public int[][] generateMatrix(int n) {
        Direction dir = Direction.right;
        int[][] matrix = new int[n][n];
        boolean[][] visit = new boolean[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                visit[row][col] = false;
            }
        }
        int row = 0, col = 0, num = 1;
        while (num <= n * n && !visit[row][col]) {
            matrix[row][col] = num++;
            visit[row][col] = true;
            switch (dir) {
                case right:
                    if (col + 1 == n || visit[row][col+1]) {
                        dir = Direction.down;
                        row++;
                    } else {
                        col++;
                    }
                    break;
                case down:
                    if (row + 1 == n || visit[row+1][col]) {
                        dir = Direction.left;
                        col--;
                    } else {
                        row++;
                    }
                    break;
                case left:
                    if (col == 0 || visit[row][col-1]) {
                        dir = Direction.up;
                        row--;
                    } else {
                        col--;
                    }
                    break;
                case up:
                    if (row == 0 || visit[row-1][col]) {
                        dir = Direction.right;
                        col++;
                    } else {
                        row--;
                    }
                    break;
            }
//            System.out.println("row: " + row + " col: " + col + " num: " + num + " dir: " + dir);
        }
        return matrix;
    }
}