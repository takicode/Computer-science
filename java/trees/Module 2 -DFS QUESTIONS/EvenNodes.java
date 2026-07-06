public class EvenNodes {
    public static void main(String[] args) {
        //  root node
        TreeNode root = new TreeNode((5));
        // level 1
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        // level 2
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        System.out.println(EvenNodes(root));
    }

    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){

            this.value = value;
        }
    }


    public static int EvenNodes(TreeNode node){
        if (node == null){
            return 0;
        }


        return node.value + EvenNodes(node.left) + EvenNodes(node.right);

    }

}
