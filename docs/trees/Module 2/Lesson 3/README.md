## Lesson 3: DFS vs BFS
## Phase 1: The Big Picture

Imagine you're exploring a huge mansion.

          Entrance
         /        \
      Left Wing   Right Wing
      /     \      /      \
Room1      Room2 Room3   Room4

You have two choices.

Strategy 1

Go as deep as possible.

Entrance
↓
Left Wing
↓
Room1

Only when you can't go deeper... You come back. Then continue.

This is called: Depth-First Search (DFS)

Strategy 2

Instead... Explore everything on the current floor first.

Entrance

↓

Left Wing
Right Wing

↓

Room1 Room2 Room3 Room4

This is: Breadth-First Search (BFS)

Notice.

The same tree.

Two completely different exploration strategies.

## Phase 2: Visualization

Consider this tree.

          A
        /   \
      B       C
     / \     / \
    D   E   F   G
DFS

Go down one branch before exploring another.

One possible order:

A
B
D
E
C
F
G

Does that order look familiar?

It should.

That's exactly...

Preorder Traversal


Another DFS:

D
B
E
A
F
C
G

That's...

Inorder

Another DFS:

D
E
B
F
G
C
A

That's...

Postorder

The Discovery

Preorder...

Inorder...

Postorder...

are not separate ideas.

They're all members of the same family:

Depth-First Search

The only difference is when you visit the node.

Phase 3: Breadth-First Search

Now watch BFS.

Same tree.

          A
        /   \
      B       C
     / \     / \
    D   E   F   G

Visit level by level.

A

↓

B C

↓

D E F G

Output:

A B C D E F G

Notice something.

We never go deep first.

We finish one level before starting the next.

Why Can't Recursion Naturally Do BFS?

Think carefully.

Our preorder function does this:

visit(node);

preorder(node.left);

preorder(node.right);

Suppose we're at A.

      A
     / \
    B   C

When recursion enters B...

It keeps going.

A

↓

B

↓

D

↓

...

Before it ever comes back to C.

That's exactly what DFS means.

Recursion naturally follows one branch.

But BFS wants:

A

↓

B C

↓

D E F G

It wants to remember:

"Come back later."

Recursion doesn't naturally keep siblings waiting.

We need another data structure.

Enter the Queue

Imagine standing in line at a bank.

First person in.

First person out.

Front

A B C D

Back

That's a queue -FIFO. First In. First Out.

BFS works like this.

Step 1

Queue:

A

Remove A.

Visit it.

Add its children.

Queue:

B C

Remove B.

Visit it.

Add children.

Queue:

C D E

Remove C.

Visit it.

Add children.

Queue:

D E F G

Eventually:

D

↓

E

↓

F

↓

G

Done.

Engineering Thinking

Why use DFS?

Because it's great when you want to:

explore deeply
search recursively
process hierarchical structures

Examples:

Folder systems
HTML parsing
ASTs in compilers
Recursive algorithms

Why use BFS?

Because it's great when you want:

shortest path in an unweighted graph
nearest node
level-order processing

Examples:

GPS on equal-weight roads
Social networks
Web crawlers
Your lem-in project


Did you catch that?

We're finally touching the reason you're learning all this.

Java Perspective

DFS (Preorder) - preorder(root); Simple recursion.

BFS - Requires a queue.

Later we'll write:

Queue<TreeNode> queue = new LinkedList<>();

Today, don't worry about the code.

Understand the idea.

Comparison Table 
DFS	                          BFS
Goes deep first	              Goes level by level
Uses recursion or stack	      Uses queue
Lower memory (often)	      More memory
Good for recursive problems	  Good for shortest paths



## Engineering Corner

Suppose I ask:

Find the closest hospital.

Would DFS make sense?

Imagine driving 100 km down one road...

before checking the road next to you.

Not ideal.

BFS expands outward evenly.

The first hospital it finds is guaranteed to be the closest if every road has equal cost.

This is exactly why BFS solves shortest path problems in unweighted graphs.

Connection to Your Journey

Remember your goal:

lem-in

The ants need the quickest route.

That's a shortest-path problem.

And what algorithm is famous for shortest paths in unweighted graphs?

Breadth-First Search.

Today, you've learned the first half of the story.

Later, we'll see why a graph is like a tree that has been set free. 
Trees have one parent per node and no cycles. 
Graphs can have many connections and cycles, making BFS even more valuable.

## Exercises

Use this tree:

          A
        /   \
      B       C
     / \     / \
    D   E   F   G
       /
      H
1.

Give the:

Preorder
Inorder
Postorder
2.

Give the BFS (Level Order) traversal.

3.

Without writing code:

Explain why recursion naturally performs DFS instead of BFS.

Imagine you're teaching someone who's never seen recursion before.

4. Engineering Question 

Suppose you're building a navigation app.

Every road has the same travel cost.

Would you choose:

DFS
BFS

Explain why.

## Core Insight

DFS explores one path completely before trying another. BFS explores all nearby possibilities before going deeper.

Before We Continue

The next lesson is one I've been looking forward to since the day you said:

"I want to learn Trees from beginner to professional."

We're finally arriving at the data structure that powers databases, search engines, indexes, and many interview questions:

## Binary Search Trees (BST)

Everything we've learned so far has been preparation for that moment.

Now it's your turn. Complete the exercises, and let's see if you can distinguish not just how a tree is traversed, but why one strategy is chosen over another.