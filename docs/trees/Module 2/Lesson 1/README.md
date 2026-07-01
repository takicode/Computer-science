## MODULE 2
LESSON 1 - Binary Tree Types

1. Computer Science Theory

Let's start with a question.

Imagine two libraries.

Library A
📚📚📚📚📚📚📚📚
Everything is neatly arranged.
Finding a book is easy.

Library B
📚

      📚

             📚

                    📚

                           📚

The same number of books.

But finding one takes much longer.

The difference isn't how many books there are. It's how they're arranged.

Trees are exactly the same.

Two trees can contain the same values but have very different performance because of their shape.

So Computer Science gives names to common shapes.

Before We Learn the Types

A Binary Tree only has one rule:

Each node can have at most two children.

Nothing else.

Everything we're about to learn is an additional constraint.

##  Type 1: Full Binary Tree
Definition
Every node has either:

0 children, or 2 children

Never exactly one child.

Example
             A
           /   \
          B      C
         /  \
        D    E

Check every node:

Node	Children
A	        2   
B   	    2 
C	        0 
D	        0  
E	        0 

This is a Full Binary Tree.

Counterexample
         A
        /
       B

A has exactly one child. Not full.

Easy Memory Trick

Think:

Full = Nobody has exactly one child.

## Type 2: Perfect Binary Tree
Definition
A tree is perfect if:

Every internal node has 2 children
All leaves are at the same level

Example:

          A
         / \
        B   C
       / \ / \
      D  E F  G

Notice:

Every level is completely filled.

Beautiful symmetry.

Counterexample

        A
       / \
      B   C
     /
    D

Leaves are not at the same level. Not perfect.

Memory Trick

Perfect means:

No missing nodes anywhere.

## Type 3: Complete Binary Tree

This one confuses almost everyone.

We'll slow down.

Definition

Every level is completely filled...

except possibly the last.

The last level must be filled:

From left to right.

Example

          A
         / \
        B   C
       / \ /
      D  E F

Notice:

The last level is:

D E F

No gaps.

Everything starts from the left.
Complete.

Counterexample

          A
         / \
        B   C
         \   \
          E   G

There are gaps on the left. Not complete.

Memory Trick

Imagine people entering a theater.

Everyone fills seats from the left first.

Nobody skips seats.

That's a complete binary tree.

## Type 4: Balanced Binary Tree

Definition:
The left and right subtrees have roughly the same height.
Height of the left and right subtrees of every node may differ by at most 1

(We'll define height formally in the next lesson.)

Example:

        A
       / \
      B   C
     /
    D

Still balanced.

Counterexample

     A
      \
       B
        \
         C
          \
           D

Everything leans to one side.

Not balanced.

Why Balance Matters

Balanced trees make searching much faster.

We'll prove this mathematically when we reach BSTs.

## Type 5: Degenerate (Skewed) Tree

This is the "worst-case" shape.

Example:

     A
      \
       B
        \
         C
          \
           D

This behaves almost exactly like a linked list.

Notice how we lost the branching structure.

Visualization Summary
    Full:
      ●
    /   \
    ●    ●
   / \
  ●   ●


  Perfect:
      ●
   /     \
  ●       ●
 / \     / \
●   ●   ●   ●


Complete:
      ●
   /     \
  ●       ●
 / \     /
●   ●   ●


Skewed:
       ●
        \
         ●
          \
           ●
            \
             ●
## Engineering Discussion

Now comes the interesting part.

Why do we invent these names?

Not because we like categorizing trees.

But because algorithms care about shape.

For example:

A perfectly balanced search tree might find an element in about 20 comparisons even if it contains over a million nodes.

A skewed tree with the same number of nodes could require up to a million comparisons.

Same data. Different shape. Huge difference.

We'll understand why when we study height and Binary Search Trees.

## Interview Perspective

You might be asked:

Is every perfect binary tree also full?

Think before answering.

Or:

Is every full binary tree also perfect?

These questions test whether you understand the definitions, not whether you've memorized them.

Real-World      Applications
Tree Type	    Common Use
Complete	    Heaps and priority queues
Balanced	    Search trees like AVL and Red-Black Trees
Skewed	        Worst-case scenarios to avoid
Perfect	        Mostly theoretical analysis and teaching


## Exercises
Look at each tree and classify it.

Tree 1
     A
   /   \
  B     C
 /  \
D    E

Answer: 

Full?
Perfect?
Complete?
Balanced?

Explain why for each.

Tree 2
        A
       /
     B
    /
   C

Same questions.

Tree 3
         A
       /   \
      B     C
    /  \   / \
   D    E F   G

Same questions.

Repository Update

Create:

docs/
└── trees/
└── lesson-07/
README.md

Document:

Definitions in your own words.
Memory tricks for each type.
Your answers to the exercises.
One comparison table.
🌱 Core Insight

The value stored in a tree determines what it represents. The shape of the tree determines how efficiently we can work with it.

One small change to our journey

From this lesson onward, I want you to start asking yourself two questions whenever you see a tree:

What data does this tree contain?
What shape is this tree?

Beginners usually only answer the first question.

Engineers answer both.

Take your time with the exercises. Don't guess based on appearance. Use the definitions we just learned like a checklist. That's exactly how experienced engineers reason about data structures.