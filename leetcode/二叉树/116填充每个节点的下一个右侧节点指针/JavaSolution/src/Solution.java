import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int n = que.size();
            Node prev = null;
            for (int i = 0; i < n; i++) {
                Node cur = que.poll();
                if (i > 0) {prev.next = cur;}
                if (cur.left != null) {que.offer(cur.left);}
                if (cur.right != null) {que.offer(cur.right);}
                prev = cur;
            }
            prev.next = null;
        }
        return root;
    }
}