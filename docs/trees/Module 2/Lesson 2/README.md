# Lesson 2: Height, Depth, Level & Distance

## 1. Computer Science Theory

Imagine you're in a company.

CEO
│
├── Manager
│   ├── Engineer
│   └── Designer
│
└── HR

There are two ways to describe someone's position.

You can ask:

How far is this person from the CEO?

Or:

How far is this person from the lowest employee beneath them?

These are different questions.

Trees have the same idea.

The Four Measurements
We will learn:

Level
Depth
Height
Distance

Each answers a different question.

## 1. Level

Question:
How far is this node from the root?

Consider:

        A
       / \
      B   C
     / \
    D   E

Levels:

Level 0
A

Level 1
B      C

Level 2
D    E

Notice:

The root is always Level 0 in our course.

(Some books use Level 1. We'll consistently use Level 0 because it aligns well with programming.)

Memory Trick

Think of a building.

Ground Floor = Level 0

First Floor = Level 1

Second Floor = Level 2


## 2. Depth

Question:

How many edges must I travel from the root to reach this node?

Same tree:

        A
       / \
      B   C
     / \
    D   E

Depths:

Node	Depth
A	     0
B	     1
C	     1
D	     2
E	     2

Notice something?

With our convention:

Level = Depth

So why have both terms?

Because they emphasize different ideas.

Level groups nodes.
Depth measures one specific node.


## 3. Height

This is where students usually get confused.

Question:

How far is this node from its deepest descendant?

Notice...

Height is measured downward.

Example:

        A
       / \
      B   C
     / \
    D   E

Let's start from the leaves.

D

How many edges below D?

None.

Height = 0

E

Same.

Height = 0

C

Also a leaf.

Height = 0

B

Longest path:

B → D

One edge.

Height = 1

A

Longest path:

A → B → D

Two edges.

Height = 2

Table:

Node	Height
D	      0
E	      0
C	      0
B	      1
A	      2

## The Big Difference

Depth asks:

"How far from the root?"

Height asks:

"How far to the deepest leaf?"

One looks up.

One looks down.

## 4. Distance

Question:

How many edges separate two nodes?

Example:

Distance between:

D and E

Path:

D → B → E

Distance:

2

Distance between:

D and C

Path:

D → B → A → C

Distance:

3

Visualization
       A
      / \
     /   \
    B     C
   / \
  D   E

Depth:
A = 0
B = 1
C = 1
D = 2
E = 2

Height:
D = 0
E = 0
C = 0
B = 1
A = 2

## The Recursive Nature of Height

Here's something beautiful.

How do we calculate the height of A?

We don't manually count.

We say:

Height(A) = 1 + max(height(left), height(right))

That gives us:

height(A) = 1 + max(height(B), height(C))

Do you recognize this pattern?

It's recursion again.

Trees keep rewarding recursive thinking.

## Let's break it down better

Height(A): This is the final target—the height of the current node you are standing on (Node A).

1 + ...: The 1 represents the single edge connecting Node A to its immediate children. You are counting yourself.

max(..., ...): A node can have a left subtree and a right subtree. Their heights might be different. 
You only care about the tallest path, so you pick the maximum value between the two.

height(left): The height of the left child's subtree.

height(right): The height of the right child's subtree.


1. Bottom Layer: The Leaves (D, E, C)
    By definition, a leaf node has no children. If a child doesn't exist (null), its height is considered -1.$
    Height(D) = 1 + max(-1, -1) = 1 - 1 = 0   
    Height(E) = 0
    Height(C) = 0

2. Middle Layer: Node B
    Now we apply the formula to B.  
    B looks at its left child (D) and right child (E):
    Left child height (D) = 0 
    Right child height (E) = 0
               Height(B) = 1 + max(0, 0)
               Height(B) = 1 + 0 = 1 

3. Top Layer: The Root (A)
   Finally, we apply the formula to A. A looks at its left child (B) and right child (C):
   Left child height (B) = 1Right child height (C) = 0  
   Height(A) = 1 + max(1, 0) 
   Since 1 is greater than 0, the max(1, 0) becomes 1:
   Height(A) = 1 + 1 = 2

##  Java Implementation

Let's implement height.

public static int height(TreeNode node) {

    if (node == null) {
        return -1;
    }

    return 1 + Math.max(
            height(node.left),
            height(node.right)
    );
    }
You know why -1 is used

Make sense? 
Perfect.

If we returned 0 for null, every height would be off by one.

Different textbooks use different conventions, but we'll stay consistent with the height measured in edges.

## Engineering Discussion

Why do we care about height?

Because many tree operations depend on it.

Searching: O(height)

Insertion: O(height)

Deletion: O(height)

Notice...

Not: O(number of nodes)

Height determines performance.

Interview Perspective

Very common questions:

What's the height of an empty tree?

or

Why does the base case return -1?

Understanding the convention matters more than memorizing the answer.

Real-World Applications

Height appears everywhere:

File system directory depth
Organization hierarchies
HTML DOM nesting
Decision trees
Search trees

Whenever something is hierarchical, someone eventually asks:

"How deep is it?"

## Exercises

Use this tree:

            A
          /   \
         B     C
        / \     \
       D   E     F
          /
         G
1.

Give the depth of:

A = 0
C = 1
E = 2
G = 3
2.

Give the height of:

G = 0
E = 1
B = 2
A = 3

3.
What is the distance between:

D and G = 3
G and F =5

4. Thinking Question

Why do you think search complexity is written as:

O(height) instead of: O(number of nodes)

Don't worry if your answer isn't perfect. I want to hear your reasoning. 

## Core Insight

Depth measures how far a node is from the root. Height measures how far a node is from its deepest descendant.

This distinction is one of the foundations of efficient tree algorithms.

A small preview

After this lesson, we'll move to DFS vs BFS.

At that point, you'll realize something interesting:

Preorder, Inorder, and Postorder are all members of one family.

BFS belongs to a completely different family.

Understanding why is one of the most satisfying moments in tree algorithms.