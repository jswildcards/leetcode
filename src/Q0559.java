public class Q0559 {
    public int maxDepth(Node n) {
        if (n == null)
            return 0;

        int r = 0;
        for (Node c : n.children)
            r = Math.max(r, maxDepth(c));

        return 1 + r;
    }
}

/*

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

 */
