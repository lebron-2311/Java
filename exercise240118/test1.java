package exercise240118;



public class test1 {

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BinaryTree.TreeNode root=binaryTree.createTree();
        binaryTree.LevelOrder(root);
        System.out.println();
        binaryTree.LevelOrder(root);

    }
}
