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

Three Classic Ways to Traverse a Tree

We define traversal based on when we visit the root node.

1. Preorder Traversal
Rule:

Visit ROOT → LEFT → RIGHT

Apply it:

Tree:

        1
       / \
      2   3
     / \
    4   5

Steps:

Visit 1
Go left → 2
Go left → 4
Back → 5
Go right → 3
Result:
1 2 4 5 3
Intuition:

“I process the node BEFORE its children”

2. Inorder Traversal
Rule:

LEFT → ROOT → RIGHT

Apply it:

Steps:

Go left side first
Visit left subtree
Visit root
Visit right subtree
Result:
4 2 5 1 3
Important Insight:

In a Binary Search Tree, inorder gives sorted order.

We’ll use this heavily later.

3. Postorder Traversal
Rule:

LEFT → RIGHT → ROOT

Apply it:

Steps:

Visit left subtree
Visit right subtree
Visit root last
Result:
4 5 2 3 1
Intuition:

“I process children BEFORE the parent”

This is VERY important for:

deleting trees
freeing memory
evaluating expressions
🧠 Big Mental Model

Think of traversal as:

When do I “handle” the node?
Type	When root is visited
Preorder	Before children
Inorder	Between children
Postorder	After children
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

📦 Phase 2 — Java Implementation

We now implement traversal.

Preorder
public class TreeTraversal {

    public static void preorder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
}
Inorder
public static void inorder(TreeNode node) {
    if (node == null) return;

    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
}
Postorder
public static void postorder(TreeNode node) {
    if (node == null) return;

    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
}
🧠 What is actually happening?

Every function call:

pauses at a node
explores left
explores right
returns back

This creates something called:

Call Stack Behavior

We will go deep into this later—it is critical for recursion mastery.

🌍 Real-World Mapping
Traversal	Real Use
Preorder	Copying tree structure
Inorder	Sorted BST output
Postorder	Deleting tree
🧪 Exercise (Very Important)

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

Don’t rush. Write it step-by-step.

📁 Repository Update

Create:

docs/trees/lesson-05/README.md

Include:

Definitions of all 3 traversals
Your own explanation
The example tree
Your answers to the exercise
One confusion you still have (if any)
💡 Core Insight

Traversal is the process of visiting every node in a tree using a defined rule of order.

When you're ready, reply with your answers to the exercise.

Then we move into something powerful:

👉 Recursion on Trees (why traversal works at all)

That’s the moment where trees stop being “structure”… and become behavior.