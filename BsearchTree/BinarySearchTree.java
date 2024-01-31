package BsearchTree;

public class BinarySearchTree {
    static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }
    public TreeNode root;


    public boolean search(int val){
        TreeNode cur=root;
        while (cur!=null){
           if(cur.val<val){
               cur=cur.right;
           }else if(cur.val>val){
               cur=cur.left;
           }else {
               return true;
           }
        }
        return false;
    }

  public void insert(int val){
        if(root==null){
          root=new TreeNode(val);
          return;
        }
        TreeNode cur=root;
        TreeNode parent=null;
        while (cur!=null){
            if(cur.val<val){
                parent=cur;
                cur=cur.right;
            }else if(cur.val>val){
                parent=cur;
                cur=cur.left;
            }else {
                return;
            }
        }
        TreeNode node=new TreeNode(val);
        if(parent.val<val){
            parent.right=node;
        }else {
            parent.left=node;
        }
  }

    public void remove(int val) {
        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null) {
            if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else if(cur.val > val) {
                parent = cur;
                cur = cur.left;
            }else {
                removeNode(parent,cur);
                return;
            }
        }
    }
    private void removeNode(TreeNode parent, TreeNode cur) {
        // 如果当前节点的左子树为空
        if (cur.left == null) {
            if (cur == root) {
                // 如果当前节点是根节点，将根节点指向其右子节点
                root = cur.right;
            } else if (cur == parent.left) {
                // 如果当前节点是父节点的左子节点，将父节点的左子节点指向当前节点的右子节点
                parent.left = cur.right;
            } else {
                // 如果当前节点是父节点的右子节点，将父节点的右子节点指向当前节点的右子节点
                parent.right = cur.right;
            }
        }
        // 如果当前节点的右子树为空
        else if (cur.right == null) {
            if (cur == root) {
                // 如果当前节点是根节点，将根节点指向其左子节点
                root = cur.left;
            } else if (cur == parent.left) {
                // 如果当前节点是父节点的左子节点，将父节点的左子节点指向当前节点的左子节点
                parent.left = cur.left;
            } else {
                // 如果当前节点是父节点的右子节点，将父节点的右子节点指向当前节点的左子节点
                parent.right = cur.left;
            }
        }
        // 如果当前节点既有左子树又有右子树
        else {
            TreeNode t = cur.right;
            TreeNode tp = cur;
            // 找到当前节点右子树中最小的节点
            while (t.left != null) {
                tp = t;
                t = t.left;
            }
            // 将当前节点的值替换为右子树中最小节点的值
            cur.val = t.val;

            if (tp.left == t) {
                // 如果最小节点是其父节点的左子节点，将父节点的左子节点指向最小节点的右子节点
                tp.left = t.right;
            } else {
                // 如果最小节点是其父节点的右子节点，将父节点的右子节点指向最小节点的右子节点
                tp.right = t.right;
            }
        }
    }

}
