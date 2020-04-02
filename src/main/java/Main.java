import SortBinaryTreeByLevels.Node;

import static SortBinaryTreeByLevels.Kata.treeByLevels;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1))
        );
    }
}
