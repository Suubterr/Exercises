//https://www.codewars.com/kata/52bef5e3588c56132c0003bc/train/java

package SortBinaryTreeByLevels;


import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static List<Integer> treeByLevels(Node node) {
        List<Integer> result = new ArrayList<>();
        List<Node> nodesToIterate = new ArrayList<>();
        List<Node> tmp = new ArrayList<>();

        if(node == null) return result;

        nodesToIterate.add(node);

        while(nodesToIterate.size() > 0) {
            tmp.clear();
            for (Node n : nodesToIterate) {
                result.add(n.value);
                if (n.left != null) {
                    tmp.add(n.left);
                }
                if (n.right != null) {
                    tmp.add(n.right);
                }
            }
            nodesToIterate.clear();
            nodesToIterate.addAll(tmp);
            tmp.clear();
        }

        return result;
    }
}
