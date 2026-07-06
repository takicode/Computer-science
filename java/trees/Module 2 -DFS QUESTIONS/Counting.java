public class Counting {
    public static void main(String[] args) {
        //  root node
        TreeNode root = new TreeNode((5));
        // level 1
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        // level 2
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(13);

        System.out.println(MaxValue(root));
    }

    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
        }
    }


    public static int MaxValue(TreeNode node){
        if (node == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(node.value,  Math.max(MaxValue(node.left), MaxValue(node.right)) ) ;
    }

}
