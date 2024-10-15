package src;
import com.sun.source.tree.Tree;

import java.util.*;
class Delete_node_Return_Forest
{
    class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left =  left;
        this.right = right;
    }
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete){
        Set<Integer> delset = new HashSet<>();
        for(int val:to_delete){
            delset.add(val);
        }
        List<TreeNode> forest = new ArrayList<>();
        root = removeNodes(root, delset,forest);
        if(root!=null){
            forest.add(root);
        }
        return forest;
    }

    private TreeNode removeNodes(TreeNode node, Set<Integer> delset, List<TreeNode> forest){
        if(node==null){
            return null;
        }
        node.left = removeNodes(node.left, delset,forest);
        node.right = removeNodes(node.right, delset, forest);
        if(delset.contains(node.val)){
            if(node.left!=null){
                forest.add(node.left);
            }
            if(node.right!=null){
                forest.add(node.right);
            }
            return null;

        }
        return node;

    }




}
