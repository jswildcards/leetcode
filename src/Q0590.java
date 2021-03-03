import java.util.ArrayList;
import java.util.List;

public class Q0590 {
    List<Integer> m = new ArrayList<>();

    public List<Integer> postorder(Node n) {
        if (n == null)
            return m;

        for (Node c : n.children)
            postorder(c);
        m.add(n.val);
        return m;
    }
}

/*

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

 */
