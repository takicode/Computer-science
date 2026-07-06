public class Mirror {
    public static void main(String[] args) {
        //  root node
        TreeNode root = new TreeNode((5));
        // level 1
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        // level 2
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        TreeNode mirroredRoot = MirrorNode(root);

        printTree(mirroredRoot);
    }

    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){

            this.value = value;
        }
    }


    public static TreeNode MirrorNode(TreeNode node){

       if (node  == null ){
           return null;
       }

        TreeNode leftMirrored = MirrorNode(node.left);
        TreeNode rightMirrored = MirrorNode(node.right);

        node.left = rightMirrored;
        node.right = leftMirrored;


        return node;
    }

    public static void printTree(TreeNode node) {
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.value + " ");
        printTree(node.right);
    }
}
