package exercise240118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    static class TreeNode{

        public char val;

        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val){
            this.val=val;
        }


    }

    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    public void LevelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
             TreeNode cur=queue.poll();
             System.out.print(cur.val+" ");
             if(cur.left!=null){
                 queue.offer(cur.left);
             }
             if(cur.right!=null){
                 queue.offer(cur.right);
             }
        }

    }

    public List<List<Character>> LevelOrder2(TreeNode root){
        List<List<Character>>  retList=new ArrayList<>();
        if(root==null){
            return  retList;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();

            List<Character> list=new ArrayList<>();
            while (size!=0){
                TreeNode cur=queue.poll();
                list.add(cur.val);
                size--;
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            retList.add(list);
        }
        return retList;
    }
}
