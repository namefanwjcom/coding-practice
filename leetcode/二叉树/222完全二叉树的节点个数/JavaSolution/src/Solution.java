import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftLen = 0, rightLen = 0;
        for (TreeNode curr = root; curr != null; curr = curr.left) {leftLen++;}
        for (TreeNode curr = root; curr != null; curr = curr.right) {rightLen++;}
        if (leftLen == rightLen) return (1 << leftLen) - 1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}