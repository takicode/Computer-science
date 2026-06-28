Lesson 2: The First Real Tree (Node)

Today is where Trees stop being an idea and become something you can actually build.

First Principle

What is a Node?
1. Intuition (no code yet)

A tree is NOT a tree.

It is actually:

A collection of connected nodes.

Each node is like a “mini object” that stores:

a value
links to other nodes

Think of it like a person:

You
├── left hand (child)
└── right hand (child)

But in trees, we usually generalize:

left → child
right → child

or more generally:

children → list of nodes
🌳 Core Idea

A node is:

Data + connections to other nodes

That’s it.

Everything else is detail.

📦 Java Implementation (Your First Tree Code)

Create:

package trees.lesson02;

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
🧠 Mental Model

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

⚠️ Important Rule

A node does NOT “contain a tree”.

It only knows:

“Who are my children?”

That’s what creates the tree.

🔍 Complexity (Very simple today)

Creating a node:

Time → O(1)
Space → O(1)

No tricks yet.

🌍 Real-World Mapping
Concept	Reality
Node	Object
Left/Right	Relationships
Tree	Connected objects

Examples:

File system folder → Node
HTML element → Node
JSON object → Node
🧪 Exercise (IMPORTANT)

Answer BEFORE we continue:

1.

Draw this tree in text:

TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
2.

What does this represent?

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

📓 docs/trees/lesson-02/README.md

Write this inside:

1. What is a Node?
2. Why it exists
3. Structure of a Node
4. Java implementation
5. My understanding
6. Questions I still have

No need to be perfect. Clarity > beauty.

💾 Commit Message

When you're done:

docs: add lesson 2 (tree node fundamentals)
java: implement basic TreeNode structure
🚀 When you're done

Reply with:

your answers to the 3 exercises
or your confusion if anything feels unclear

Then we move to:

Lesson 3 — Building Your First Tree (Root, Children, Structure)

That’s where things start to feel “alive.”