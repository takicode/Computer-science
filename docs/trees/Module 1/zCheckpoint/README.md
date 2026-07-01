## Module 1: Trees

Trees
│
├── Foundations                    ✅
├── Nodes & References             ✅
├── Tree Terminology               ✅
├── Tree Traversals                ✅
├── Recursion on Trees             ✅
│
├──  Checkpoint 1                ◀️ TODAY
│
├── Binary Tree Types
├── Height & Depth
├── Binary Search Trees
└── ...


## Goal of Checkpoint 1
By the end of this session, I want to answer one question:

Can you reason about trees without writing code?

Because if you can think correctly, the code becomes much easier.

## Part 1: Concept Map

Let's connect everything we've learned.

                    TREE
                      │
          ┌───────────┴───────────-┐
          │                        │
       TreeNode               Traversal
          │                        │
     ┌────┴────┐          ┌────────┼────────┐
     │         │          │        │        │
    value     References  Pre     In      Post
    │         │
    │         │
    └─────────┘
        │
    Recursive Structure
        │
    Every subtree is a tree

Notice something.

Every lesson we've done builds on the previous one.

Nothing is isolated.

## Part 2: The Story of a Tree

Let's imagine this tree:

          10
         /  \
        5    15
       / \
      2   7

Suppose I hand you the reference:

TreeNode root;

Question:

What does root actually know?

Many beginners answer:

"Everything."

That's not quite right.

root only knows:

its value
where its left child is
where its right child is

It doesn't magically know the whole tree.

It reaches the rest of the tree one reference at a time.

This is why recursion works.

## Part 3: Engineering Thinking

Imagine we remove this line:

root.left = new TreeNode(5);

The tree becomes:

      10
        \
        15

Did we "delete half the tree"?

Not exactly.

We removed the only reference that connected the root to that subtree.

If no other references point to those nodes, they become unreachable.

In Java, unreachable objects are eventually cleaned up by the Garbage Collector.

This is your first glimpse of how memory management and data structures connect.

## Part 4: Challenge Questions

Don't write code.

Reason carefully.

Challenge 1

Look at this tree:

          A
         / \
        B   C
           /
          D

If we execute:

preorder(root.right);

What nodes will be printed?

Explain why.

## Challenge 2

Same tree.

If we execute:

inorder(root.left);

What will be printed?

## Challenge 3

Suppose we write:

TreeNode x = root.left;

Then:

x.value = 100;

Does:

root.left.value

become 100?

Why?

Don't just answer yes or no.

Explain it using:

variables
references
objects

## Challenge 4

Look at this:

        A
       /
      B
     /
    C

Is this still a tree?

Why?

## Challenge 5 (The Most Important)

Finish this sentence in your own words:

A tree algorithm should never care whether it is processing the whole tree or a subtree because...

This is the sentence I want you to truly own.

Engineering Reflection

Here's something I want you to think about.

At the beginning of our journey, you probably looked at a tree and saw:

Boxes connected by lines.

Now, I hope you're starting to see:

Objects
References
Recursive structure
Traversal rules
Relationships

That's how engineers see data structures.


## Core Insight

A tree is not a collection of nodes. It is a collection of relationships created by references.

That sentence captures almost everything we've learned so far.