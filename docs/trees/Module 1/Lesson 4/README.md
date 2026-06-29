Lesson 4 — Root, Parent, Child, Leaf

This is where trees become a structure instead of a concept.

Phase 1 — Think (No Code Yet)

A tree is not random nodes connected together.

It has roles.

Every node plays a role depending on its position.

1. Root

The starting point of the tree.

      A  ← root
     / \
    B   C
  Only ONE root in a tree
    Has no parent
2. Parent

A node that has children.

      A
     / \
    B   C
A is parent of B and C

3. Child
A node that comes from another node.

B is child of A
C is child of A

4. Leaf

A node with NO children.

    B   C  ← leaves
Leaves are endpoints
No left/right or children

5. Subtree
Any node + everything under it.

Example:

      A
     / \
    B   C
       /
      D

Subtree rooted at C:

    C
   /
  D


Key Insight

A tree is just:

A root + subtrees recursively

This is the recursive nature of trees (very important later).


## Phase 2 — Java Implementation

Now we build a real tree.

TreeNode (same as before)
public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

Build a 3-level tree
public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }
}

What you built in memory
        1   ← root
       / \
      2   3
     / \
    4   5

Now observe:

1 is root
2 is parent of 4 and 5
4 and 5 are leaves
2, 3 are internal nodes


## Important Mental Shift

You did NOT build a “tree object”.

You built:

A chain of objects connected through references

Each line:

root.left = new TreeNode(2);

is just:

“Attach a new node to this existing node”

Nothing more.

## Complexity

Building this tree:

Time: O(1) per node
Total: O(n)

No magic yet.

## Real-World Mapping

Concept     	Real Meaning
Root	        Entry point
Parent	        Container
Child	        Sub-item
Leaf	        End node
Subtree        	Section of structure


## Mini Exercises

Before we move on:

1.

In this tree:

        1
       / \
      2   3
     / \
    4   5

Answer:

Who is parent of 5? 
Who are children of 2?
Which nodes are leaves?
2.

Is node “3” a leaf? Why?

3.

What is the subtree of node “2”?


## Core Insight

A tree is a recursive structure made of nodes, where each node can be the root of its own subtree.

This is the idea that will eventually unlock recursion + DFS + BFS.
