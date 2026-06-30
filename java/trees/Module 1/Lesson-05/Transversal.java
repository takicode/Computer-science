public class Transversal{
    public static void preorder(TreeNode node){
        if(node == null)return;
        
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(TreeNode node){
        if (node == null)return;

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public static void postorder(TreeNode node){
        if (node == null)return;
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
}