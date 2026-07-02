public class Counting {
    public static void main(String[] args) {
        //  root node
        DFSsearch.TreeNode root = new DFSsearch.TreeNode((5));
        // level 1
        root.left = new DFSsearch.TreeNode(3);
        root.right = new DFSsearch.TreeNode(8);

        // level 2
        root.left.left = new DFSsearch.TreeNode(1);
        root.left.right = new DFSsearch.TreeNode(4);

        System.out.println(Count(root));
    }

    public static class TreeNode{
        int value;
        DFSsearch.TreeNode left;
        DFSsearch.TreeNode right;

        TreeNode(int value){
            this.value = value;
        }
    }


    public static int Count(DFSsearch.TreeNode node){
        if (node == null){
            return 0;
        }

        return 1 + Count(node.left) + Count(node.right);
    }

}
