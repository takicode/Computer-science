## Lesson 5 Tree Traversal (How to “Walk” a Tree)

Up to now, your tree has been a static structure.

Now we learn something new:

How do we visit every node in a tree in a systematic way?

That act is called traversal.

## Phase 1 — Think (No Code Yet)

Imagine this tree:

        1
       / \
      2   3
     / \
    4   5

Now imagine you are standing at the root (1).

Your task:

Visit every node exactly once.

But there is a problem:

A tree is not linear like an array.

So there is no obvious order like:

1 → 2 → 3 → 4 → 5

So we must define rules of movement.

## Three Classic Ways to Traverse a Tree

We define traversal based on when we visit the root node.

## 1. Preorder Traversal
In a preorder traversal, you visit the current node immediately, then completely traverse its left subtree, and finally traverse its right subtree. This is often used to copy or clone a tree.

Rule:
Visit ROOT → LEFT → RIGHT

Apply it:

Tree:

         1
       /   \
      2      3
     /  \    / \
    4    5   6  7
   / \   / \
  8   9 10  11

Result:
1 2 4 5 8 9 5 10 11 3 6 7

Intuition:
“I process the node BEFORE its children”

## 2. Inorder Traversal
In an inorder traversal, you go as far left as possible before printing any nodes. You visit the left subtree, then the current node, and then the right subtree. If this were a Binary Search Tree, this traversal would print the values in sorted, ascending order.

Rule:

LEFT → ROOT → RIGHT

Result:
8 4 9 2 10 5 11 1 6 3 7 

Important Insight:
In a Binary Search Tree, inorder gives sorted order.

We’ll use this heavily later.

## 3. Postorder Traversal
In a postorder traversal, you visit the left subtree, then the right subtree, and you only visit the parent node after all of its children have been processed. This is commonly used for deleting a tree or calculating its size/height (since you need the details of the children before evaluating the parent).

Rule:

LEFT → RIGHT → ROOT

Apply it:
8, 9, 4, 10, 11, 5, 2, 6, 7, 3, 1

Intuition:
“I process children BEFORE the parent”

This is VERY important for:
deleting trees
freeing memory
evaluating expressions

## Big Mental Model

Think of traversal as:

When do I “handle” the node?
Type	      When root is visited
Preorder	  Before children
Inorder       Between children
Postorder	  After children
⚠️ Why recursion fits naturally

Look at this tree:

        1
       / \
      2   3

To visit 1:

You must visit 2.

To visit 2:

You must visit its children.

This is:

self-similarity

Each subtree is a smaller tree.

That is why traversal becomes recursion.

## Phase 2 — Java Implementation

We now implement traversal.

## Preorder
public class TreeTraversal {

    public static void preorder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
}

## Inorder
public static void inorder(TreeNode node) {
    if (node == null) return;

    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
}

## Postorder
public static void postorder(TreeNode node) {
    if (node == null) return;

    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
}

What is actually happening?

Every function call:

pauses at a node
explores left
explores right
returns back

This creates something called:

Call Stack Behavior

We will go deep into this later—it is critical for recursion mastery.

## Real-World Mapping
Traversal	      Real Use
Preorder	      Copying tree structure
Inorder	          Sorted BST output
Postorder	      Deleting tree

## Exercise (Very Important)

For this tree:

        A
       / \
      B   C
     / \
    D   E

Tell me:

1. Preorder traversal
2. Inorder traversal
3. Postorder traversal

## Core Insight
Traversal is the process of visiting every node in a tree using a defined rule of order.
