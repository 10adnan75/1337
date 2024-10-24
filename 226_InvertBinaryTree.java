/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        // Recursive - Runtime: 0 ms, Memory: 38.8 MB
        /* if (root == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root; */
        
        // Iterative - Runtime: 0 ms, Memory: 38.1 MB
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }
}

// my code
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = root.left, right = root.right;
        boolean isLeft = left == null ? false : true, isRight = right == null ? false : true;
        if (!isLeft && !isRight) {
            return root;
        }
        swap(root, left, right);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public void swap(TreeNode node, TreeNode x, TreeNode y) {
        if (x == null) {
            node.left = new TreeNode(y.val, y.left, y.right);
            node.right = null;
        } else if (y == null) {
            node.right = new TreeNode(x.val, x.left, x.right);
            node.left = null;
        } else {
            node.left = y;
            node.right = x;
        }
    }
}
