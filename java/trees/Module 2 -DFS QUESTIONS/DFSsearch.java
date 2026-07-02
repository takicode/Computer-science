public class DFSsearch{
    public static void main(String[] args) {
        //  root node
       TreeNode root = new TreeNode((5));
        // level 1
       root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        // level 2
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        boolean trie = Search(root, 13);
        System.out.println(trie);
    }

    public static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
        }
    }


    public static boolean Search(TreeNode node, int target){
        if (node == null){
            return false;
        }

        if (node.value == target){
            return true;
        }

        return Search(node.left, target) || Search(node.right,target);
    }

}