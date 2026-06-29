Let's take a detour

What Actually Happens in Memory?


Phase 1: Imagine a Classroom

Imagine you're in a classroom.

Every student has:
A name
A chair number

For example:

Student
---------
Name: John
Chair: 5

The teacher doesn't carry the student around.

Instead, the teacher says:

"Go to Chair 5."

The chair number tells you where to find John.

Phase 2: Computers Think the Same Way

When you create an object in Java:

TreeNode root = new TreeNode(10);

Most beginners think this creates the entire object inside root.

It doesn't.

Think of it like this:

Variable            Memory
---------           -----------------
root    --------->  TreeNode
                    value = 10
                    left = null
                    right = null

root does not hold the object.

It holds a reference (an address) to where the object lives in memory.

This idea is one of the most important concepts in Java.
root is present in the stack memory while others are present in the heap memory

Phase 3: Building a Connection

Now imagine:

root.left = new TreeNode(5);

Memory now looks like this:

root
 │
 ▼
+-------------------+
| value = 10        |
| left ----------+  |
| right = null   |  |
+----------------|--+
                 │
                 ▼
        +-------------------+
        | value = 5         |
        | left = null       |
        | right = null      |
        +-------------------+

Notice something beautiful.

The first node doesn't contain the second node.

It simply knows where it is.

That's what a reference is.

## The Big Idea

A tree is not one object.

A tree is a network of objects connected by references.

This is why we said in the previous lesson:

A tree is many nodes connected by relationships.

Now you can see how those relationships are created.

## Java Code

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

Notice something.

Where did we create the children?

Nowhere.

The node simply has the ability to point to children.

Initially:

left  = null
right = null

Only when we assign them do the relationships appear.

## Exercise 1

Look at this code:

TreeNode root = new TreeNode(10);
TreeNode child = new TreeNode(20);

root.left = child;

Without running it, answer:

How many TreeNode objects exist in memory?
Does root contain child, or does it reference child?
What value is stored in root.right?

Explain your reasoning.

Exercise 2 (Drawing)

Draw the memory after this code executes:

TreeNode root = new TreeNode(8);

root.left = new TreeNode(3);

root.right = new TreeNode(10);

Use boxes and arrows like we did in the lesson.

Repository Update

Create:

docs/
└── trees/
    └── lesson-03/
        README.md

Document the lesson using this outline:

What is a reference?
Where do objects live?
How are nodes connected?
Why is a tree many objects instead of one object?
Memory diagram.
Reflection.
Core Insight 🌱

Nodes are connected by references, not by physically containing one another.

That sentence is going to unlock not only trees, but also linked lists, graphs, and many object-oriented designs later in our journey.

Before we move to Lesson 4

Reply with your answers to the two exercises.

I won't just check whether they're "right." I'll help you build the mental model of memory that professional developers use when reasoning about data structures. Once that clicks, every tree algorithm becomes much easier to understand.