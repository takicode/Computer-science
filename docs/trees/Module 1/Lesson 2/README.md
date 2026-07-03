## Lesson 2: The First Real Tree (Node)

Today is where Trees stop being an idea and become something you can actually build.

## First Principle

## What is a Node?
1. Intuition (no code yet)

A tree is NOT a tree. It is actually:

A collection of connected nodes.

Each node is like a object that stores:

- a value
- links to other nodes

Think of it like a person:

You
├── left hand (child)
└── right hand (child)

But in trees, we usually generalize:

left → child
right → child

or more generally:

children → list of nodes

## The Core Idea 

A node is:

Data + connections to other nodes

That’s it.

Everything else is detail.

## Java Implementation (Your First Tree Code)

Create:

package trees.lesson 02;

public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

## Note this

When you write:

TreeNode root = new TreeNode(10);

You now have:

      10
     /  \
    null null

Then:

root.left = new TreeNode(5);

Becomes:

      10
     /
    5

You are literally “building structure in memory.”

## Important Rule

A node does NOT “contain a tree”.

It only knows:“Who are my children?”

That’s what creates the tree.

## Complexity (Very simple today)

Creating a node:

Time → O(1)
Space → O(1)

No tricks yet.

## Real-World Mapping

Concept	                Reality
Node	                Object
Left/Right          	Relationships
Tree	                Connected objects

Examples:

File system folder → Node

HTML element → Node

JSON object → Node


## Quick Exercise (IMPORTANT)

1. Draw this tree in text:

TreeNode root = new TreeNode(1);

root.left = new TreeNode(2);

root.right = new TreeNode(3);

2. What does this represent?

         1
        / \
       2   3

Is it:

a sequence?
a hierarchy?
a graph?

Explain in your own words.

3. 
If I remove left and right and replace them with:

List<TreeNode> children;

What changes?

Think carefully—this is important for future graph learning.

