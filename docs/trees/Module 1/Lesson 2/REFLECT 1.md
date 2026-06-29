1) Answer
    1
   / \
  2   3

2) It's a hierarchy.

Notice something interesting:

1
├── 2
└── 3

Node 1 is the parent.

Nodes 2 and 3 are children.

If I asked:

"Who is the parent of 2?"

You immediately know.

If I asked:

"Who are the children of 1?"

You immediately know.

That's exactly why trees were invented.

3. Now let's discuss Question 3

Let's build it step by step.

What we currently have

Our TreeNode looks like this:

class TreeNode {

    int value;

    TreeNode left;
    TreeNode right;
}

Question:

How many children can a node have? Look carefully.

It has:left and right

How many? Exactly 2.

Now imagine I change the class.

class TreeNode {
    int value;

    List<TreeNode> children;
}

Notice something.

There is no longer: left or right

Instead we have: children

which is a list.

Now ask yourself:

How many children can a list hold?

0

1

2

3

10

100

1000

As many as we want.

Visualize it

Current node:

      A
     / \
    B   C

Maximum children:

2

New node:

        A
     / / | \ \
    B C  D E F

How many children?

Five.

Could it have ten?

Yes.

Could it have one hundred?

Also yes.

So what changed?

Originally:

TreeNode left;
TreeNode right;

This creates something called a Binary Tree.

Because:

Bi = Two

Every node can have at most two children.

When we replace them with

List<TreeNode> children;

We no longer have a Binary Tree.

Now we have a General Tree (also called an N-ary tree).

Examples:

Folder
├── Movies
├── Music
├── Pictures
├── Downloads
├── Desktop
├── Documents
└── Projects

How many children does "Folder" have?

Seven.

That isn't binary.

This leads to our next big insight

There isn't just one kind of tree.

There are many.

Tree
│
├── Binary Tree
│
├── Binary Search Tree
│
├── AVL Tree
│
├── Red-Black Tree
│
├── Trie
│
├── Heap
│
└── B-Tree

They all start with the same idea:

A node connected to other nodes.

The only thing that changes is the rules.

