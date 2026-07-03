public class Leaf {
    public static void main(String[] args) {
        //  root node
        TreeNode root = new TreeNode((5));
        // level 1
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        // level 2
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        System.out.println(LeavesNum(root));
    }

    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){

            this.value = value;
        }
    }


    public static int LeavesNum(TreeNode node){
        if (node == null){
            return 0;
        }

        if (node.left == null && node.right == null){
            return 1;
        }

        return LeavesNum(node.left) + LeavesNum(node.right);
    }

}
