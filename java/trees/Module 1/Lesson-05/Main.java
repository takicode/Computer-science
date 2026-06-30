public class Main{
    public static void main(String[] args){
        // root node
        TreeNode root =  new TreeNode(1);
        
        // level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        // level 2
        root.left.left =new TreeNode(4);
        root.left.right =new TreeNode(5);
        root.right.left =new TreeNode(6);
        root.right.right =new TreeNode(7);
        
        // level 3
        root.left.left.left =new TreeNode(8);
        root.left.left.right =new TreeNode(9);
        root.left.right.left =new TreeNode(10);
        root.left.right.right =new TreeNode(11);
    
       System.out.print("Pre-order: ");
       Transversal.preorder(root);
       System.out.println();

       System.out.print("in-order: ");
       Transversal.inorder(root);
       System.out.println();

       System.out.print("Post-order: ");
       Transversal.postorder(root);
       System.out.println();
    }
}