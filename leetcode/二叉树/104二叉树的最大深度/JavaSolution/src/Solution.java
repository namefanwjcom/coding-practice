import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        int res = 0;
        que.offer(root);
        while (!que.isEmpty()) {
            int n = que.size();
            for (int i = 0; i < n; i++) {
                TreeNode cur = que.poll();
                if (cur.left != null) {que.offer(cur.left);}
                if (cur.right != null) {que.offer(cur.right);}
            }
            res++;
        }
        return res;
    }
}