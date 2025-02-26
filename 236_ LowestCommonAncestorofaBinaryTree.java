/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return right != null ? right : left;
    }
}

// My code
// Feb 26, 2025, 2:14 PM, US
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Left child
        TreeNode leftChild = lowestCommonAncestor(root.left, p, q);

        // Right child
        TreeNode rightChild = lowestCommonAncestor(root.right, p, q);

        if (leftChild == null) {
            return rightChild;
        }

        if (rightChild == null) {
            return leftChild;
        }

        return root;
    }
}

// Brute Force
// Feb 26, 2025, 2:42 PM, US
/*
        1
       /  \
      2    3
     / \    \
    4   5    6

lca(4,6): 1
    path from root to 4: 1->2->4, path1[] = {1, 2, 4}
    path from root to 6: 1->3->6, path2[] = {1, 3, 6}

lca(4,5): 2
    path from root to 4: 1->2->4, path1[] = {1, 2, 4}
    path from root to 5: 1->2->5, path2[] = {1, 2, 5}

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathOfP = getPathFromRoot(root, p);
        List<TreeNode> pathOfQ = getPathFromRoot(root, q);

        TreeNode ans = root;

        for (int i=0; i<Math.min(pathOfP.size(), pathOfQ.size()); i++) {
            
            if (pathOfP.get(i) != pathOfQ.get(i)) {
                break;
            }

            ans = pathOfP.get(i);
        }

        return ans;
    }

    public List<TreeNode> getPathFromRoot(TreeNode root, TreeNode node) {
        List<TreeNode> pathFromRoot = new ArrayList<>();
        dfs(root, node, pathFromRoot);
        return pathFromRoot;
    }

    public boolean dfs(TreeNode root, TreeNode node, List<TreeNode> path) {
        if (root == null) {
            return false;
        } 

        path.add(root);

        if (root == node) {
            return true;
        }

        if (dfs(root.left, node, path) || (dfs(root.right, node, path))) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
}
