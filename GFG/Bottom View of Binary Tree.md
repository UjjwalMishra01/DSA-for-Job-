#Bottom View of Binary Tree 

## Problem Link
[Bottom View of Binary Tree](https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1)

## Code:

```

public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        // TreeMap stores (Horizontal Distance -> Node's value)
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        
        root.hd = 0; // Set horizontal distance of root as 0
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.hd;

            // Update the map with the latest (bottom-most) node at this horizontal distance
            map.put(hd, temp.data);

            if (temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }

        // Extract values from TreeMap and return as list
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }
