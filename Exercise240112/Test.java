package Exercise240112;

public class Test {
    public static void printTree(BinaryTree.TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BinaryTree.TreeNode  root=binaryTree.createTree();
        binaryTree.preOrder(root);
        System.out.println();
        binaryTree.inOrder(root);
        System.out.println();
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println(binaryTree.size(root));
        System.out.println(binaryTree.size2(root));
        System.out.println(binaryTree.getLeafNodeCount2(root));
        binaryTree.getLeafNodeCount1(root);
        System.out.println(binaryTree.getKLevelNodeCount(root,1));
        System.out.println(binaryTree.getKLevelNodeCount(root,2));
        System.out.println(binaryTree.getKLevelNodeCount(root,3));
        System.out.println(binaryTree.getKLevelNodeCount(root,4));
        System.out.println(binaryTree.getHeight(root));
        binaryTree.levelOrder(root);

        System.out.println("----------------------------------------------------------");
        BinaryTree binaryTree1=new BinaryTree();
        BinaryTree.TreeNode  root1=binaryTree1.createTree();
        binaryTree1.preOrder(root1);
        System.out.println();
        System.out.println(binaryTree1.isSameTree(root,root1));
        binaryTree1.invertTree(root1);
        System.out.println(binaryTree1.invertTree(root1));

        BinaryTree.TreeNode invertedTree=binaryTree1.invertTree(root1);
        printTree(invertedTree);
        System.out.println();
        System.out.println("----------------------------------------------------------");



    }
}
