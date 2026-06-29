Question 1

TreeNode root = new TreeNode(10);
TreeNode child = new TreeNode(20);

root.left = child;


Let's execute the code one line at a time.

Line 1
TreeNode root = new TreeNode(10);

Memory:

root ─────► [10]

How many TreeNode objects exist?

👉 1

Line 2
TreeNode child = new TreeNode(20);

Memory:

root  ─────► [10]

child ─────► [20]

How many objects now?

👉 2

Line 3
root.left = child;

This does not create a new object.

It simply connects the first node to the second node.

Memory:

root
 │
 ▼
+----------------------+
| value = 10           |
| left ---------------+|
| right = null         ||
+----------------------+
                       |
                       ▼
              +----------------------+
child ───────►| value = 20           |
              | left = null          |
              | right = null         |
              +----------------------+

Notice something interesting.

Both

child

and

root.left

point to the same object.

There are only 2 TreeNode objects.

This is extremely important.


Question 2

It references child.

Not contains.

Not copies.

Not duplicates.

It references it.


Question 3

You answered:

null

✅ Correct.

Because we never assigned anything to

root.right

So Java automatically keeps it as

null


Memory should look like this:

                root
                 │
                 ▼
        +----------------------+
        | value = 8            |
        | left  -----┐         |
        | right ----┐│         |
        +-----------││---------+
                    ││
          ┌─────────┘└─────────┐
          ▼                    ▼

 +------------------+   +------------------+
 | value = 3        |   | value = 10       |
 | left = null      |   | left = null      |
 | right = null     |   | right = null     |
 +------------------+   | right = null     |
                        +------------------+

Now notice something.

The root variable is not the node.

The root variable simply points to the root node.

This distinction will become incredibly important when we study recursion.


🌟 The Biggest Lesson Today

I want to teach you something that many students don't learn until much later.

There are three different things here:

Variable

↓

Reference

↓

Object

For example:

TreeNode root = new TreeNode(8);

contains:

root

This is a variable.

It stores:

memory address

This is a reference.

That address points to:

TreeNode object

which lives somewhere in memory.

Three completely different things.

Most beginners think they're all the same.

They're not.

Professional Corner 👨‍💻

When a senior engineer says:

"Pass the node."

They usually mean:

"Pass the reference."

They are not copying the entire tree.

They are simply passing another reference to the same object.

That's one reason trees are efficient.

Core Insight 🌱

Today's core insight is one of the most important you'll learn this month:

Variables hold references. References point to objects. Objects reference other objects.

If this sentence becomes second nature, you'll find trees, linked lists, graphs, and object-oriented programming much easier.

Before Lesson 4

I have one question for you.

Suppose we write:

TreeNode a = new TreeNode(5);

TreeNode b = a;

Without running the program:

How many TreeNode objects exist?
If I change:
b.value = 100;

what will a.value be?

Don't guess. Think through it using today's mental model of variables → references → objects.

If you can answer that correctly, you've crossed one of the biggest conceptual hurdles in Java, and we'll be ready to continue building our first real tree. 🌳