public class Q0700 {
    public TreeNode searchBST(TreeNode n, int v) {
        if(n == null)
            return null;

        if(n.val == v)
            return n;

        return n.val > v ? searchBST(n.left, v) : searchBST(n.right, v);
    }
}

/*

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

 */

