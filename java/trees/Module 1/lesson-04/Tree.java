public class Tree{

    int value;
    Tree left;
    Tree right;

    public Tree(int value) {
        this.value = value;
    }

     public static void main(String[] args) {
        // root node
        Tree root = new Tree(1);
        // level 1
        root.left = new Tree(2);
        root.right = new Tree(3);

        // level 2
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
    }

}
