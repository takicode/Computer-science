# Breadth-First Search (BFS)

## Lesson 1: Why Does BFS Need a Queue?

Before writing any code...

I want to change how you visualize tree traversal.

## The Two Explorers

Imagine two explorers entering this tree.

            A
          /   \
         B     C
        / \   / \
       D  E  F  G

Explorer 1 say:

"Whenever I find a child, I'm immediately going there."

Explorer 2 says:

"No. I'll finish everyone on this level first."

These are two completely different strategies.

## Explorer 1 (DFS)

Watch the journey.

            A
          /   \
         B     C
        / \   / \
       D  E  F  G

He goes:

        A
        
        ↓
        
        B
        
        ↓
        
        D

No more children.

Backtrack.

    E
    
    ↓
    
    Backtrack
    
    ↓
    
    C
    
    ↓
    
    F
    
    ↓
    
    G

Traversal:

    A B D E C F G

Notice something.

He always keeps going deeper.

## Explorer 2 (BFS)

Same tree.

            A
          /   \
         B     C
        / \   / \
       D  E  F  G

He says:

"I'm not visiting D yet."

Instead:

        Visit A
        
           ↓
        
        Visit B
        
           ↓
        
        Visit C
        
           ↓
        
        Visit D
        
           ↓
        
        Visit E
        
           ↓
        
        Visit F
        
           ↓
        
        Visit G

Traversal:

A B C D E F G

He explores level by level.

Here's the Problem

Suppose we're standing at:

      A
     / \
    B   C

After visiting A, what should happen?

We need to visit:

B

and

C

But here's the catch...

When we go to B, we must remember that C still needs to be visited later.

Where do we store that information?

Think Like the Computer

Imagine the computer has just visited A.

Memory contains:

Visited:

A

Nodes waiting to be visited:

B

C

Question:

Should the computer visit:

B

first?

Yes.

After visiting B, what should still be waiting?

C

Exactly.

Now B discovers:

D

E

Who should be visited next?

Is it:

D

or

C

Don't answer too quickly.

This is the entire reason queues exist.

Let's Simulate It

Tree:

            A
          /   \
         B     C
        / \   / \
       D  E  F  G

We visit A.

The children are discovered.

Waiting list:

B

C

Who entered first?

B

So who leaves first?

B

Exactly.

Now visit B.

Discover:

D

E

Waiting list becomes:

C

D

E

Notice something.

C was already waiting.

So C gets served before D.

This is:

First In

First Out
That's a Queue

A queue behaves like people waiting at a bank.

    Alice arrives
    
    ↓
    
    Bob arrives
    
    ↓
    
    Charles arrives

Who gets served first?

Alice.

Always.

Exactly what BFS needs.

Why Not a Stack?

Suppose we used a stack instead.

Visit A.

Push:

B

C

Top of stack:

C

Now visit C.

Push:

F

G

Stack becomes:

B

F

G

Which node comes next?

G

You've accidentally started doing:

A

C

G

F

That's no longer BFS.

You're diving deep.

A stack naturally creates DFS.

## Huge Insight

The traversal order is not determined by the tree.

It is determined by the data structure holding the "next" nodes.

Data Structure	    Traversal
Stack	             DFS
Queue	             BFS

The tree never changes.

Only the "waiting room" changes.

This is a beautiful example of how choosing the right data structure changes an algorithm.

Visual Simulation

Let's simulate BFS.

Tree:

            A
          /   \
         B     C
        / \   / \
       D  E  F  G

We'll track two things:

Queue
Output
Step 1

Queue:

[A]

Output:

[]

Remove A.

Output:

A

Add children.

Queue:

[B C]
Step 2

Remove:

B

Output:

A B

Add children:

D

E

Queue:

[C D E]
Step 3

Remove:

C

Output:

A B C

Add:

F

G

Queue:

[D E F G]

Step 4

Remove:

D

Queue:

[E F G]

Step 5

Remove:

E

Queue:

[F G]

Step 6

Remove:

F

Queue:

[G]

Step 7

Remove:

G

Queue:

[]

Done.

Output:

A B C D E F G

## Engineering Insight

Notice that BFS has no recursion.

Why?

Because recursion already gives us a stack.

But BFS doesn't want a stack.

It wants a queue.

That's why most BFS algorithms are iterative.

This is one of those connections that separates memorization from understanding.

Your Turn

Use this tree.

              10
            /    \
          5       20
         / \     /  \
        2   8   15  25
             \
              9
Question 1

Write the BFS traversal.

Question 2

Fill in the queue after each node is processed.

Start:

Queue:
[10]

After processing 10:

?

After processing 5:

?

After processing 20:

?

Continue until the queue is empty.

Question 3

In one sentence:

Why does BFS require a queue instead of a stack?

Don't say "because that's how BFS works."

Explain the reason.

Question 4 

Without looking anything up...

Predict the time complexity of BFS.

Hint:

How many times does each node enter the queue?

How many times does each node leave the queue?


## Today's Core Insight

I want you to remember this sentence for years:

The order in which an algorithm explores a tree is determined more by the data structure 
managing the "next nodes" than by the tree itself.

Once you truly understand that, DFS and BFS stop being two unrelated algorithms. 
They become two different strategies built on two different data structures.