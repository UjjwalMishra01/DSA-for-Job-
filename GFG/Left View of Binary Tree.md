# Left View of Binary Tree

## Problem Link
[Left View of Binary Tree](https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1)

## Code:-

```

class Solution {

    public void solve(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        solve(node.left, list);  // Pass the same list reference
        list.add(node.val);
        solve(node.right, list); // Pass the same list reference
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        solve(root, list);  // Start with the root node
        return list;
    }
}
