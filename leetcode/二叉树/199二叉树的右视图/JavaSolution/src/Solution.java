import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int n = que.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode cur = que.poll();
                if (i == n - 1) {res.add(cur.val);}
                if (cur.left != null) {que.offer(cur.left);}
                if (cur.right != null) {que.offer(cur.right);}
            }
        }
        return res;
    }
}