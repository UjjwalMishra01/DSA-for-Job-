package src;

import java.util.ArrayList;
import java.util.List;

public class leaf_node_pair {
    int count=0;
    int distance;
    class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
        public Node(int item, Node right, Node left){
           key = item;
           this.left = left;
           this.right = right;
        }

    }
    public class BinaryTree{
        Node root;
        BinaryTree(){root=null;}

    }
    public int countPairs(Node root, int distance) {
        this.distance = distance;
        dfs(root);
      return count;
    }
    private List<Integer> dfs(Node node){
        if(node == null){
            return new ArrayList<>();
        }
        if(node.left==null && node.right == null){
            List<Integer> leafdistance = new ArrayList<>();
            leafdistance.add(0);
            return leafdistance;
        }
        List<Integer> leftdistance = dfs(node.left);
        List<Integer> rightdistance = dfs(node.right);

        for(int leftDist: leftdistance){
            for(int rightDist:rightdistance){
                if(leftDist+rightDist+2<=distance){
                    count++;
                }
            }
        }
        List<Integer> currentDistances = new ArrayList<>();
        for(int dist:leftdistance){
            currentDistances.add(dist+1);
        }
        for(int dist:rightdistance){
            currentDistances.add(dist+1);
        }
        return currentDistances;
    }


}
