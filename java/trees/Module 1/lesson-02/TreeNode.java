public class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

   public static void main(){
    TreeNode n = new TreeNode(10);
    n.left = new TreeNode(5);
    n.right = new TreeNode(8);
    
   }
    
}