package Exercise240112;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public TreeNode createTree(){
       TreeNode A=new TreeNode('A');
       TreeNode B=new TreeNode('B');
       TreeNode C=new TreeNode('C');
       TreeNode D=new TreeNode('D');
       TreeNode E=new TreeNode('E');
       TreeNode F=new TreeNode('F');
       TreeNode G=new TreeNode('G');
       TreeNode H=new TreeNode('H');
       A.left=B;
       A.right=C;
       B.left=D;
       B.right=E;
       C.left=F;
       C.right=G;
       D.left=H;
       return A;
    }

    // 前序遍历
    public void preOrder(TreeNode root) {
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    void inOrder(TreeNode root) {
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    // 后序遍历
    void postOrder(TreeNode root) {
        if (root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static int nodeSize;

    /**
     * 获取树中节点的个数：遍历思路
     *
     * @return
     */
     public int size(TreeNode root) {
        if(root==null){
            return 0;
        }
        nodeSize++ ;
        size(root.left);
        size(root.right);
        return nodeSize;
     }

    /**
     * 获取节点的个数：子问题的思路
     *
     * @param root
     * @return
     */
    public int size2(TreeNode root) {
      if(root==null){
          return 0;
      }
      int tmp=size2(root.left)+size2(root.right)+1;
      return tmp;
    }


    /*
     获取叶子节点的个数：遍历思路
     */
    public static int leafSize = 0;

     public void getLeafNodeCount1(TreeNode root) {
         if(root==null){
             return;
         }
         if(root.right==null&&root.left==null){
             leafSize++;
         }
         getLeafNodeCount1(root.left);
         getLeafNodeCount2(root.right);
    }

    /*
     获取叶子节点的个数：子问题
     */
    public int getLeafNodeCount2(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNodeCount2(root.left)+getLeafNodeCount2(root.right);
    }

    /*
    获取第K层节点的个数
     */
     public int getKLevelNodeCount(TreeNode root, int k) {
         if(root==null){
             return 0;
         }
         if(k==1){
             return 1;
         }
         return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
     }

    /*
     获取二叉树的高度
     时间复杂度：O(N)
     */
     public int getHeight(TreeNode root) {
         if(root==null){
             return 0;
         }
         int LeftHeight=getHeight(root.left);
         int RightHeight=getHeight(root.right);
         return Math.max(LeftHeight,RightHeight)+1;
     }

    public boolean isSameTree(TreeNode p, TreeNode q){
         if(p==null&&q!=null||p!=null&&q==null){
             return false;
         }
         if(p==null && q==null){
             return true;
         }
         if(p.val!=q.val){
             return false;
         }
         return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    // 检测值为value的元素是否存在
    TreeNode find(TreeNode root, char val) {
          if(root==null){
              return null;
          }
          if(root.val==val){
              return root;
          }
          TreeNode leftVal=find(root.left,val);
          if(leftVal!=null){
              return leftVal;
          }
          TreeNode rightVal=find(root.right,val);
          if(rightVal!=null){
              return rightVal;
          }
          /*if(root.left.equals(val)){
              return root.left;
          }
          if(root.right.equals(val)){
              return root.right;
          }
          return find(root.left,val)+find(root.right,val);*/
        return null;
    }

    //层序遍历
    public void levelOrder(TreeNode root) {
      if (root==null){
          return;
      }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            System.out.println(node+" ");

            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }


    }


    // 判断一棵树是不是完全二叉树
   /*  public boolean isCompleteTree(TreeNode root) {
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right!=null)
        {
            return false;
        }
         if(root.left!=null&&root.right==null)
         {
             return true;
         }
         return isCompleteTree(root.left) && isCompleteTree(root.right);

    }*/
    public TreeNode invertTree(TreeNode root) {
             if(root==null){
                 return root;
             }
           /*  if(root.left==null && root.right!=null){
                 invertTree(root.right);
             }
             if(root.right==null && root.left!=null){
                 invertTree(root.left);
             }*/
             TreeNode left=invertTree(root.left);
             TreeNode right=invertTree(root.right);
             root.right=left;
             return root;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(isSubtree(root.left,subRoot)){
            return true;
        }
        if(isSubtree(root.right,subRoot)){
            return true;
        }
        if(isSubtree(root,subRoot)){
            return true;
        }
        return false;
    }


}
