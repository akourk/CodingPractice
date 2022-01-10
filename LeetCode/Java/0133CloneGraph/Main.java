import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //  1 -- 2
        //  |    |
        //  4 -- 3

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n4);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        for (Node n : n1.neighbors) {
            System.out.print(n.val + " ");
        }
        for (Node n : n2.neighbors) {
            System.out.print(n.val + " ");
        }
        for (Node n : n3.neighbors) {
            System.out.print(n.val + " ");
        }
        for (Node n : n4.neighbors) {
            System.out.print(n.val + " ");
        }

        System.out.println();
        Node result = Solution.cloneGraph(n1);
        printGraph(result, 4);

    }
    private static void printGraph(Node node, int size) {
        boolean[] visited = new boolean[size];
        for (int i = 1; i <= size; i++) {
            if (!visited[i - 1]) {
                dfs(node, visited);
                System.out.println();
            }
        }
    }
    private static void dfs(Node root, boolean[] visited) {
        visited[root.val - 1] = true;
        System.out.print(root.val + " ");

        for (Node n : root.neighbors) {
            if (!visited[n.val - 1]) {
                dfs(n, visited);
            }
        }
    }
}

class Solution {
    public static Node cloneGraph(Node node) {
        if (node == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        return dfs(node, map);
    }
    private static Node dfs(Node root, HashMap<Node, Node> map) {
        if (root == null)
            return null;
        if (map.containsKey(root))
            return (map.get(root));

        Node clone = new Node(root.val, new ArrayList<>());
        map.put(root, clone);

        for (Node node : root.neighbors)
            clone.neighbors.add(dfs(node, map));

        return clone;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}