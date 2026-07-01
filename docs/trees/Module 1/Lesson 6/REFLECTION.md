## Question 1

If you're standing at C, is C the root of a tree?

C is not the root of the original tree.

It is the root of the subtree rooted at C.

That distinction becomes important later when we write recursive functions.

## Question 2

Is the structure below C a subtree?


The subtree is:

      C
     /
    D

Notice something subtle.

The subtree includes C itself.

Many beginners mistakenly think a subtree is only the descendants.

It isn't.

A subtree always includes:

the root of that subtree
everything below it


## Question 3

This one is interesting.

I asked:

If we execute:

preorder(C);

Will it visit:

only C?
C and D?
the entire original tree?


Let's reason it out.

When we call:

preorder(C);

What does the function know?

Only this:

      C
     /
    D

It has no reference to A.

Remember our lesson on references?

The function receives one reference.

That reference points here:

C

From C, can we travel upward to A?

No.

Our node has:

left
right

It does not have:

parent

So recursion can only move downward.

Therefore:

preorder(C);

visits:

C D

and then stops.

This is an extremely important observation.

Tree traversal depends entirely on the reference you start with.

If you start with:

preorder(root);

you traverse the entire tree.

If you start with:

preorder(root.left);

you only traverse the left subtree.

This idea becomes incredibly useful in algorithms.

## Exercise 2

A recursive tree algorithm works because every subtree is itself a complete tree. 
The same algorithm that works for the whole tree also works for each subtree, 
so we repeatedly apply the same logic until we reach an empty tree (null).

Notice I changed:

every subtree is itself a complete tree

It's a little more precise.